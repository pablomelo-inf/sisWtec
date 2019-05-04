
package mercado.UI;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.*;
import java.util.ArrayList;
import mercado.DAO.ProdutoDAO;
import mercado.Modelo.Produto;




public class ListaProdutoGUI extends JFrame{
    
    
    
    
    protected JTable tabela;
    protected  DefaultTableModel modelo ;
    private ProdutoGUI produtocadastro;
    private JButton novo;
    private ArrayList<Produto> produto;
    public ListaProdutoGUI(){
        
        super("Listagem de Produtos");
        this.setResizable(false);
        modelo = getProduto();
        tabela = new JTable(modelo); 
        ListSelectionModel listMod = tabela.getSelectionModel();
        listMod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        TrataTecla t = new TrataTecla();
        tabela.addKeyListener(t);
        tabela.setPreferredScrollableViewportSize(new Dimension(750, 320));
        Container c = getContentPane();
        c.setLayout(new FlowLayout());	
        JScrollPane scrollPane = new JScrollPane(tabela);
        c.add(scrollPane);
        setSize(800, 600);
        setVisible(true);
        novo = new JButton("Cadastrar Novo");
        add(novo);
        ButtonHandler handler = new ButtonHandler();
        novo.addActionListener(handler);
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-800)/2, (screenSize.height-600)/2, 800,600);
    }
   
    
    public void setModelo(DefaultTableModel model){
        tabela.setModel(model);
    }
    
   private DefaultTableModel getProduto(){
       ProdutoDAO produto2 = new ProdutoDAO();
       produto = produto2.ListarProduto();
       int i = 0;
       DefaultTableModel modelo2 =  new DefaultTableModel();
       modelo2.addColumn("Nome");
       modelo2.addColumn("Marca");
       modelo2.addColumn("QtEstoque");
       modelo2.addColumn("ValorVenda");
       modelo2.addColumn("ValorCompra");
       modelo2.addColumn("CodigoBarra");
       for(Produto f : produto){
           modelo2.addRow(new Object[]{f.getNome(),f.getMarca(),f.getQtEstoque(),f.getValorVenda(),f.getValorCompra(),f.getCodigoBarra()});
           i++;
       }
       return modelo2;
   }
 
  
  
    private class TrataTecla   implements KeyListener{
        private String line1 = "";
        @Override
        public void keyPressed(KeyEvent event){
        }
        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyReleased(KeyEvent event) {
            if(event.getKeyCode() == KeyEvent.VK_ENTER){
                Object produto =  new Produto();
                produto =  tabela.getValueAt(tabela.getSelectedRow(),tabela.getSelectedColumn());
                System.out.println(produto.toString());
                Produto prod = new Produto();
                System.out.println("Numero Coluna:"+tabela.getSelectedColumn());                
                int opcao = JOptionPane.showConfirmDialog(null,"Deseja alterar?" );
                if((opcao == 0)&& (tabela.getSelectedColumn()==2)){
                    Produto prodNome = new Produto();
                    prodNome.setQtEstoque(Integer.parseInt(String.valueOf(produto)));
                    prodNome.setCodigoBarra(String.valueOf(tabela.getValueAt(tabela.getSelectedRow(),5)));
                    ProdutoDAO atuali = new ProdutoDAO();
                    boolean atualizar = atuali.update(prodNome);
                }
            }
        }
    }
    
    
    private  class ButtonHandler implements ActionListener {
        public ButtonHandler () {
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            produtocadastro = new ProdutoGUI(ListaProdutoGUI.this);
            produtocadastro.setVisible(true);
            modelo = getProduto();
            setModelo(modelo);
        }
    }
}