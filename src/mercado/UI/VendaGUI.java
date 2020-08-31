
package mercado.UI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mercado.DAO.ClienteDAO;
import mercado.DAO.ProdutoDAO;
import mercado.DAO.VendaDAO;
import mercado.DAO.VendedorDAO;
import mercado.Modelo.Cliente;
import mercado.Modelo.Venda;
import mercado.Modelo.Produto;
import mercado.Modelo.Vendedor;


public class VendaGUI extends javax.swing.JFrame {
    
   //private int quantidade = 0;
   
    public VendaGUI() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPvenda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTproduto = new javax.swing.JTable();
        jPpesProdu = new javax.swing.JPanel();
        jTcodProduto = new javax.swing.JTextField();
        jLcodProduto = new javax.swing.JLabel();
        jBpesquisarProd = new javax.swing.JButton();
        jBadcLista = new javax.swing.JButton();
        jLnomeprod = new javax.swing.JLabel();
        jLmarcaprod = new javax.swing.JLabel();
        jLprecoprod = new javax.swing.JLabel();
        jTnomeprod = new javax.swing.JTextField();
        jTmarcaprod = new javax.swing.JTextField();
        jTprecoprod = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTqtprod = new javax.swing.JTextField();
        jlqtEstoque = new javax.swing.JLabel();
        jTqtEstoque = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTnomecli = new javax.swing.JTextField();
        jLnome = new javax.swing.JLabel();
        jTcpfCli = new javax.swing.JTextField(11);
        jLcpfcli = new javax.swing.JLabel();
        jBpesquisarCli = new javax.swing.JButton();
        jTrg = new javax.swing.JTextField();
        jTtelefone = new javax.swing.JTextField();
        jTendereco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBvenda = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLSenha = new javax.swing.JLabel();
        jLuser = new javax.swing.JLabel();
        jTusuario = new javax.swing.JTextField();
        jBpesV = new javax.swing.JButton();
        jPsenha = new javax.swing.JPasswordField();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendas - MERCADO");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPvenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Sales"));

        jTproduto.setBackground(new java.awt.Color(227, 227, 227));
        jTproduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Marca", "ValorUnidade", "Quantidade", "ValorLíquido"
            }
        ));
        jTproduto.setGridColor(java.awt.Color.lightGray);
        jTproduto.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTproduto);

        jPpesProdu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        jPpesProdu.setPreferredSize(new java.awt.Dimension(407, 138));

        jLcodProduto.setText("CodigoProduto:");

        jBpesquisarProd.setText("Pesquisar");
        jBpesquisarProd.addActionListener(formListener);

        jBadcLista.setText("Adicionar à Lista");
        jBadcLista.addActionListener(formListener);

        jLnomeprod.setText("Nome:");

        jLmarcaprod.setText("Marca:");

        jLprecoprod.setText("Preço:");

        jTnomeprod.setEditable(false);

        jTmarcaprod.setEditable(false);

        jTprecoprod.setEditable(false);

        jLabel4.setText("Quantidade:");

        jlqtEstoque.setText("Qt.Estoque:");

        jTqtEstoque.setEditable(false);

        org.jdesktop.layout.GroupLayout jPpesProduLayout = new org.jdesktop.layout.GroupLayout(jPpesProdu);
        jPpesProdu.setLayout(jPpesProduLayout);
        jPpesProduLayout.setHorizontalGroup(
            jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPpesProduLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLcodProduto)
                    .add(jLprecoprod))
                .add(18, 18, 18)
                .add(jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jTprecoprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTcodProduto))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPpesProduLayout.createSequentialGroup()
                        .add(jLnomeprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTnomeprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLmarcaprod)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTmarcaprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 112, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPpesProduLayout.createSequentialGroup()
                        .add(jlqtEstoque)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTqtEstoque, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTqtprod)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 18, Short.MAX_VALUE)
                .add(jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jBpesquisarProd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 137, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jBadcLista, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPpesProduLayout.setVerticalGroup(
            jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPpesProduLayout.createSequentialGroup()
                .add(jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTcodProduto, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLcodProduto)
                    .add(jLnomeprod)
                    .add(jTnomeprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLmarcaprod)
                    .add(jTmarcaprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBpesquisarProd, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPpesProduLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLprecoprod)
                    .add(jTprecoprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlqtEstoque)
                    .add(jTqtEstoque, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4)
                    .add(jTqtprod, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jBadcLista))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Costumer"));
        jPanel3.setEnabled(false);

        jTnomecli.setEditable(false);

        jLnome.setText("Nome:");

        jLcpfcli.setText("CPF:");

        jBpesquisarCli.setLabel("Search");
        jBpesquisarCli.addActionListener(formListener);

        jTrg.setEditable(false);

        jTtelefone.setEditable(false);

        jTendereco.setEditable(false);

        jLabel1.setText("RG:");

        jLabel2.setText("Telefone:");

        jLabel3.setText("Endereco:");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLcpfcli)
                    .add(jLnome))
                .add(28, 28, 28)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jTnomecli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTendereco))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(jTcpfCli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(29, 29, 29)
                        .add(jTrg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 98, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 80, Short.MAX_VALUE)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTtelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jBpesquisarCli)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLnome)
                    .add(jTnomecli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)
                    .add(jTendereco, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLcpfcli)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jTcpfCli, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel1)
                        .add(jTrg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jTtelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel2)
                        .add(jBpesquisarCli)))
                .add(25, 25, 25))
        );

        jBpesquisarCli.getAccessibleContext().setAccessibleName("Search");

        jBvenda.setText("Finalizar Venda");
        jBvenda.addActionListener(formListener);

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(formListener);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Painel Vendedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N

        jLSenha.setText("Senha:");

        jLuser.setText("Usuario:");

        jBpesV.setText("Verificar");
        jBpesV.addActionListener(formListener);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLuser)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jTusuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLSenha)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPsenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(28, 28, 28)
                .add(jBpesV)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLuser)
                .add(jTusuario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jLSenha)
                .add(jPsenha, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(jBpesV))
        );

        org.jdesktop.layout.GroupLayout jPvendaLayout = new org.jdesktop.layout.GroupLayout(jPvenda);
        jPvenda.setLayout(jPvendaLayout);
        jPvendaLayout.setHorizontalGroup(
            jPvendaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPvendaLayout.createSequentialGroup()
                .add(jPvendaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jPvendaLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jBlimpar)
                        .add(18, 18, 18)
                        .add(jBvenda))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPvendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPvendaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jPpesProdu, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                            .add(jScrollPane1))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPvendaLayout.linkSize(new java.awt.Component[] {jBlimpar, jBvenda}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        jPvendaLayout.setVerticalGroup(
            jPvendaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPvendaLayout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPpesProdu, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 94, Short.MAX_VALUE)
                .add(jPvendaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jBvenda)
                    .add(jBlimpar))
                .add(36, 36, 36))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPvenda, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jPvenda, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPvenda.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(820, 671));
        setLocationRelativeTo(null);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jBpesquisarProd) {
                VendaGUI.this.jBpesquisarProdActionPerformed(evt);
            }
            else if (evt.getSource() == jBadcLista) {
                VendaGUI.this.jBadcListaActionPerformed(evt);
            }
            else if (evt.getSource() == jBpesquisarCli) {
                VendaGUI.this.jBpesquisarCliActionPerformed(evt);
            }
            else if (evt.getSource() == jBvenda) {
                VendaGUI.this.jBvendaActionPerformed(evt);
            }
            else if (evt.getSource() == jBlimpar) {
                VendaGUI.this.jBlimparActionPerformed(evt);
            }
            else if (evt.getSource() == jBpesV) {
                VendaGUI.this.jBpesVActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents
    Produto prod = new Produto();
    ArrayList<Produto> produto = new ArrayList();
    Venda lista = new Venda();
    
    private void jBpesquisarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarProdActionPerformed
       ProdutoDAO prodDAO = new ProdutoDAO();
        
       prod = prodDAO.pesqProduto(jTcodProduto.getText());
       if(!jTcodProduto.getText().equals(prod.getCodigoBarra())){
            JOptionPane.showMessageDialog(this, "Produto não Cadastrador!", "mensagem sistema", JOptionPane.ERROR_MESSAGE);
       }else{
            jTnomeprod.setText(prod.getNome());      
            jTmarcaprod.setText(prod.getMarca());
            jTprecoprod.setText(String.valueOf(prod.getValorVenda()));
            jTqtEstoque.setText(String.valueOf(prod.getQtEstoque()));
           
           
            
       }
      
}//GEN-LAST:event_jBpesquisarProdActionPerformed
Cliente cli =  new Cliente();
    private void jBpesquisarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesquisarCliActionPerformed
        ClienteDAO clientedao = new ClienteDAO();
        
        cli = clientedao.PesquisaCli(jTcpfCli.getText());
        
        if(cli.getCpf() == null){
          JOptionPane.showMessageDialog(this, "Cliente Não cadastrado!", "Mensagem Sistema", JOptionPane.ERROR_MESSAGE);
         
        }else{
        jTnomecli.setText(cli.getNome());
        jTrg.setText(cli.getRg());
        jTtelefone.setText(cli.getTel());
        jTendereco.setText(cli.getEndereco());
      
        }
    }//GEN-LAST:event_jBpesquisarCliActionPerformed
   
    private void jBadcListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBadcListaActionPerformed
      // quantidade += Integer.parseInt(jTqtprod.getText());
        
    try{
        prod.setQtparc(Integer.parseInt(jTqtprod.getText()));
        int estoque=Integer.parseInt(jTqtEstoque.getText());
        int qt=Integer.parseInt(jTqtprod.getText());
        if( (estoque >=qt)& (estoque > 0 )){
        lista.setProdutos(prod);
        produto.add(prod);
         DefaultTableModel modelo2 =  new DefaultTableModel();
         
         modelo2.addColumn("Nome");
         modelo2.addColumn("Marca");
         modelo2.addColumn("ValorUnidade");
         modelo2.addColumn("Quantidade");
         modelo2.addColumn("ValorLíquido");
         float valor = 0;
         for(Produto f : produto){ 
             valor += (f.getValorVenda()*f.getQtparc());
             modelo2.addRow(new Object[]{f.getNome(),f.getMarca(),f.getValorVenda(),f.getQtparc(),valor});
             lista.setValorTotal(valor);
          
         }
        jTnomeprod.setText("");      
        jTmarcaprod.setText("");
        jTprecoprod.setText("");
        jTqtprod.setText("");
        jTproduto.setModel(modelo2);
        jTcodProduto.setText("");
        jTqtEstoque.setText("");
      }else{
          JOptionPane.showMessageDialog(this, "Qt.Estoque menor do que a quantidade Solicitada", "Mensagem Sistema", JOptionPane.ERROR_MESSAGE);
          jTnomeprod.setText("");      
          jTmarcaprod.setText("");
          jTprecoprod.setText("");
          jTqtprod.setText("");
          jTcodProduto.setText("");
          jTqtEstoque.setText("");
      }
             }catch(Exception e ){
          // e.getCause();
           JOptionPane.showMessageDialog(this, "Por favor Entre com a quantidade de Produtos!", "Mensagem do sistema",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_jBadcListaActionPerformed

    private void jBvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvendaActionPerformed
      try{
        
        VendaDAO dao =new VendaDAO();
        lista.setCpfcli(cli.getCpf());
        lista.setCpfve(venduser.getCpf());
        lista.setRgve(venduser.getRg());
        boolean result = dao.CadVenda(lista);
        if(result){
           int ops =   JOptionPane.showConfirmDialog(this, "Venda Efetuada Com Sucesso, deseja Continuar?", "Mensagem Sistema", JOptionPane.YES_NO_OPTION);
           System.out.println(ops);
           
          
          if(ops == 0){ 
           //Se a venda foi efetivada, a venda antiga é setada como nula e criasse uma nova instancia para caso o vendedor
           //queria continuar vendendo.
           jTproduto.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
               {null, null, null, null, null}
               },
                   new String [] {
                       "Nome", "Marca", "ValorUnidade", "Quantidade", "ValorLíquido"
                   }
           ));
           
          produto = null; 
          prod = null;
          lista =null;
          produto = new ArrayList();
          prod = new Produto();    
          lista = new Venda();
          }else{
             this.setVisible(false);
          }
        }else{
           JOptionPane.showMessageDialog(this, "Erro na Venda, Verifique se os Dados estão corretos e tente novamente!", "Mensagem Sistema", JOptionPane.ERROR_MESSAGE);
     
        }
      }catch(NullPointerException e){
           JOptionPane.showMessageDialog(this, "Campos Inválidos!", "Mensagem Sistema", JOptionPane.ERROR_MESSAGE);
     
      }
    }//GEN-LAST:event_jBvendaActionPerformed

     ArrayList<Produto> pro;
    public String[] viewProd(){
      ProdutoDAO prodao = new ProdutoDAO(); 
      pro = new ArrayList<Produto>();
      pro = prodao.ListarProduto();
      String[] pr = new String[pro.size()];
      int i = 0;
      for(Produto p: pro){
          pr[i] = p.getCodigoBarra();
          i++;
      }
      return pr;
    }
    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBlimparActionPerformed
      Vendedor venduser; 
    private void jBpesVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpesVActionPerformed
        
        venduser = new Vendedor();
        VendedorDAO VendDAO    = new VendedorDAO();
        venduser =  VendDAO.pesquUSer(jTusuario.getText(),jPsenha.getText());
        if(venduser!=null){
//            jTcpfV.setText(venduser.getCpf());
//            jTRgV.setText(venduser.getRg());
//            jTnomeve.setText(venduser.getNome());
            JOptionPane.showMessageDialog(this, "Ok,Pode Prosseguir com venda!","mensagem sistema",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Vendedor Não Cadastrado!","mensagem sistema",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBpesVActionPerformed

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new VendaGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBadcLista;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBpesV;
    private javax.swing.JButton jBpesquisarCli;
    private javax.swing.JButton jBpesquisarProd;
    private javax.swing.JButton jBvenda;
    private javax.swing.JLabel jLSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLcodProduto;
    private javax.swing.JLabel jLcpfcli;
    private javax.swing.JLabel jLmarcaprod;
    private javax.swing.JLabel jLnome;
    private javax.swing.JLabel jLnomeprod;
    private javax.swing.JLabel jLprecoprod;
    private javax.swing.JLabel jLuser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPpesProdu;
    private javax.swing.JPasswordField jPsenha;
    private javax.swing.JPanel jPvenda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcodProduto;
    private javax.swing.JTextField jTcpfCli;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTmarcaprod;
    private javax.swing.JTextField jTnomecli;
    private javax.swing.JTextField jTnomeprod;
    private javax.swing.JTextField jTprecoprod;
    private javax.swing.JTable jTproduto;
    private javax.swing.JTextField jTqtEstoque;
    private javax.swing.JTextField jTqtprod;
    private javax.swing.JTextField jTrg;
    private javax.swing.JTextField jTtelefone;
    private javax.swing.JTextField jTusuario;
    private javax.swing.JLabel jlqtEstoque;
    // End of variables declaration//GEN-END:variables
}
