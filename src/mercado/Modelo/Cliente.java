package mercado.Modelo;


public class Cliente { 

   private String cidade;
   private String nome;  
   private String snome;  
   private String rg;   
   private String cpf;  
   private String endereco;   
   private String tel;  
  
   public Cliente(){}
   
   
   public void setNome(String n) {
      
      this.nome = n;
        
   }   
   
   public void setSnome(String sn) {
       
      this.snome = sn;
       
   }
   
  
   public void setRg(String rg) {
       
      this.rg = rg;
        
   }
   
  
   public void setCpf(String cpf) {
      
      this.cpf = cpf;
       
   }
   
   
   public void setEndereco(String endereco) {
        
      this.endereco = endereco;
       
   }
   
   
   public void setTel(String tel) {
        
      this.tel = tel;
        
   }
   
 
 
   public String getNome() {
      return this.nome;
   }
   
   
   public String getSnome() {
      return this.snome;
   }
   
  
   public String getRg() {
      return this.rg;
   }
   
  
   public String getCpf() {
     return this.cpf;
   }
   
   
   public String getEndereco() {
      return this.endereco;
   }
   
  
   public String getTel() {
     return this.tel;
   }
   

    public void setCidade(String c) {
        cidade = c;
    }


   
   //-------- Valida CPF ou CNPJ
    public boolean valida_CpfCnpj(String s_aux)
    {
     
       if (s_aux.length() == 11 )
       {
           int     d1, d2; 
           int     digito1, digito2, resto; 
           int     digitoCPF; 
           String  nDigResult; 
           d1 = d2 = 0; 
           digito1 = digito2 = resto = 0; 
           for (int n_Count = 1; n_Count < s_aux.length() -1; n_Count++) 
           { 
              digitoCPF = Integer.valueOf (s_aux.substring(n_Count -1, n_Count)).intValue(); 
//--------- Multiplique a ultima casa por 2 a seguinte por 3 a seguinte por 4 e assim por diante. 
              d1 = d1 + ( 11 - n_Count ) * digitoCPF; 
//--------- Para o segundo digito repita o procedimento incluindo o primeiro digito calculado no passo anterior. 
              d2 = d2 + ( 12 - n_Count ) * digitoCPF; 
           }; 
//--------- Primeiro resto da divisão por 11. 
           resto = (d1 % 11); 
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior. 
           if (resto < 2) 
              digito1 = 0; 
           else 
              digito1 = 11 - resto; 
           d2 += 2 * digito1; 
//--------- Segundo resto da divisão por 11. 
           resto = (d2 % 11); 
//--------- Se o resultado for 0 ou 1 o digito é 0 caso contrário o digito é 11 menos o resultado anterior. 
           if (resto < 2) 
              digito2 = 0; 
           else 
              digito2 = 11 - resto; 
//--------- Digito verificador do CPF que está sendo validado. 
           String nDigVerific = s_aux.substring (s_aux.length()-2, s_aux.length()); 
//--------- Concatenando o primeiro resto com o segundo. 
           nDigResult = String.valueOf(digito1) + String.valueOf(digito2); 
//--------- Comparar o digito verificador do cpf com o primeiro resto + o segundo resto. 
           return nDigVerific.equals(nDigResult); 
        }

        else 
            return false;
    }



   


}