package mercado.Modelo;

import mercado.Helpers.Helpers;
import mercado.Helpers.Teste;



public class Vendedor extends Helpers implements Teste{
   
   private String nome;
   private String cpf;  
   private String rg;
   private String user;
   private String senha;
   private String endereco;
   private String tel;
   private String mensagemTest;

   public Vendedor() {
       this.mensagemTest = "";
   }

    public String getCpf() {
        return cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

   
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /* mensagens teste unitario*/
 

    @Override
    public String getMensagemTeste() {
       return this.mensagemTest;
    }

    @Override
    public void setMensagemTeste(String mensagem) {
        this.mensagemTest =  mensagem;
    }

    
   

}