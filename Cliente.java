package mercado;

import java.lang.annotation.*;

/** @pdOid 30b889f8-0a99-48aa-9b4a-c6babe1ba789 */
public class Cliente implements Acoes {
   /** @pdOid 154c0c56-fa9b-4d9b-8dda-809fc33029f6 */
   private String nome;
   /** @pdOid 26c5f638-58b4-40b2-a156-237db97ff389 */
   private String snome;
   /** @pdOid 8adc1dfb-7c23-4bc9-9cef-7786aace5d58 */
   private Number rg;
   /** @pdOid e359b1ac-edce-4ec0-90e3-02f9f10e24a7 */
   private Number cpf;
   /** @pdOid 00499800-90d9-4eed-8dae-ab371d10afd6 */
   private String endereco;
   /** @pdOid f77184a3-45a4-44d6-bcc1-38b2221c3d28 */
   private Number tel;
   /** @pdOid 0a78ed38-724c-4e52-83b2-d31ed0e4e1a5 */
   private String situacaoLoja;
   
   /** @param nome 
    * @param snome 
    * @param rg 
    * @param cpf 
    * @param endereco 
    * @param tel 
    * @param situacaoLoja
    * @pdOid e3bec184-3065-4138-bc27-c1496ed95743 */
   public Cliente(String nome, String snome, Number rg, Number cpf, String endereco, Number tel, String situacaoLoja) {
      this.nome = nome;
      this.snome = snome;
      this.rg = rg;
      this.cpf = cpf;
      this.endereco = endereco;
      this.tel = tel;
      this.situacaoLoja = situacaoLoja;
   }
   
   /** @param n
    * @pdOid 63d93853-4982-405f-ad9d-5429bd7d865b */
   public void setNome(String n) {
      this.nome = n;
   }
   
   /** @param sn
    * @pdOid 414465c2-9f9b-4fec-9def-8719a3f593c2 */
   public void setSnome(String sn) {
      this.snome = sn;
   }
   
   /** @param rg
    * @pdOid 184c5faa-273c-4b0f-8565-36ec0f892938 */
   public void setRg(Number rg) {
      this.rg = rg;
   }
   
   /** @param cpf
    * @pdOid c4be9117-e731-4871-b357-92e328c7c10f */
   public void setCpf(Number cpf) {
      this.cpf = cpf;
   }
   
   /** @param endereco
    * @pdOid ecaa2390-2c1c-4fcf-b48a-407abfb4e53b */
   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }
   
   /** @param tel
    * @pdOid 5ae45ac3-336d-4989-a47c-5165c3f8d82d */
   public void setTel(Number tel) {
      this.tel = tel;
   }
   
   /** @param sitLoja
    * @pdOid 9c33e3e3-64cc-4ac8-b9d1-3f21e3d8928f */
   public void setSituacaoLoja(String sitLoja) {
      this.situacaoLoja = sitLoja;
   }
   
   /** @pdOid 87d0c41e-cf06-4c49-9d14-e4bc35d26fdd */
   public String getNome() {
      return this.nome;
   }
   
   /** @pdOid 5dca82cd-96ea-4658-ae3d-bf6dee821f92 */
   public String getSnome() {
      return this.snome;
   }
   
   /** @pdOid 1b2c9afc-3c66-48f4-bbdc-50e85200fcf9 */
   public Number getRg() {
      return this.rg;
   }
   
   /** @pdOid 041227a0-d57d-4ec7-ad2e-95e06a20328e */
   public Number getCpf() {
     return this.cpf;
   }
   
   /** @pdOid fc102ef0-1e9a-404f-aa06-ed28e5a5732b */
   public String getEndereco() {
      return this.endereco;
   }
   
   /** @pdOid aaea0f62-e5f6-4f83-b15a-5abb0de033c3 */
   public Number getTel() {
     return this.tel;
   }
   
   /** @pdOid 7a958494-7b7b-40a5-95fb-e7e4399f7e17 */
   public String getSituacaoLoja() {
      return this.situacaoLoja;
   }
   
   /** @param obj
    * @pdOid 8867a133-8d56-47fb-b12f-62a5679e0c9a */
   @Override
   public boolean cadastrar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   /** @param obj
    * @pdOid 8e043bac-23fe-4018-a3c1-18e6a8751f87 */
   @Override
   public boolean remover(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   /** @param obj
    * @pdOid 635fbd41-ff0d-43da-8f84-9fd1c0975efd */
   @Override
   public boolean atualizar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }

}