/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado.DAO;

import mercado.DAO.VendedorDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import mercado.Modelo.Vendedor;

/**
 *
 * @author Pablo
 */
public class VendedorDAOTest {
    
    public VendedorDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
    public void testPesquisaVendedor_CPF_VAZIO() {      
        String cpf = "";
        String rg = "5634749";
        VendedorDAO instance = new VendedorDAO();
        //Vendedor expResult = null;
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        System.out.println(result);
        assertEquals("CPF vazio", result.getMensagemTeste());
    }
    
    
    @Test
    public void testPesquisaVendedor_CPF_Invalido() {      
        String cpf = "0124587455";
        String rg = "5634749";
        VendedorDAO instance = new VendedorDAO();
        //Vendedor expResult = null;
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        System.out.println(result);
        assertEquals("CPF inválido", result.getMensagemTeste());
    }
    
    
    @Test
    public void testPesquisaVendedor_CPF_Nao_cadastrado() {      
        String cpf = "46891575028";
        String rg = "5634749";
        VendedorDAO instance = new VendedorDAO();
        //Vendedor expResult = null;
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        System.out.println(result);
        assertEquals("CPF Não cadastrado", result.getMensagemTeste());
    }
    
    
    @Test
    public void testPesquisaVendedor_RG_VAZIO() {      
        String cpf = "04154210122";
        String rg = "";
        VendedorDAO instance = new VendedorDAO();
        //Vendedor expResult = null;
        Vendedor result = instance.pesquisarVendedor(cpf, rg);
        System.out.println(result);
        assertEquals("RG vazio", result.getMensagemTeste());        
    }
    
}
