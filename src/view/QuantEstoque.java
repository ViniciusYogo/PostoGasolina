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
public class QuantEstoque extends javax.swing.JFrame {

    /**
     * Creates new form QuantEstoque
     */
    public QuantEstoque() {
        initComponents();
    }

         Atributos as = new Atributos();
    Conexao conn = new Conexao();
    Funcoes fun = new Funcoes();
    
      public void cadastroProd(){
        String nomeProd = jNomeProd.getText();
        int idProdut = Integer.parseInt(jIdProd.getText());
              
        as.setNomeProd(nomeProd);
        as.setIdProd(idProdut);
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jNomeProd = new javax.swing.JTextField();
        jIdProd = new javax.swing.JTextField();
        jVerificar = new javax.swing.JButton();
        jVoltar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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

        jVerificar.setText("Verificar");
        jVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerificarActionPerformed(evt);
            }
        });

        jVoltar1.setText("voltar");
        jVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltar1ActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel1.setText("Verificar Estoque");

        jLabel5.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jVoltar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11))))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jIdProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerificarActionPerformed
        // TODO add your handling code here:
        cadastroProd();
        fun.VerificarQuant(as);
    }//GEN-LAST:event_jVerificarActionPerformed

    private void jVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jVoltar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jIdProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jNomeProd;
    private javax.swing.JButton jVerificar;
    private javax.swing.JButton jVoltar1;
    // End of variables declaration//GEN-END:variables
}
