package mercado;

import java.lang.annotation.*;

/** @pdOid 9f353cec-8b93-4388-acd0-becc84153a2f */
public class Vendedor implements Acoes {
   /** @pdOid 33f2cb30-d427-46c3-9d6a-6cd17ac4432f */
   private String nome;
   /** @pdOid c6912f84-f2e6-4ffe-bea4-e1be8ff14511 */
   private Number cpf;
   /** @pdOid c8d47d61-ce60-46d2-afcb-f074ae0503bf */
   private String endereco;
   /** @pdOid a23e1da0-41e2-4375-bf97-7b5e20331fa2 */
   private float salario;
   /** @pdOid 0f16da69-a866-484e-9052-95ec61b67cff */
   private Number rg;
   /** @pdOid b7f2ad2c-add4-4aff-ac01-e8e13a39070f */
   private int numerovendasM;
   
   /** @param n 
    * @param cpf 
    * @param end 
    * @param sal 
    * @param rg 
    * @param numV_m
    * @pdOid c3647f6e-2501-40f0-a415-c1237d7a981e */
   public Vendedor(String n, Number cpf, String end, float sal, Number rg, int numV_m) {
      this.nome = n;
      this.cpf = cpf;
      this.endereco = end;
      this.salario = sal;
      this.rg = rg;
      this.numerovendasM = numV_m;
   }
   
   /** @param n
    * @pdOid 556a848f-c54a-4493-9e15-76a5008e944c */
   public void setNome(String n) {
     this.nome = n;
   }
   
   /** @param cpf
    * @pdOid 7a18aa49-382d-4223-9c65-ee9d564668c6 */
   public void setCpf(Number cpf) {
      this.cpf = cpf;
   }
   
   /** @param end
    * @pdOid ac63787b-27c9-442c-9bad-0f0083bc3ad3 */
   public void setEndereco(String end) {
      this.endereco = end;
   }
   
   /** @param sal
    * @pdOid 2dfb15ea-8be3-4b82-ab4e-528a8df911bd */
   public void setSalario(float sal) {
      this.salario = sal;
   }
   
   /** @param rg
    * @pdOid d5433aa7-5fb1-47b3-8071-def0f14213b6 */
   public void setRg(Number rg) {
      this.rg = rg;
   }
   
   /** @pdOid a2798c1f-d551-42ef-b59e-9f4b78ee6413 */
   public String getNome() {
      return this.nome;
   }
   
   /** @pdOid 7dbc0d7c-ed66-4bca-8fd9-786375327eef */
   public String getEndereco() {
      return this.endereco;
   }
   
   /** @pdOid 0ff391b8-d87d-4a3d-84b6-f69758a3166b */
   public float getSalario() {
      return this.salario;
   }
   
   /** @pdOid fdbef002-57e0-49da-8e5a-cee90dc247ae */
   public Number getRg() {
     return this.rg;
   }
   
   /** @pdOid c441a27a-6d99-41e2-b67c-f9fea1b5d429 */
   public int getNumerovendasM() {
     return this.numerovendasM;
   }
   
   /** @param obj
    * @pdOid f15c9ec2-6786-4d51-bc36-ced6e6228b00 */
   @Override
   public boolean cadastrar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   /** @param obj
    * @pdOid 44404dd9-6ce6-4f6f-a1c5-371fabb1e4ce */
   @Override
   public boolean remover(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }
   
   /** @param obj
    * @pdOid da77e9a2-ebc1-47ab-9829-2832633a6ef7 */
   @Override
   public boolean atualizar(Object obj) {
       throw new UnsupportedOperationException("Not supported yet.");
   }

}