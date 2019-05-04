package mercado.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes{
  String servidor = "localhost";
  String base = "mercado";
  String usuario = "root";
  String senha = "";
  public Connection getConnection(){
     System.out.println("Conectado ao DB");
     try{
          return DriverManager.getConnection("jdbc:mysql://"+servidor+"/"+base,usuario,senha);
     }catch(SQLException connDB){
        throw new RuntimeException(connDB);
     }
  }
}