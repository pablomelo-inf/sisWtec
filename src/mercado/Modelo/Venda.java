
package mercado.Modelo;

import java.sql.Timestamp;
import java.util.*;


public class Venda  {
    
   
    private ArrayList<Produto> produtos ;  
    private Date data;
    private float ValorTotal;
    private int qtProd;
    private String Cpfcli;
    private String rgve;
    private String cpfve;
    private Timestamp hora;
    private int codvenda;
    private String dateHisto;

    public String getDateHisto() {
        return dateHisto;
    }

    public void setDateHisto(String dateHisto) {
        this.dateHisto = dateHisto;
    }
    public int getCodvenda() {
        return codvenda;
    }

    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }
    
    
    
       public Venda() {
        produtos = new  ArrayList<Produto>();
     }

    
    
    
    
    
    public String getCpfcli() {
        return Cpfcli;
    }

    public void setCpfcli(String Cpfcli) {
        this.Cpfcli = Cpfcli;
    }

    public String getCpfve() {
        return cpfve;
    }

    public void setCpfve(String cpfve) {
        this.cpfve = cpfve;
    }

    public Timestamp getHora() {
        return hora;
    }

    public void setHora(Timestamp hora) {
        this.hora = hora;
    }

    public String getRgve() {
        return rgve;
    }

    public void setRgve(String rgve) {
        this.rgve = rgve;
    }
    
   
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos.add(produtos);
    }
    
    

  
   
   
    public float getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(float ValorTotal) {
        this.ValorTotal = ValorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

 

    public int getQtProd() {
        return qtProd;
    }

    public void setQtProd(int qtProd) {
        this.qtProd = qtProd;
    }

    public void setProdutos(ArrayList<Produto> produto) {
        produtos = produto;
    }

    
   
  

  
  
}