
package mercado.Modelo;

import mercado.UI.LoginUI;
//import mercado.UI.JFPrincipal;





public class Mercado {

    public static void main(String[] args) {
//   cliente gui = new cliente("ere"); 
   
      LoginUI log = new LoginUI();
      log.setVisible(true);
      try{
      testaexecao e = new testaexecao();
      e.adcvalor(1);
      }catch(IllegalArgumentException e ){
          System.out.println(e.getMessage());
      }
    }
}
