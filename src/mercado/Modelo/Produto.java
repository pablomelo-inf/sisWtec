
package mercado.Modelo;



  public class Produto{
  
   private String nome;  
   private String marca;
   private int qtEstoque;
   private String descricao;
   private String codigoBarra;
   private float valorCompra;
   private float valorVenda;
   private String CNPJ;
   private int qtparc ;
   public Produto(){
   
   }


    public int getQtparc() {
        return qtparc;
    }

    public void setQtparc(int qtparc) {
        this.qtparc = qtparc;
    }
  
    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

  
   
   
   
   
   public String getCnpj(){
         return CNPJ;
   }
   
   public void setCnpj(String cnpj){
         CNPJ=cnpj;
   }
   
   public void setDescricao(String desc) {
      this.descricao = desc;
   }
   
   public void setCodigoBarra(String cb) {
      this.codigoBarra = cb;
   }
   
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   
   public void setMarca(String marca) {
      this.marca = marca;
   }
   
   
   public void setQtEstoque(int qtEstoque) {
      this.qtEstoque = qtEstoque;
   }
   
   
   public void setValorCompra(float Vc) {
      this.valorCompra = Vc;
   }
   
  
   public void setValorVenda(float Vv) {
      this.valorVenda = Vv;
   }
   
   
   public String getNome() {
      return this.nome;
   }
   
   
   public String getMarca() {
      return this.marca;
   }
   
   
   public int getQtEstoque() {
     return this.qtEstoque;
   }
   
   
   public String getDescricao() {
      return this.descricao;
   }
   
   
   public String getCodigoBarra() {
     return this.codigoBarra;
   }
   
   
   public float getValorCompra() {
      return this.valorCompra;
   }
   
   
   public float getValorVenda() {
      return this.valorVenda;
   }
   
    public String toString(){
       return "Nome: "+nome+" Marca: "+marca; 
    }

    
}