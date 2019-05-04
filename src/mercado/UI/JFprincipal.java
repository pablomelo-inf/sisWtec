
package mercado.UI;

public class JFprincipal extends javax.swing.JFrame {

    public JFprincipal() {
        initComponents();
        //this.setResizable(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jBVenda = new javax.swing.JButton();
        jBvendedor = new javax.swing.JButton();
        jBfornecedor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBclientes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBhistorico = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBproduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Vendas - MERCADO");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Painel de Controle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel6.setText("Produtos");

        jBVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart.png"))); // NOI18N
        jBVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVendaActionPerformed(evt);
            }
        });

        jBvendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/vendedor.png"))); // NOI18N
        jBvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvendedorActionPerformed(evt);
            }
        });

        jBfornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/caminhao3.png"))); // NOI18N
        jBfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfornecedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Vendedores");

        jBclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cliente.png"))); // NOI18N
        jBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBclientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Venda");

        jBhistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/historico.png"))); // NOI18N
        jBhistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhistoricoActionPerformed(evt);
            }
        });

        jLabel5.setText("Clientes");

        jLabel2.setText("fornecedor");

        jBproduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/produto.png"))); // NOI18N
        jBproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBprodutoActionPerformed(evt);
            }
        });

        jLabel3.setText("histórico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jBvendedor, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jBVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jBfornecedor, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jBhistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jBproduto, 0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBVenda)
                    .addComponent(jBhistorico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jBproduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBfornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBvendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))))
                .addGap(50, 50, 50))
        );

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(561, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVendaActionPerformed
//        VendaGUI venda = new VendaGUI();
//        venda.setVisible(true);
}//GEN-LAST:event_jBVendaActionPerformed

    private void jBfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfornecedorActionPerformed
        
        FornecedorGUI fornecedorCad = new FornecedorGUI(this);
        
        
    }//GEN-LAST:event_jBfornecedorActionPerformed

    private void jBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBclientesActionPerformed
        ClienteGUI cliente = new ClienteGUI(this);
    }//GEN-LAST:event_jBclientesActionPerformed

    private void jBvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvendedorActionPerformed
        VendedorGUI vendc = new VendedorGUI();
        vendc.setVisible(true);
}//GEN-LAST:event_jBvendedorActionPerformed

    private void jBprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBprodutoActionPerformed
        ListaProdutoGUI gui =  new ListaProdutoGUI();
}//GEN-LAST:event_jBprodutoActionPerformed

    private void jBhistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhistoricoActionPerformed
       HistoricoGUI historicoGui = new HistoricoGUI();
       historicoGui.setVisible(true);
    }//GEN-LAST:event_jBhistoricoActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JFprincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVenda;
    private javax.swing.JButton jBclientes;
    private javax.swing.JButton jBfornecedor;
    private javax.swing.JButton jBhistorico;
    private javax.swing.JButton jBproduto;
    private javax.swing.JButton jBvendedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
