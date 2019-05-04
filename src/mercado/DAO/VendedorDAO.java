
package mercado.DAO;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import mercado.Modelo.Vendedor;


public class VendedorDAO {
    
    public boolean cadastrar(Vendedor v){
       Connection con = new FabricaConexoes().getConnection();
       String query = "insert into vendedor(NOME,CPF,RG,USUARIO,SENHA,TELEFONE,endereco) values(?,?,?,?,?,?,?)";
       
       try{
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement(query);
            stmt.setString(1, v.getNome());
            stmt.setString(2,v.getCpf());
            stmt.setString(3,v.getRg());
            stmt.setString(4, v.getUser());
            stmt.setString(5, v.getSenha());
            stmt.setString(6, v.getTel());
            stmt.setString(7, v.getEndereco());
            
            stmt.execute();
            stmt.close();
            con.close();
            return true;
       }catch(SQLException e){
          e.printStackTrace();
          return false;
       }
       
       
    }
    
    public boolean pesquisarUsuarioVendedor(String senha, String user) {
         Connection con2 = new FabricaConexoes().getConnection();
         String query2 = "select USUARIO,SENHA from vendedor where USUARIO = ? and SENHA=?";
         
         try{
           PreparedStatement stmt  =  (PreparedStatement) con2.prepareStatement(query2);
           stmt.setString(1, user);
           stmt.setString(2, senha);
           ResultSet rs = stmt.executeQuery();
           
           if(rs.next()){
              System.out.println(rs.getString("USUARIO")+ rs.getString("SENHA")); 
              rs.getString("USUARIO");
              System.out.println(rs);
                      rs.getString("SENHA");
              
              return true;
              
           }else{
              return false;
           }
           
         }catch(SQLException v){
           throw new RuntimeException();
         }
    }

    public Vendedor pesquisarVendedor(String cpf, String rg) {
        Vendedor vendedor = new Vendedor();
        vendedor.setMensagemTeste("CPF vazio");
        
        try{
            System.out.println(vendedor.valida_CpfCnpj(cpf));
            if("".equals(cpf)){
               vendedor.setMensagemTeste("CPF vazio");               
            }else if("".equals(rg)){
               vendedor.setMensagemTeste("RG vazio"); 
            }else if(vendedor.valida_CpfCnpj(cpf) == false){
                vendedor.setMensagemTeste("CPF inválido");       
            }else{ 
                Connection c = (Connection) new FabricaConexoes().getConnection();       
                String query = "Select nome, cpf from vendedor where cpf=? and rg=?";
                PreparedStatement stmt = (PreparedStatement) c.prepareCall(query);
                stmt.setString(1, cpf);
                stmt.setString(2, rg);
                ResultSet rs=stmt.executeQuery();
                
                if(rs.next()){
                    vendedor.setNome(rs.getString("NOME"));
                    vendedor.setCpf(rs.getString("CPF"));
                }else{
                    System.out.println(rs);
                    //vendedor = null;
                    vendedor.setMensagemTeste("CPF Não cadastrado"); 
                }
            } 
        
        }catch(SQLException busca){
            vendedor = null;   
            System.out.println("digite o cpf do cliente para pesquisar");
        }
        return vendedor;        
    }
    
    public Vendedor pesquUSer(String user, String senha) {
       Vendedor vend = new Vendedor();
        try{
      
        Connection c = (Connection) new FabricaConexoes().getConnection();       
        String query = "Select nome, cpf,rg from vendedor where Usuario=? and Senha=?";
        PreparedStatement stmt = (PreparedStatement) c.prepareCall(query);
        stmt.setString(1, user);
        stmt.setString(2, senha);
        ResultSet rs=stmt.executeQuery();
        
            if(rs.next()){
             vend.setNome(rs.getString("NOME"));
             vend.setCpf(rs.getString("CPF"));
             vend.setRg(rs.getString("rg"));
            }else{
              vend = null;
            }
          
       
       }catch(SQLException busca){
         vend = null;
         
         System.out.println("digite o cpf do cliente para pesquisar");
       }
        return vend;
    }

    
}
