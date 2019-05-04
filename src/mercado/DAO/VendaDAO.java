
package mercado.DAO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import mercado.Modelo.Venda;
import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import mercado.Modelo.Produto;

public class VendaDAO {
    
    
    
    
    public boolean CadListCompra(int codvend, String codProduto,int qtproduto) {
               
        
        try {          
             Connection c = (Connection) new FabricaConexoes().getConnection(); 
             String SqlBusca = "SELECT CODVENDA,CODPRODUTO,QTPRODUTOS from compra where CODVENDA=? and CODPRODUTO=?";
             String SqlInsert = "insert into compra(CODVENDA,CODPRODUTO,QTPRODUTOS)values(?,?,?)";
             String SqlUpdate = "update compra set QTPRODUTOS =? where CODVENDA=? and CODPRODUTO=? ";
             PreparedStatement stmt1 = (PreparedStatement) c.prepareStatement(SqlBusca);
             PreparedStatement stmt2 = (PreparedStatement) c.prepareStatement(SqlUpdate);
             PreparedStatement stmt3 = (PreparedStatement) c.prepareStatement(SqlInsert);
             
             stmt1.setInt(1, codvend);
             stmt1.setString(2, codProduto);
             ResultSet rs = stmt1.executeQuery();
             
             if(rs.next()){
                int quant=0;
                quant =rs.getInt("QTPRODUTOS");
                System.out.println(rs.getInt("QTPRODUTOS"));
                stmt2.setInt(1, quant+qtproduto);
                stmt2.setInt(2, codvend);
                stmt2.setString(3, codProduto);
                stmt2.executeUpdate();
             }else{
                stmt3.setInt(1,codvend);
                stmt3.setString(2,codProduto);
                stmt3.setInt(3, qtproduto);
                stmt3.execute();
             }
            
             stmt1.close();
             stmt2.close();
             stmt3.close();
             c.close();
        }catch(SQLException e){
           e.printStackTrace();
        }
        return true;
    }


    public boolean CadVenda(Venda lista) {
        ArrayList<Produto> listaprod = lista.getProdutos();
         try {          
             Connection c = (Connection) new FabricaConexoes().getConnection();            
             String SqlInsert = "insert into venda(DATAHORA,CPF,RG,CLI_CPF,valorTotal)values(?,?,?,?,?)";
             String sqlbusc = "select CODVENDA from venda";
           
             
             
             
             
             
             PreparedStatement stmt1 = (PreparedStatement) c.prepareStatement(SqlInsert);
             PreparedStatement stmt2 = (PreparedStatement) c.prepareStatement(sqlbusc);
             String aux;
             String data; 
            
             aux= data= (new java.text.SimpleDateFormat("yyyy/MM/dd").format(System.currentTimeMillis()));
             stmt1.setString(1 ,data+" "+getHora());
             stmt1.setString(2,lista.getCpfve());
             stmt1.setString(3,lista.getRgve());
             stmt1.setString(4,lista.getCpfcli());
             stmt1.setFloat(5,lista.getValorTotal() );
             stmt1.execute();             
             stmt1.close();
           
             
             
            // stmt2.setString(1, aux);
             ResultSet rs = stmt2.executeQuery();
              
             if(rs.last()){
                int cod;
                cod = rs.getInt("CODVENDA");
                for(Produto l : listaprod){
                CadListCompra(cod, l.getCodigoBarra(), l.getQtparc());
                }
             }else{
              
             }
               c.close();
             return true;
             
         }catch(SQLException e){
           e.printStackTrace();
           return false;
         }
    
    
    }
    
        private String getHora() {  
          
        // cria um StringBuilder  
        StringBuilder sb = new StringBuilder();  
      
        // cria um GregorianCalendar que vai conter a hora atual  
        GregorianCalendar d = new GregorianCalendar();  
          
        // anexa do StringBuilder os dados da hora  
        sb.append( d.get( GregorianCalendar.HOUR_OF_DAY ) );  
        sb.append( ":" );  
        sb.append( d.get( GregorianCalendar.MINUTE ) );  
        sb.append( ":" );  
        sb.append( d.get( GregorianCalendar.SECOND ) );  
          
        // retorna a String do StringBuilder  
        return sb.toString();  
          
    }

    public Venda pesquisaVenda(int codigov) throws Exception {
       Venda venda = new Venda();
       ArrayList<Produto> produto = null ;
       Produto prod;
       try {          
             Connection c = (Connection) new FabricaConexoes().getConnection(); 
             String SqlBuscaVenda = "{call pesqvenda(?)} ";
             
             String SqlBuscaproduto = "{call pesquisaprodvenda(?)}";
             
             
             PreparedStatement stmt =  (PreparedStatement) c.prepareCall(SqlBuscaVenda);
             stmt.setInt(1, codigov);
             stmt.execute();
             ResultSet rsvenda = stmt.executeQuery();
             if(rsvenda.next()){
                  venda.setDateHisto(String.valueOf(rsvenda.getTimestamp("DATAHORA")));
                  venda.setCpfve(rsvenda.getString("CPF"));
                  venda.setRgve(rsvenda.getString("RG"));
                  venda.setCpfcli(rsvenda.getString("CLI_CPF"));
                  venda.setValorTotal(rsvenda.getFloat("valortotal"));
            
             
             produto  = new ArrayList<Produto>(); 
             PreparedStatement stmt2 =  (PreparedStatement) c.prepareCall(SqlBuscaproduto);
             stmt2.setInt(1, codigov);
             stmt2.execute();
             ResultSet rsprod = stmt2.executeQuery();
             while(rsprod.next()){
                  prod =  new Produto(); 
                  prod.setNome(rsprod.getString("nome"));
                  prod.setCodigoBarra(rsprod.getString("codproduto"));
                  prod.setQtparc(rsprod.getInt("qtprodutos"));
                  prod.setValorVenda(rsprod.getFloat("valorvenda"));
                  System.out.println(rsprod.getString("nome"));
                       
                  produto.add(prod);
                 
             }
            
             stmt2.close();
             stmt.close();
             c.close();
             venda.setProdutos(produto);
             
              }else{
                  venda.setDateHisto("0000/00/00 00/00/00");
                  venda.setCpfve(rsvenda.getString("não existe"));
                  venda.setRgve(rsvenda.getString("não existe"));
                  venda.setCpfcli(rsvenda.getString("não existe"));
                  venda.setValorTotal(rsvenda.getFloat("não existe"));
                  venda.setProdutos(produto);
                 
             }
            return venda;
            
           
            
             
         }catch(SQLException e){
           //e.printStackTrace();
           throw new Exception();
         }
    }
   
}