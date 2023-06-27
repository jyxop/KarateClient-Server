/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rs.ac.bg.fon.nprog.forme.clan;


import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import rs.ac.bg.fon.nprog.domen.Clan;
import rs.ac.bg.fon.nprog.domen.Grupa;
import rs.ac.bg.fon.nprog.domen.OpstiDomenskiObjekat;
import rs.ac.bg.fon.nprog.forme.GlavnaKlijentskaForma;
import rs.ac.bg.fon.nprog.kontroler.Kontroler;
import rs.ac.bg.fon.nprog.modeli.ModelTabeleClanovi;


/**
 *
 * @author HP
 */
public class PretragaClana extends javax.swing.JFrame {

    /**
     * Creates new form PretragaClana
     */
    
    JFrame glavnaForma;
    ModelTabeleClanovi mtc;
    
    public PretragaClana() {
        initComponents();
    }
    
    public PretragaClana(GlavnaKlijentskaForma glavna) {
        initComponents();
        glavnaForma= glavna;
        srediFormu();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbGrupa = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClanovi = new javax.swing.JTable();
        btnObrisiClana = new javax.swing.JButton();
        btnIzmeniClana = new javax.swing.JButton();
        btnDodajClana = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pretraga članova", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Izaberi grupu :");

        cbGrupa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbGrupa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tabelaClanovi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaClanovi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaClanovi);

        btnObrisiClana.setBackground(new java.awt.Color(204, 204, 204));
        btnObrisiClana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnObrisiClana.setText("Obriši člana");
        btnObrisiClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiClanaActionPerformed(evt);
            }
        });

        btnIzmeniClana.setBackground(new java.awt.Color(204, 204, 204));
        btnIzmeniClana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIzmeniClana.setText("Izmeni člana");
        btnIzmeniClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmeniClanaActionPerformed(evt);
            }
        });

        btnDodajClana.setBackground(new java.awt.Color(204, 204, 204));
        btnDodajClana.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDodajClana.setText("Dodaj člana");
        btnDodajClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajClanaActionPerformed(evt);
            }
        });

        btnOtkazi.setBackground(new java.awt.Color(204, 204, 204));
        btnOtkazi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnOtkazi.setText("Otkaži");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbGrupa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDodajClana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIzmeniClana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisiClana, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOtkazi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbGrupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnObrisiClana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzmeniClana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajClana, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOtkazi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDodajClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajClanaActionPerformed
        Grupa grupa=(Grupa) cbGrupa.getSelectedItem();
        if(grupa==null || grupa.getNaziv().equals("Sve grupe")){
            JOptionPane.showMessageDialog(rootPane, "Izaberite konkretnu grupu!", "Greška", JOptionPane.INFORMATION_MESSAGE);
        }else{
        DodajClana dc= new DodajClana(this,grupa);
        dc.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_btnDodajClanaActionPerformed

    private void btnIzmeniClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmeniClanaActionPerformed
        int red = tabelaClanovi.getSelectedRow();
        if (red == -1) {
            JOptionPane.showMessageDialog(rootPane, "Izaberite člana koga želite da izmenite!", "Greška", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Clan izabrani = (Clan) mtc.getLista().get(red);
            DodajClana dci = new DodajClana(glavnaForma, izabrani);
            dci.setVisible(true);
            this.setVisible(false);
        }  
    }//GEN-LAST:event_btnIzmeniClanaActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        dispose();
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnObrisiClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiClanaActionPerformed
        int red = tabelaClanovi.getSelectedRow();
        if (red == -1) {
            JOptionPane.showMessageDialog(rootPane, "Izaberite člana koga želite da obrišete!", "Greška", JOptionPane.INFORMATION_MESSAGE);
        } else {
           try{
            Clan izabrani = (Clan) mtc.getLista().get(red);
            int odluka = JOptionPane.showConfirmDialog(this, "Da li ste sigurni da želite da obrišete izabranog člana " + izabrani.toString() + "?", "", JOptionPane.WARNING_MESSAGE);
            if (odluka == 0) {
                Clan c=Kontroler.vratiInstancu().obrisiClana(izabrani);
                JOptionPane.showMessageDialog(rootPane, "Obrisali ste podatke o članu: " + c.toString(), "Uspešno", JOptionPane.INFORMATION_MESSAGE);
                srediTabelu();
                }
           } catch (Exception ex) {
                Logger.getLogger(PretragaClana.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(rootPane, "Došlo je do greške prilikom brisanja clana!", "Greška", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_btnObrisiClanaActionPerformed

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
            java.util.logging.Logger.getLogger(PretragaClana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PretragaClana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PretragaClana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PretragaClana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PretragaClana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajClana;
    private javax.swing.JButton btnIzmeniClana;
    private javax.swing.JButton btnObrisiClana;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JComboBox cbGrupa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaClanovi;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        popuniCBGrupe();
        srediTabelu();
    }

    private void popuniCBGrupe() {
        try {
            cbGrupa.removeAllItems();
            List<OpstiDomenskiObjekat> listaGrupa=Kontroler.vratiInstancu().vratiGrupe();
            for (OpstiDomenskiObjekat g : listaGrupa) {
                cbGrupa.addItem(g);
            }
            Grupa sveGrupe = new Grupa();
            sveGrupe.setNaziv("Sve grupe");
            cbGrupa.addItem(sveGrupe);
            cbGrupa.setSelectedItem(null);
            cbGrupa.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    try {
                        Grupa izabranaGrupa = (Grupa) cbGrupa.getSelectedItem();
                        Clan clanNaOsnovuGrupe=new Clan();
                        clanNaOsnovuGrupe.setGrupa((Grupa) cbGrupa.getSelectedItem());
                        if(izabranaGrupa.getNaziv().equals("Sve grupe")){
                            srediTabelu();
                            return;
                        }
                        List<OpstiDomenskiObjekat> lista = Kontroler.vratiInstancu().nadjiClanove(clanNaOsnovuGrupe);
                        mtc.setLista(lista);
                        mtc.fireTableDataChanged();
                    } catch (Exception ex) {
                        Logger.getLogger(PretragaClana.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(rootPane, "Došlo je do greške!", "Greška", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
        } catch (Exception ex) {
            Logger.getLogger(PretragaClana.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             
    }

    private void srediTabelu() {
        try {
            List<OpstiDomenskiObjekat> listaClanova = Kontroler.vratiInstancu().vratiClanove();
            mtc = new ModelTabeleClanovi(listaClanova);
            tabelaClanovi.setModel(mtc);
        } catch (Exception ex) {
            Logger.getLogger(PretragaClana.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
