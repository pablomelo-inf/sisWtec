package mercado.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import mercado.Modelo.Vendedor;

public class VendedorDAOTest {

    @Test
    public void testPesquisaVendedor_CPF_VAZIO() {      
        String cpf = "";
        String rg = "5634749";
        VendedorDAO instance = new VendedorDAO();
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        assertEquals("CPF vazio", result.getMensagemTeste());
    }
    
    @Test
    public void testPesquisaVendedor_CPF_Invalido() {      
        String cpf = "0124587455";
        String rg = "5634749";
        VendedorDAO instance = new VendedorDAO();
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        assertEquals("CPF inválido", result.getMensagemTeste());
    }
    
    @Test
    public void testPesquisaVendedor_CPF_Nao_cadastrado() {      
        String cpf = "46891575028";
        String rg = "5634749";
        VendedorDAO instance = new VendedorDAO();
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        assertEquals("CPF Não cadastrado", result.getMensagemTeste());
    }
    
    @Test
    public void testPesquisaVendedor_RG_VAZIO() {      
        String cpf = "04154210122";
        String rg = "";
        VendedorDAO instance = new VendedorDAO();
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        assertEquals("RG vazio", result.getMensagemTeste());        
    }
}
