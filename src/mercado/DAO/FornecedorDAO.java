
package mercado.DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mercado.Modelo.Fornecedor;




public class FornecedorDAO implements Acoes {

    @Override
    public boolean cadastrar(Object fornecedor) {
         Fornecedor forne= new Fornecedor();
         forne = (Fornecedor)fornecedor;        
         Connection c = (Connection) new FabricaConexoes().getConnection();
           
      
          try{
             CallableStatement stmt = (CallableStatement) c.prepareCall( "{call cadfornecedor(?,?,?,?,?,?)}" );
          
            
            stmt.setString(1,forne.getNome());
            stmt.setString(2,forne.getCnpj());
            stmt.setString(3,forne.getSite());
            stmt.setString(4,forne.getEmail()); 
            stmt.setString(5,forne.getTel());  
            
            stmt.setString(6,forne.getEndereco());
            
            
            //executa fornecedor
           boolean teste= stmt.execute(); 
           if(teste){
            System.out.println("ok");
           }
            stmt.close();
            
       }catch(SQLException e){
       System.out.println(e);
          return false;
           
       }
         return true;
    }

    @Override
    public boolean remover(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean atualizar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    
    
    /*lista os fornecedores cadastrados na BAse de dados*/
    public ArrayList<Fornecedor> ListarFornecedor(){
        ArrayList<Fornecedor> aux= new ArrayList<Fornecedor>();
        
        Fornecedor forne = null;
        try { 
         
        Connection c2 = (Connection) new FabricaConexoes().getConnection();
        String sql2 ="{call listarfornecedor()}";      
        CallableStatement stmt2 = (CallableStatement) c2.prepareCall(sql2);    
        ResultSet rs = stmt2.executeQuery();
        while (rs.next()) { 
           forne = new Fornecedor();
           forne.setCnpj(rs.getString("CNPJ"));            
           forne.setNome(rs.getString("NOME"));
           aux.add(forne);
       
        } 
        
        }  
        catch (SQLException e) {
          System.out.println(e);
    }
        return aux;
  }    

}
    

