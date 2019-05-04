package mercado;

import java.lang.annotation.*;

/** @pdOid 63608ac9-f244-44f1-8d88-dab83ba59761 */
class Produto implements Acoes {
   /** @pdOid 59ead9ef-0ade-4303-80c8-b08225d550dd */
   private String nome;
   /** @pdOid 66b40bfa-e363-4cae-ae4d-063006a144f0 */
   private String marca;
   /** @pdOid 2367136a-304d-4257-94dc-042fabd65687 */
   private int qtEstoque;
   /** @pdOid d2029ce7-cc01-4a60-ae49-14b64d32c318 */
   private String descricao;
   /** @pdOid 62b4b54d-d91f-4128-909d-1674dbbd1f7e */
   private Number codigoBarra;
   /** @pdOid 7dd7df1d-de01-42dd-9a01-091d8c26f739 */
   private float valorCompra;
   /** @pdOid 6904a21b-881d-4760-b870-9c2350da824f */
   private float valorVenda;
   
   /** @pdRoleInfo migr=no name=Venda assc=association1 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Aggregation */
   public java.util.Collection<Venda> venda;
   
   /** @param n 
    * @param m 
    * @param qtE 
    * @param Desc 
    * @param codB 
    * @param vC 
    * @param vV
    * @pdOid 721aa2f5-d043-437f-8555-8765d70e2867 */
   public Produto(String n, String m, int qtE, String Desc, Number codB, float vC, float vV) {
      this.nome = n;
      this.marca = m;
      this.qtEstoque = qtE;
      this.descricao = Desc;
      this.codigoBarra = codB;
      this.valorCompra = vC;
      this.valorVenda = vV;
   }
   
   /** @param nome
    * @pdOid 561c48cc-8fb2-4245-822b-88a6f3769515 */
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   /** @param marca
    * @pdOid 67882bc4-4236-4772-8b6f-caa968b65f9e */
   public void setMarca(String marca) {
      this.marca = marca;
   }
   
   /** @param qtEstoque
    * @pdOid 9368eed6-9e8b-4b9f-a6b2-7c0bfb97e3ba */
   public void setQtEstoque(int qtEstoque) {
      this.qtEstoque = qtEstoque;
   }
   
   /** @param Vc
    * @pdOid 559f4476-5104-4698-a6d2-d619c37d7b6b */
   public void setValorCompra(float Vc) {
      this.valorCompra = Vc;
   }
   
   /** @param Vv
    * @pdOid a363e9e6-5ec4-4f8c-9ff3-87239ac3496f */
   public void setValorVenda(float Vv) {
      this.valorVenda = Vv;
   }
   
   /** @pdOid ec994076-c2e9-4c8c-b264-be496bd753f0 */
   public String getNome() {
      return this.nome;
   }
   
   /** @pdOid 09b68037-f32e-4d01-9ea2-0411b78e5b8c */
   public String getMarca() {
      return this.marca;
   }
   
   /** @pdOid 8bf3badb-ef36-4282-b671-11e01e97fec9 */
   public int getQtEstoque() {
     return this.qtEstoque;
   }
   
   /** @pdOid 01ac65b9-b563-4064-a5c4-55100fe81366 */
   public String getDescricao() {
      return this.descricao;
   }
   
   /** @pdOid ee3dcb7c-d990-4c0a-a70e-7093ed6af66f */
   public Number getCodigoBarra() {
     return this.codigoBarra;
   }
   
   /** @pdOid ef2b193e-6258-480e-816a-4498ab8abf22 */
   public float getValorCompra() {
      return this.valorCompra;
   }
   
   /** @pdOid e7c7ea26-ddb1-4468-b21e-d8f7e8c063ff */
   public float getValorVenda() {
      return this.valorVenda;
   }
   
   /** @param obj
    * @pdOid 43b96005-04df-4395-b15c-e249a9f1c3e0 */
   @Override
   public boolean cadastrar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   /** @param obj
    * @pdOid cb890543-522a-41c1-b86d-9eae9512ac72 */
   @Override
   public boolean remover(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   /** @param obj
    * @pdOid 7faa686d-2e48-44e0-bb86-b61619b6b7e1 */
   @Override
   public boolean atualizar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Venda> getVenda() {
      if (venda == null)
         venda = new java.util.HashSet<Venda>();
      return venda;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorVenda() {
      if (venda == null)
         venda = new java.util.HashSet<Venda>();
      return venda.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newVenda */
   public void setVenda(java.util.Collection<Venda> newVenda) {
      removeAllVenda();
      for (java.util.Iterator iter = newVenda.iterator(); iter.hasNext();)
         addVenda((Venda)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newVenda */
   public void addVenda(Venda newVenda) {
      if (newVenda == null)
         return;
      if (this.venda == null)
         this.venda = new java.util.HashSet<Venda>();
      if (!this.venda.contains(newVenda))
         this.venda.add(newVenda);
   }
   
   /** @pdGenerated default remove
     * @param oldVenda */
   public void removeVenda(Venda oldVenda) {
      if (oldVenda == null)
         return;
      if (this.venda != null)
         if (this.venda.contains(oldVenda))
            this.venda.remove(oldVenda);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllVenda() {
      if (venda != null)
         venda.clear();
   }

}