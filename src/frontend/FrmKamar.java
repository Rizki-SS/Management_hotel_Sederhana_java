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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFasilitas = new javax.swing.JTextField();
        txtIdkamar = new javax.swing.JTextField();
        BtnSimpan = new javax.swing.JButton();
        BtnHps = new javax.swing.JButton();
        BtnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKamar = new javax.swing.JTable();
        txtJmlKmr = new javax.swing.JTextField();
        txtJnsKmr = new javax.swing.JTextField();
        txtHrgKmr = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kamar");

        jLabel2.setText("Id Kamar");

        jLabel3.setText("Jenis Kamar");

        jLabel4.setText("Harga Kamar");

        jLabel5.setText("Jumlah Kamar");

        jLabel6.setText("Fasilitas");

        txtIdkamar.setEditable(false);
        txtIdkamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdkamarActionPerformed(evt);
            }
        });

        BtnSimpan.setText("SIMPAN");
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });

        BtnHps.setText("HAPUS");
        BtnHps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHpsActionPerformed(evt);
            }
        });

        BtnCari.setText("Clear");
        BtnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCariActionPerformed(evt);
            }
        });

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

        txtJnsKmr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJnsKmrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnHps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCari))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel6))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdkamar, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                .addComponent(txtFasilitas)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(27, 27, 27)
                                .addComponent(txtJnsKmr))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtJmlKmr))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtHrgKmr, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdkamar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtJnsKmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHrgKmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtJmlKmr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpan)
                    .addComponent(BtnHps)
                    .addComponent(BtnCari))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKamar;
    private javax.swing.JTextField txtFasilitas;
    private javax.swing.JTextField txtHrgKmr;
    private javax.swing.JTextField txtIdkamar;
    private javax.swing.JTextField txtJmlKmr;
    private javax.swing.JTextField txtJnsKmr;
    // End of variables declaration//GEN-END:variables
}
