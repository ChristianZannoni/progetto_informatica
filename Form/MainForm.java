/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import javax.swing.table.DefaultTableModel;
import gestori.Gestore;
/**
 *
 * @author andreinm
 */
public class MainForm extends javax.swing.JFrame {
    private Gestore gestore = new Gestore();
    
    public MainForm() {
        initComponents();
    }
    public Gestore getGestore(){
        return gestore;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CorsiButton = new javax.swing.JButton();
        DisciplineButton = new javax.swing.JButton();
        DocentiButton = new javax.swing.JButton();
        StudentiButton = new javax.swing.JButton();
        AppelliButton = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CorsiButton.setText("Corsi");
        CorsiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorsiButtonActionPerformed(evt);
            }
        });

        DisciplineButton.setText("Discipline");
        DisciplineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisciplineButtonActionPerformed(evt);
            }
        });

        DocentiButton.setText("Docenti");
        DocentiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocentiButtonActionPerformed(evt);
            }
        });

        StudentiButton.setText("Studenti");
        StudentiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentiButtonActionPerformed(evt);
            }
        });

        AppelliButton.setText("Appelli");
        AppelliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppelliButtonActionPerformed(evt);
            }
        });

        Close.setText("Chiudi Applicazione");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });

        jLabel1.setText("Gestione Università - Andrein Davolio Zannoni");

        jButton1.setText("Salva Modifiche");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(StudentiButton)
                .addGap(81, 81, 81)
                .addComponent(AppelliButton)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CorsiButton)
                .addGap(65, 65, 65)
                .addComponent(DisciplineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(DocentiButton)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorsiButton)
                    .addComponent(DisciplineButton)
                    .addComponent(DocentiButton))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StudentiButton)
                    .addComponent(AppelliButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Close)
                    .addComponent(jButton1))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisciplineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisciplineButtonActionPerformed
        DisciplineForm d = new DisciplineForm(this, true);
        d.setVisible(true);
    }//GEN-LAST:event_DisciplineButtonActionPerformed

    private void CorsiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorsiButtonActionPerformed
        CorsiForm c = new CorsiForm(this, true);
        c.setVisible(true);
    }//GEN-LAST:event_CorsiButtonActionPerformed

    private void DocentiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocentiButtonActionPerformed
        DocentiForm doc = new DocentiForm(this, true);
        doc.setVisible(true);
    }//GEN-LAST:event_DocentiButtonActionPerformed

    private void StudentiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentiButtonActionPerformed
        StudentiForm s = new StudentiForm(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_StudentiButtonActionPerformed

    private void AppelliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppelliButtonActionPerformed
        AppelliForm a = new AppelliForm(this, true);
        a.setVisible(true);
    }//GEN-LAST:event_AppelliButtonActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        dispose();
        this.setVisible(false);
    }//GEN-LAST:event_CloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    gestore.caricatutto();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AppelliButton;
    private javax.swing.JButton Close;
    private javax.swing.JButton CorsiButton;
    private javax.swing.JButton DisciplineButton;
    private javax.swing.JButton DocentiButton;
    private javax.swing.JButton StudentiButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
}
