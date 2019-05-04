/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.Modelo;

/**
 *
 * @author Pablo
 */
public class testaexecao {
    private int valor;
    public void adcvalor(int valor2){
    if(valor2<0){
      throw new IllegalArgumentException("Valor negatico");
    }else{
      System.out.println("sucesso");
    }
    }
}
