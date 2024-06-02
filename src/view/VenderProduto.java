/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Classes.Atributos;
import Classes.Conexao;
import Classes.Funcoes;

/**
 *
 * @author vinic
 */
public class VenderProduto extends javax.swing.JFrame {

    /**
     * Creates new form VenderProduto
     */
    public VenderProduto() {
        initComponents();
    }

    Atributos as = new Atributos();
    Conexao conn = new Conexao();
    Funcoes fun = new Funcoes();
    
    public void cadastroProd(){
        String nomeProd = jNomeProd.getText();
        int idProdut = Integer.parseInt(jIdProd.getText());
        int quantProd = Integer.parseInt(jQuantProd.getText());
        
        
        as.setNomeProd(nomeProd);
        as.setIdProd(idProdut);
        as.setQuantProd(quantProd);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNomeProd = new javax.swing.JTextField();
        jIdProd = new javax.swing.JTextField();
        jAbastecer = new javax.swing.JButton();
        jVoltar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jQuantProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jNomeProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeProdActionPerformed(evt);
            }
        });

        jIdProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdProdActionPerformed(evt);
            }
        });

        jAbastecer.setText("Vender");
        jAbastecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAbastecerActionPerformed(evt);
            }
        });

        jVoltar1.setText("Voltar");
        jVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltar1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel1.setText("VENDA PRODUTO");

        jLabel4.setText("Quantidade");

        jLabel5.setText("Nome");

        jQuantProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQuantProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jIdProd, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jAbastecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jQuantProd, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(jVoltar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQuantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAbastecer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeProdActionPerformed

    private void jIdProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdProdActionPerformed

    private void jAbastecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAbastecerActionPerformed
        // TODO add your handling code here:
        cadastroProd();
        fun.Vender(as);
    }//GEN-LAST:event_jAbastecerActionPerformed

    private void jVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jVoltar1ActionPerformed

    private void jQuantProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQuantProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jQuantProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAbastecer;
    private javax.swing.JTextField jIdProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNomeProd;
    private javax.swing.JTextField jQuantProd;
    private javax.swing.JButton jVoltar1;
    // End of variables declaration//GEN-END:variables
}
