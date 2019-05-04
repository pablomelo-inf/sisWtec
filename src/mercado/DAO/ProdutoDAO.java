
package mercado.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mercado.Modelo.Produto;

public class ProdutoDAO {

    Connection c = (Connection) new FabricaConexoes().getConnection();
    
    //inseri os produtos
  
    public boolean cadastrar(Object produto) {
        Produto prod= (Produto)produto;
         
         String sql ="insert into produto(NOME,MARCA,QTESTOQUE,VALORVENDA,VALORCOMPRA,CODPRODUTO,DESCPRODUTO,CNPJ )values(?,?,?,?,?,?,?,?)";      
  
          try{
            PreparedStatement stmt = (PreparedStatement) c.prepareStatement(sql);
            
            //seta valores
            stmt.setString(1,prod.getNome());
            stmt.setString(2,prod.getMarca());
            stmt.setInt(3,prod.getQtEstoque());
            stmt.setFloat(4,prod.getValorVenda()); 
            stmt.setFloat(5,prod.getValorCompra());
            stmt.setString(6,prod.getCodigoBarra());
            stmt.setString(7,prod.getDescricao());
            stmt.setString(8,prod.getCnpj());
    
            //executa 
            stmt.execute();
            //fecha a conexão
            stmt.close();
       }catch(SQLException e){
         // throw new RuntimeException(e);
           System.out.println(e);
          return false;
         
           
       }
         return true;
    }

  
    //Lista Os Produtos
    public ArrayList<Produto> ListarProduto() {
        ArrayList<Produto> aux= new ArrayList<Produto>();        
        
        try {          
             Connection c = (Connection) new FabricaConexoes().getConnection();       
             Statement stmt = c.createStatement();
             String query = "SELECT * FROM produto";
             ResultSet rs = stmt.executeQuery(query);      
             while(rs.next()){
                 Produto produto = new Produto();               
                 produto.setNome( rs.getString("Nome"));
                 produto.setMarca( rs.getString("MARCA"));
                 produto.setMarca(rs.getString("MARCA"));               
                 produto.setQtEstoque(Integer.parseInt(rs.getString("QTESTOQUE")));               
                 produto.setValorVenda(rs.getFloat("VALORVENDA"));                
                 produto.setValorCompra(rs.getFloat("VALORCOMPRA"));                
                 produto.setCodigoBarra(rs.getString("CODPRODUTO"));
                 aux.add(produto); 
             } 
            
        }catch(SQLException e){
           e.printStackTrace();
        }
        return aux;
    }

  
    public boolean atualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public boolean update(Produto prodNome) {
       
        if(prodNome.getQtEstoque()!= 0){
          
              String sqlnome ="update produto set QTESTOQUE=? where CODPRODUTO = ?";      
           try{
              PreparedStatement stmt = c.prepareStatement(sqlnome); 
          
              stmt.setInt(1, prodNome.getQtEstoque());   
              stmt.setString(2, prodNome.getCodigoBarra());
              int n = stmt.executeUpdate();    
              stmt.close();
           }catch(SQLException e){
            throw new RuntimeException(e);
           }
        }
        return true;
    }

    public Produto pesqProduto(String text) {
        Produto prod = new Produto();
       
        try{
             Connection conn = new FabricaConexoes().getConnection();
             String sql = "{call lisprod(?)}";
            
            PreparedStatement stmt = (PreparedStatement) conn.prepareCall(sql);
            stmt.setString(1,text);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
               prod.setNome(rs.getString("NOME"));
               prod.setMarca(rs.getString("MARCA"));
               prod.setQtEstoque(rs.getInt("QTESTOQUE"));
               prod.setValorVenda(rs.getFloat("VALORVENDA"));
               prod.setValorCompra(rs.getFloat("VALORCOMPRA"));
               prod.setCodigoBarra(rs.getString("CODPRODUTO"));
               prod.setDescricao(rs.getString("DESCPRODUTO"));
            }
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return prod;
    }
    
  
}
