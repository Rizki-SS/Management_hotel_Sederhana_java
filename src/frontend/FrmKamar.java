package frontend;

import backend.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;

public class FrmKamar extends javax.swing.JFrame {

    public FrmKamar() {
        initComponents();
        tampilkanData();
        kosongkanForm();
    }
    
    public void kosongkanForm(){
        txtIdkamar.setText("0");
        txtFasilitas.setText("");
        txtJmlKmr.setText("");
        txtHrgKmr.setText("");
        txtJnsKmr.setText("");
    }

    public void tampilkanData() {
        String[] kolom = {"id_kamar", "Jenis Kamar", "Harga Kamar", "Jumlah Kamar", "Fasilitas"};
        ArrayList<Kamar> list = new SemuaKamar().getAll();
        Object rowData[] = new Object[5];

        tblKamar.setModel(new DefaultTableModel(new Object[][]{}, kolom));

        for (int i = 0; i < list.size(); i++) {
            rowData[0] = list.get(i).getIdkamar();
            rowData[1] = list.get(i).getJenisKamar();
            rowData[2] = list.get(i).getHargaKamar();
            rowData[3] = list.get(i).getJumlahKamar();
            rowData[4] = list.get(i).getFasilitas();

            ((DefaultTableModel) tblKamar.getModel()).addRow(rowData);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKamar = new javax.swing.JTable();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        BtnSimpan = new javax.swing.JButton();
        BtnCari = new javax.swing.JButton();
        BtnHps = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtIdkamar = new javax.swing.JTextField();
        txtJnsKmr = new javax.swing.JTextField();
        txtHrgKmr = new javax.swing.JTextField();
        txtJmlKmr = new javax.swing.JTextField();
        txtFasilitas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kamar");

        tblKamar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKamarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKamar);

        BtnSimpan.setText("SIMPAN");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnCari.setText("Clear");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });

        BtnHps.setText("HAPUS");
        BtnHps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHpsActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(BtnSimpan, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BtnCari, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BtnHps, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnHps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnSimpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(BtnSimpan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnHps)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        txtIdkamar.setEditable(false);
        txtIdkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdkamarActionPerformed(evt);
            }
        });

        txtJnsKmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJnsKmrActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Kamar");

        jLabel3.setText("Jenis Kamar");

        jLabel4.setText("Harga Kamar");

        jLabel5.setText("Jumlah Kamar");

        jLabel6.setText("Fasilitas");

        jLayeredPane2.setLayer(txtIdkamar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtJnsKmr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtHrgKmr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtJmlKmr, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtFasilitas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFasilitas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(txtJmlKmr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHrgKmr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtJnsKmr, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdkamar, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJnsKmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHrgKmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJmlKmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLayeredPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdkamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdkamarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdkamarActionPerformed

    private void txtJnsKmrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJnsKmrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJnsKmrActionPerformed

    private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
        // TODO add your handling code here:
        Kamar kmr = new SemuaKamar();
        kmr.setIdkamar(Integer.parseInt(txtIdkamar.getText()));
        kmr.setHargaKamar(Integer.parseInt(txtHrgKmr.getText()));
        kmr.setFasilitas(txtFasilitas.getText());
        kmr.setJenisKamar(txtJnsKmr.getText());
        kmr.setJumlahKamar(Integer.parseInt(txtJmlKmr.getText()));
        kmr.save();;

        txtIdkamar.setText(Integer.toString(kmr.getIdkamar()));
         kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_BtnSimpanActionPerformed

    private void BtnHpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHpsActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblKamar.getModel();
        int row =tblKamar.getSelectedRow();
        
        Kamar kmr = new KamarKosong().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
        kmr.delete();
        kosongkanForm();
        tampilkanData();
    }//GEN-LAST:event_BtnHpsActionPerformed

    private void BtnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCariActionPerformed
        kosongkanForm();
    }//GEN-LAST:event_BtnCariActionPerformed

    private void tblKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKamarMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblKamar.getModel();
        int row =tblKamar.getSelectedRow();
        
        txtIdkamar.setText(model.getValueAt(row, 0).toString());
        txtJnsKmr.setText(model.getValueAt(row, 1).toString());
        txtHrgKmr.setText(model.getValueAt(row, 2).toString());
        txtJmlKmr.setText(model.getValueAt(row, 3).toString());
        txtFasilitas.setText(model.getValueAt(row, 4).toString());
    }//GEN-LAST:event_tblKamarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmKamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCari;
    private javax.swing.JButton BtnHps;
    private javax.swing.JButton BtnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKamar;
    private javax.swing.JTextField txtFasilitas;
    private javax.swing.JTextField txtHrgKmr;
    private javax.swing.JTextField txtIdkamar;
    private javax.swing.JTextField txtJmlKmr;
    private javax.swing.JTextField txtJnsKmr;
    // End of variables declaration//GEN-END:variables
}
