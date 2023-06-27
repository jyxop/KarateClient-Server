/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rs.ac.bg.fon.nprog.forme;


import java.util.logging.Level;
import java.util.logging.Logger;

import rs.ac.bg.fon.nprog.domen.Trener;
import rs.ac.bg.fon.nprog.forme.clan.DodajClana;
import rs.ac.bg.fon.nprog.forme.clan.PretragaClana;
import rs.ac.bg.fon.nprog.forme.trening.DodajTrening;
import rs.ac.bg.fon.nprog.forme.trening.PretragaTrening;
import rs.ac.bg.fon.nprog.kontroler.Kontroler;


/**
 *
 * @author HP
 */
public class GlavnaKlijentskaForma extends javax.swing.JFrame {

    /**
     * Creates new form GlavnaKlijentskaForma
     */
    Trener ulogovaniTrener;
    public GlavnaKlijentskaForma() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelaUlogovani = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnDodajClana = new javax.swing.JButton();
        btnPretragaClana = new javax.swing.JButton();
        btnDodajTrening = new javax.swing.JButton();
        btnPretragaTrening = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        izlogujTrenera = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LegendsKarateApp");
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelaUlogovani.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelaUlogovani.setForeground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ulogovani trener: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Član");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Trening");

        btnDodajClana.setBackground(new java.awt.Color(204, 204, 204));
        btnDodajClana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDodajClana.setText("Unos člana");
        btnDodajClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajClanaActionPerformed(evt);
            }
        });

        btnPretragaClana.setBackground(new java.awt.Color(204, 204, 204));
        btnPretragaClana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPretragaClana.setText("Pretraga člana");
        btnPretragaClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaClanaActionPerformed(evt);
            }
        });

        btnDodajTrening.setBackground(new java.awt.Color(204, 204, 204));
        btnDodajTrening.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDodajTrening.setText("Unos treninga");
        btnDodajTrening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajTreningActionPerformed(evt);
            }
        });

        btnPretragaTrening.setBackground(new java.awt.Color(204, 204, 204));
        btnPretragaTrening.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPretragaTrening.setText("Pretraga treninga");
        btnPretragaTrening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPretragaTreningActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\KaratePSKlijent\\resources\\logo.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPretragaClana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDodajClana, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPretragaTrening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDodajTrening, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelaUlogovani, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelaUlogovani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodajClana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajTrening, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPretragaClana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPretragaTrening, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        izlogujTrenera.setBackground(new java.awt.Color(255, 55, 55));
        izlogujTrenera.setText("Odjavi se");
        izlogujTrenera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        izlogujTrenera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                izlogujTreneraMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                izlogujTreneraMouseExited(evt);
            }
        });
        jMenuBar1.add(izlogujTrenera);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajClanaActionPerformed
         DodajClana dc= new DodajClana(this);
         dc.setVisible(true);
    }//GEN-LAST:event_btnDodajClanaActionPerformed

    private void btnPretragaClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaClanaActionPerformed
         PretragaClana pc=new PretragaClana(this);
         pc.setVisible(true);
    }//GEN-LAST:event_btnPretragaClanaActionPerformed

    private void btnDodajTreningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajTreningActionPerformed
        DodajTrening dn= new DodajTrening(this, ulogovaniTrener);
        dn.setVisible(true);
    }//GEN-LAST:event_btnDodajTreningActionPerformed

    private void btnPretragaTreningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPretragaTreningActionPerformed
         PretragaTrening pt=new PretragaTrening(this, ulogovaniTrener);
         pt.setVisible(true);
    }//GEN-LAST:event_btnPretragaTreningActionPerformed

    private void izlogujTreneraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izlogujTreneraMouseClicked
       izlogujSe();
       this.dispose();
    }//GEN-LAST:event_izlogujTreneraMouseClicked

    private void izlogujTreneraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izlogujTreneraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_izlogujTreneraMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlavnaKlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaKlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaKlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaKlijentskaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaKlijentskaForma().setVisible(true);
            }
        });
    }

    void setUlogovaniTrener(Trener trener) {
        this.ulogovaniTrener = trener;
        labelaUlogovani.setText(ulogovaniTrener.getIme()+" "+ulogovaniTrener.getPrezime()+" "+ulogovaniTrener.getPojas()+" pojas");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajClana;
    private javax.swing.JButton btnDodajTrening;
    private javax.swing.JButton btnPretragaClana;
    private javax.swing.JButton btnPretragaTrening;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenu izlogujTrenera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelaUlogovani;
    // End of variables declaration//GEN-END:variables

    private void izlogujSe() {
        try {
            Kontroler.vratiInstancu().izlogujTrening(ulogovaniTrener);
        } catch (Exception ex) {
            Logger.getLogger(GlavnaKlijentskaForma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
