/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Classes.Funcoes;

/**
 *
 * @author vinic
 */
public class RelatorioEstoque extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public RelatorioEstoque() {
        initComponents();
    }
    Funcoes fun = new Funcoes();
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jmostrar = new javax.swing.JTextArea();
        jGerar = new javax.swing.JButton();
        jVoltar1 = new javax.swing.JButton();
        jVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jmostrar.setColumns(20);
        jmostrar.setRows(5);
        jScrollPane1.setViewportView(jmostrar);

        jGerar.setText("GERAR RELATÓRIO");
        jGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGerarActionPerformed(evt);
            }
        });

        jVoltar1.setText("voltar");

        jVoltar2.setText("voltar");
        jVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jVoltar2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 168, Short.MAX_VALUE)
                    .addComponent(jVoltar1)
                    .addGap(0, 169, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jGerar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jVoltar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 139, Short.MAX_VALUE)
                    .addComponent(jVoltar1)
                    .addGap(0, 138, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGerarActionPerformed
        fun.exibirRelatorio(jmostrar);
    }//GEN-LAST:event_jGerarActionPerformed

    private void jVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltar2ActionPerformed
               this.dispose();
    }//GEN-LAST:event_jVoltar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jGerar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVoltar1;
    private javax.swing.JButton jVoltar2;
    private javax.swing.JTextArea jmostrar;
    // End of variables declaration//GEN-END:variables
}
