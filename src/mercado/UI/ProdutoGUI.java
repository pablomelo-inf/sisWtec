
package mercado.UI;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import mercado.DAO.FornecedorDAO;
import mercado.DAO.ProdutoDAO;
import mercado.Modelo.Fornecedor;
import mercado.Modelo.Produto;


public class ProdutoGUI extends JDialog {
private ArrayList<Fornecedor> forne;

   
 
    
    



    public ProdutoGUI(JFrame owner) {
        super(owner,"teste",true);
            initComponents();
             
     
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cadastrar = new javax.swing.JButton();
        jBcadastrarFornecedor = new javax.swing.JButton();
        jCFornecedor = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdescricao = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTvalorCompra = new javax.swing.JTextField();
        JTmarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jTquantidade = new javax.swing.JTextField();
        jTvalorVenda = new javax.swing.JTextField();
        jTcodigoBarra = new javax.swing.JTextField();
        jBLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Produtos MERCADO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(192, 192, 192))); // NOI18N

        Cadastrar.setText("cadastrarProduto");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        jBcadastrarFornecedor.setText("CadastrarFornecedor");
        jBcadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarFornecedorActionPerformed(evt);
            }
        });

        jCFornecedor.setModel(new javax.swing.DefaultComboBoxModel(getForne()));
        jCFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCFornecedorActionPerformed(evt);
            }
        });

        jTdescricao.setColumns(20);
        jTdescricao.setRows(5);
        jScrollPane1.setViewportView(jTdescricao);

        jLabel8.setText("Fornecedor:");

        jLabel7.setText("Descricao:");

        jLabel6.setText("CodigoBarra:");

        jLabel4.setText("ValorVenda:");

        jLabel3.setText("Quantidade:");

        jLabel1.setText("NOME:");

        jLabel5.setText("ValorCompra:");

        jLabel2.setText("Marca:");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jTquantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTquantidadeActionPerformed(evt);
            }
        });

        jTcodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoBarraActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBLimparMouseClicked(evt);
            }
        });
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBcadastrarFornecedor))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTcodigoBarra, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                                        .addGap(136, 136, 136))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(352, 352, 352)))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCFornecedor, 0, 111, Short.MAX_VALUE)
                            .addComponent(jTvalorVenda)
                            .addComponent(jTvalorCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(JTmarca))))
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1))
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addGap(426, 426, 426))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(527, 527, 527)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTvalorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcodigoBarra)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTvalorVenda)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jCFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLimpar)
                    .addComponent(Cadastrar)
                    .addComponent(jBcadastrarFornecedor))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nome))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTquantidade))
                    .addGap(253, 253, 253)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(768, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jTquantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTquantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTquantidadeActionPerformed

    private void jTcodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodigoBarraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodigoBarraActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
     try{
      Produto produto = new Produto();
      produto.setNome(nome.getText());
      produto.setMarca(JTmarca.getText());
      produto.setQtEstoque(Integer.parseInt(jTquantidade.getText()));
      produto.setValorVenda(Float.parseFloat(jTvalorVenda.getText()));
      produto.setValorCompra(Float.parseFloat(jTvalorCompra.getText()));
      produto.setCodigoBarra(jTcodigoBarra.getText());
      produto.setDescricao(jTdescricao.getText());
      int index = jCFornecedor.getSelectedIndex();
      String Cnpj = forne.get(index).getCnpj();
      produto.setCnpj(Cnpj);
      
      ProdutoDAO produtoDao = new ProdutoDAO();
                  boolean cadastro = produtoDao.cadastrar(produto);
             if(cadastro){
                 JOptionPane.showMessageDialog(this, "Dados Inseridos Com Sucesso", "Mensagem Sistema", JOptionPane.INFORMATION_MESSAGE);
                 //ProdutoGUIConsulta p =  new ProdutoGUIConsulta();
                
             }else{
                 JOptionPane.showMessageDialog(this, "Este fornecedor já está Cadastrado!", null, JOptionPane.ERROR_MESSAGE);
             }
      
    }catch(java.lang.NumberFormatException er){
        JOptionPane.showMessageDialog(this, "Os campos precisão ser preenchidos!", null, JOptionPane.WARNING_MESSAGE);
      }
    }//GEN-LAST:event_CadastrarActionPerformed
    
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        nome.setText(null);
        JTmarca.setText(null);
        jTquantidade.setText(null);
        jTvalorVenda.setText(null);
        jTvalorCompra.setText(null);
        jTcodigoBarra.setText(null);
        jTdescricao.setText(null);
                
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBLimparMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBLimparMouseClicked

    private void jBcadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarFornecedorActionPerformed
        FornecedorGUI fornecedorCad = new FornecedorGUI(ProdutoGUI.this);
        
    }//GEN-LAST:event_jBcadastrarFornecedorActionPerformed

    private void jCFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCFornecedorActionPerformed
    private String[] getForne(){
       FornecedorDAO fornecedor2 = new FornecedorDAO();
       forne = fornecedor2.ListarFornecedor();
       String[] fornecedores = new String[forne.size()];
       int i = 0;
       for(Fornecedor f : forne){
        fornecedores[i]  = f.getNome();
        i++;
       }
       return fornecedores;
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField JTmarca;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBcadastrarFornecedor;
    private javax.swing.JComboBox jCFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcodigoBarra;
    private javax.swing.JTextArea jTdescricao;
    private javax.swing.JTextField jTquantidade;
    private javax.swing.JTextField jTvalorCompra;
    private javax.swing.JTextField jTvalorVenda;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables

    private void setNome(JTextField nome) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
