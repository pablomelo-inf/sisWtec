
package mercado.DAO;

import com.mysql.jdbc.MysqlDataTruncation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mercado.Modelo.Cliente;


public class ClienteDAO implements Acoes {
    
    
    @Override
     public boolean cadastrar(Object cli2) {
         Cliente cli = (Cliente)cli2;
         Connection c = new FabricaConexoes().getConnection();
         String sql ="insert into cliente values(?,?,?,?,?,?)";
        
          try{
            PreparedStatement stmt = (PreparedStatement) c.prepareStatement(sql);
          
            stmt.setString(1,cli.getNome());
            stmt.setString(2, cli.getSnome());
            stmt.setString(5, cli.getRg());
            stmt.setString(4, cli.getCpf());
            stmt.setString(3, cli.getTel());
            stmt.setString(6, cli.getEndereco());      
   
            stmt.execute();
           
            stmt.close();
            
           
       }catch(SQLException e){
           
           e.printStackTrace();
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

    public Cliente PesquisaCli(String text) {
        Cliente clie = new Cliente();
        
      
      
       try{
        Connection c = (Connection) new FabricaConexoes().getConnection();       
        String query = "{call pesquisacli(?)}";
        PreparedStatement stmt = (PreparedStatement) c.prepareCall(query);
        stmt.setString(1, text);
        ResultSet rs=stmt.executeQuery();
        
            while(rs.next()){
              clie.setCpf(rs.getString("CPF"));
              clie.setNome(rs.getString("NOME"));
              clie.setSnome(rs.getString("Snome"));
              clie.setTel(rs.getString("TELEFONE"));
              clie.setRg(rs.getString("RG"));
              clie.setEndereco(rs.getString("ENDERECO"));
            }
          
       }catch(MysqlDataTruncation tru){
            System.out.println("Valor Inválido");
       }catch(SQLException busca){
           
         System.out.println("digite o cpf do cliente para pesquisar");
       }
        return clie;
       
    }
}
