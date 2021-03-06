/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enesbalaban.frameler;

import com.enesbalaban.kisiler.Hasta;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import com.enesbalaban.database.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author balab
 */
public class Doktorİslemler extends javax.swing.JFrame {

    Veriİslemleri islemler = new Veriİslemleri();

    DefaultTableModel modelHasta;

    /**
     * Creates new form Doktorİslemler
     */
    public Doktorİslemler() {

        initComponents();

        modelHasta = (DefaultTableModel) hastaTablosu.getModel();
        hastaGoruntule();
    }

    public void hastaGoruntule() {

        modelHasta.setRowCount(0);

        ArrayList<Hasta> hastalar = new ArrayList<Hasta>();

        hastalar = islemler.hastaGetir();

        if (hastalar != null) {

            for (Hasta hasta : hastalar) {

                Object[] eklenecek = {hasta.getId(), hasta.getIsim(), hasta.getSoyisim(), hasta.getTcNo(), hasta.getCinsiyet(), hasta.getEmail(), hasta.getTelefonNo(), hasta.getPolikinlik(), hasta.getSaat()};

                modelHasta.addRow(eklenecek);

            }
        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        hastaTablosu = new javax.swing.JTable();
        aramaCubugu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        cbCinsiyet = new javax.swing.JComboBox<>();
        emailAlani = new javax.swing.JTextField();
        telefonNoAlani = new javax.swing.JTextField();
        cbPolikinlik = new javax.swing.JComboBox<>();
        cbSaat = new javax.swing.JComboBox<>();
        tcAlani = new javax.swing.JTextField();
        hastaEkleButon = new javax.swing.JButton();
        silButon = new javax.swing.JButton();
        guncelleButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        hastaTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sıra Numarası", "Ad", "Soyad", "TC", "Cinsiyet", "Email", "Telefon No", "Polikinlik", "Saat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        hastaTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hastaTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hastaTablosu);
        if (hastaTablosu.getColumnModel().getColumnCount() > 0) {
            hastaTablosu.getColumnModel().getColumn(0).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(1).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(2).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(3).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(4).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(5).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(6).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(7).setResizable(false);
            hastaTablosu.getColumnModel().getColumn(8).setResizable(false);
        }

        aramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                aramaCubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad :");

        jLabel2.setText("Soyad :");

        jLabel3.setText("Cinsiyet :");

        jLabel4.setText("Email :");

        jLabel5.setText("Telefon :");

        jLabel6.setText("Polikinlik :");

        jLabel7.setText("Saat :");

        jLabel8.setText("Tc :");

        cbCinsiyet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erkek", "Kız" }));

        cbPolikinlik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acil", "KBB", "Dahiliye" }));

        cbSaat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08.00", "09.00", "10.00", "11.00", "13.00", "14.00", "15.00", "16.00", "17.00", " " }));

        hastaEkleButon.setText("Hasta Ekle");
        hastaEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaEkleButonActionPerformed(evt);
            }
        });

        silButon.setText("Hasta Sil");
        silButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButonActionPerformed(evt);
            }
        });

        guncelleButon.setText("Hasta Güncelle");
        guncelleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(emailAlani))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbCinsiyet, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soyadAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(adAlani)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(2, 2, 2)))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonNoAlani)
                                    .addComponent(cbPolikinlik, 0, 128, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcAlani)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cbSaat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hastaEkleButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(silButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(guncelleButon, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                .addGap(0, 106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbCinsiyet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(silButon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(emailAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(telefonNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(guncelleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbPolikinlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbSaat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tcAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hastaEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaEkleButonActionPerformed

        ArrayList<Hasta> hastalarTc = new ArrayList<Hasta>();

        hastalarTc = islemler.hastaGetir();

        String ad = adAlani.getText();
        String soyad = soyadAlani.getText();
        String cinsiyet = (String) cbCinsiyet.getSelectedItem();
        String email = emailAlani.getText();
        String telefonNo = telefonNoAlani.getText();
        String polikinlik = (String) cbPolikinlik.getSelectedItem();
        String tcNo = tcAlani.getText();
        String saat = (String) cbSaat.getSelectedItem();

        boolean varmi = true;

        if (!ad.equals("") && !soyad.equals("") && !email.equals("") && !telefonNo.equals("") && !tcNo.equals("")) {

            for (Hasta hasta : hastalarTc) {

                if (hasta.getTcNo().equals(tcNo)) {

                    JOptionPane.showMessageDialog(this, "Hasta zaten kayıtlı...");

                    varmi = false;

                    break;

                }
                if (hasta.getPolikinlik().equals(polikinlik) && hasta.getSaat().equals(saat)) {

                    JOptionPane.showMessageDialog(this, "Bu polikinlikte seçtiğiniz saat dolu...");

                    varmi = false;

                    break;
                }

            }

            if (varmi) {

                islemler.hastaEkle(ad, soyad, cinsiyet, email, telefonNo, polikinlik, tcNo, saat);

                hastaGoruntule();

                JOptionPane.showMessageDialog(this, "Yeni hasta başarıyla eklendi...");

                adAlani.setText("");
                soyadAlani.setText("");
                emailAlani.setText("");
                telefonNoAlani.setText("");
                tcAlani.setText("");
            }
        } else {

            JOptionPane.showMessageDialog(this, "Lütfen hastanın tüm bilgilerini girin...");
        }

    }//GEN-LAST:event_hastaEkleButonActionPerformed

    private void silButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonActionPerformed

        int selectedRow = hastaTablosu.getSelectedRow();

        if (selectedRow == -1) {

            if (modelHasta.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Hasta tablosu şuanda boş...");
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen silinecek bir hasta seçin...");
            }
        } else {

            int id = (int) modelHasta.getValueAt(selectedRow, 0);

            islemler.hastaSil(id);

            hastaGoruntule();

            JOptionPane.showMessageDialog(this, "Hasta başarıyla silindi...");

        }
    }//GEN-LAST:event_silButonActionPerformed

    private void guncelleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButonActionPerformed

        String ad = adAlani.getText();
        String soyad = soyadAlani.getText();
        String cinsiyet = (String) cbCinsiyet.getSelectedItem();
        String email = emailAlani.getText();
        String telefonNo = telefonNoAlani.getText();
        String polikinlik = (String) cbPolikinlik.getSelectedItem();
        String tc = tcAlani.getText();
        String saat = (String) cbSaat.getSelectedItem();

        int selectedRow = hastaTablosu.getSelectedRow();

        if (selectedRow == -1) {

            if (modelHasta.getRowCount() == 0) {

                JOptionPane.showMessageDialog(this, "Tabloda hiç hasta yok..");
            } else {
                JOptionPane.showMessageDialog(this, "Lütfen güncellenecek bir hasta seçin...");
            }

        } else {

            int id = (int) modelHasta.getValueAt(selectedRow, 0);

            islemler.hastaGuncelle(id, ad, soyad, cinsiyet, email, telefonNo, polikinlik, tc, saat);

            hastaGoruntule();

            JOptionPane.showMessageDialog(this, "Hasta başarıyla güncellendi..");

        }
    }//GEN-LAST:event_guncelleButonActionPerformed

    private void hastaTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hastaTablosuMouseClicked

        int selectedRow = hastaTablosu.getSelectedRow();

        adAlani.setText(modelHasta.getValueAt(selectedRow, 1).toString());
        soyadAlani.setText(modelHasta.getValueAt(selectedRow, 2).toString());
        tcAlani.setText(modelHasta.getValueAt(selectedRow, 3).toString());
        cbCinsiyet.setSelectedItem(modelHasta.getValueAt(selectedRow, 4).toString());
        emailAlani.setText(modelHasta.getValueAt(selectedRow, 5).toString());
        telefonNoAlani.setText(modelHasta.getValueAt(selectedRow, 6).toString());
        cbPolikinlik.setSelectedItem(modelHasta.getValueAt(selectedRow, 7).toString());
        cbSaat.setSelectedItem(modelHasta.getValueAt(selectedRow, 8).toString());

    }//GEN-LAST:event_hastaTablosuMouseClicked

    public void hastaDinamikAra(String ara) {

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(modelHasta);

        hastaTablosu.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    private void aramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aramaCubuguKeyReleased

        String ara = aramaCubugu.getText();

        hastaDinamikAra(ara);
    }//GEN-LAST:event_aramaCubuguKeyReleased

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
            java.util.logging.Logger.getLogger(Doktorİslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doktorİslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doktorİslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doktorİslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doktorİslemler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adAlani;
    private javax.swing.JTextField aramaCubugu;
    private javax.swing.JComboBox<String> cbCinsiyet;
    private javax.swing.JComboBox<String> cbPolikinlik;
    private javax.swing.JComboBox<String> cbSaat;
    private javax.swing.JTextField emailAlani;
    private javax.swing.JButton guncelleButon;
    private javax.swing.JButton hastaEkleButon;
    private javax.swing.JTable hastaTablosu;
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
    private javax.swing.JButton silButon;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JTextField tcAlani;
    private javax.swing.JTextField telefonNoAlani;
    // End of variables declaration//GEN-END:variables
}
