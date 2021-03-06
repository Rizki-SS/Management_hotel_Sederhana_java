package frontend;

import backend.*;

public class pembayaranForm extends javax.swing.JFrame {

    public pembayaranForm() {
        initComponents();
        setSumary();
    }

    public void setSumary() {
        int diskon = 0;
        txtNama.setText(ProsesPemesanan.getTransaksi().getTamu().getNamaTamu());
        txtAlamat.setText((ProsesPemesanan.getTransaksi().getTamu().getAlamat()));
        txtIdKamar.setText(String.valueOf(ProsesPemesanan.getTransaksi().getLamaInap()));
        if (selectMethod.getSelectedIndex() == 1) {
            diskon = 10000;
        }
        txtDiskon.setText(String.valueOf(diskon));
        txtTotal.setText(String.valueOf(ProsesPemesanan.getTransaksi().getTotal() - diskon));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        btHome = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        btTamu = new javax.swing.JMenu();
        menuTamu = new javax.swing.JMenuItem();
        menuKamar = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenuItem();
        menuBayar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNmPembayar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNoId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        selectMethod = new javax.swing.JComboBox<>();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        txtNama = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtIdKamar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        btBack = new javax.swing.JButton();
        BtPembayaran = new javax.swing.JButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        btHome2 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        btTamu2 = new javax.swing.JMenu();
        menuTamu2 = new javax.swing.JMenuItem();
        menuKamar2 = new javax.swing.JMenuItem();
        menuTransaksi2 = new javax.swing.JMenuItem();
        menuBayar2 = new javax.swing.JMenuItem();

        btHome.setText("Home");
        btHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHomeMouseClicked(evt);
            }
        });

        jMenuItem4.setText("Halaman Utama");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btHome.add(jMenuItem4);

        jMenuItem2.setText("Pemesanan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btHome.add(jMenuItem2);

        jMenuItem3.setText("exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btHome.add(jMenuItem3);

        jMenuBar2.add(btHome);

        btTamu.setText("Manajement");

        menuTamu.setText("Tamu");
        menuTamu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTamuMouseClicked(evt);
            }
        });
        menuTamu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamuActionPerformed(evt);
            }
        });
        btTamu.add(menuTamu);

        menuKamar.setText("Kamar");
        menuKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuKamarMouseClicked(evt);
            }
        });
        menuKamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKamarActionPerformed(evt);
            }
        });
        btTamu.add(menuKamar);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        btTamu.add(menuTransaksi);

        menuBayar.setText("Bayar");
        menuBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBayarActionPerformed(evt);
            }
        });
        btTamu.add(menuBayar);

        jMenuBar2.add(btTamu);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Pembayaran");

        jLabel3.setText("Nama");

        txtNmPembayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmPembayarActionPerformed(evt);
            }
        });

        jLabel5.setText("No. Id");

        txtNoId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNoIdFocusLost(evt);
            }
        });

        jLabel7.setText("Metode");

        selectMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tunai", "Credit/Debit Card" }));
        selectMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMethodActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNmPembayar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtNoId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(selectMethod, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoId)
                    .addComponent(txtNmPembayar)
                    .addComponent(selectMethod, 0, 517, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNmPembayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(selectMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setText("Diskon :");

        txtDiskon.setText("jLabel14");

        txtTotal.setText("jLabel15");

        jLabel10.setText("Total :");

        jLayeredPane3.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtDiskon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(txtTotal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDiskon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotal))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        txtNama.setText("jLabel11");

        txtAlamat.setText("jLabel12");

        jLabel6.setText("Alamat : ");

        jLabel2.setText("Nama :");

        jLabel8.setText("Id Kamar :");

        txtIdKamar.setText("jLabel13");

        jLayeredPane2.setLayer(txtNama, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtAlamat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtIdKamar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(txtIdKamar))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAlamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNama, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(txtNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlamat))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtIdKamar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Sumary");

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        BtPembayaran.setText("Komfirmasi");
        BtPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPembayaranActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(btBack, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(BtPembayaran, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtPembayaran, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btBack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addComponent(BtPembayaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBack)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        btHome2.setText("Home");
        btHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btHome2MouseClicked(evt);
            }
        });

        jMenuItem8.setText("Halaman Utama");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        btHome2.add(jMenuItem8);

        jMenuItem9.setText("Pemesanan");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        btHome2.add(jMenuItem9);

        jMenuItem10.setText("exit");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        btHome2.add(jMenuItem10);

        jMenuBar4.add(btHome2);

        btTamu2.setText("Manajement");

        menuTamu2.setText("Tamu");
        menuTamu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTamu2MouseClicked(evt);
            }
        });
        menuTamu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTamu2ActionPerformed(evt);
            }
        });
        btTamu2.add(menuTamu2);

        menuKamar2.setText("Kamar");
        menuKamar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuKamar2MouseClicked(evt);
            }
        });
        menuKamar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKamar2ActionPerformed(evt);
            }
        });
        btTamu2.add(menuKamar2);

        menuTransaksi2.setText("Transaksi");
        menuTransaksi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksi2ActionPerformed(evt);
            }
        });
        btTamu2.add(menuTransaksi2);

        menuBayar2.setText("Bayar");
        menuBayar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBayar2ActionPerformed(evt);
            }
        });
        btTamu2.add(menuBayar2);

        jMenuBar4.add(btTamu2);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(255, 255, 255))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNmPembayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmPembayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmPembayarActionPerformed

    private void txtNoIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNoIdFocusLost

    }//GEN-LAST:event_txtNoIdFocusLost

    private void BtPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPembayaranActionPerformed
        if (selectMethod.getSelectedIndex() == 1) {
            Pembayaran pem = new Card(txtNmPembayar.getText(), txtNoId.getText());
            ProsesPemesanan.setPembayaran(pem);
        } else {
            Pembayaran pem = new Pembayaran(txtNmPembayar.getText(), txtNoId.getText());
            ProsesPemesanan.setPembayaran(pem);
        }

        ProsesPemesanan.save();
        
        Main mn = new Main();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtPembayaranActionPerformed

    private void selectMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMethodActionPerformed
        setSumary();
    }//GEN-LAST:event_selectMethodActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        PemesananForm pmsForm = new PemesananForm();
        this.setVisible(false);
        pmsForm.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Main mn = new Main();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        TamuForm t = new TamuForm();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHomeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btHomeMouseClicked

    private void menuTamuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTamuMouseClicked

    }//GEN-LAST:event_menuTamuMouseClicked

    private void menuTamuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamuActionPerformed
        // TODO add your handling code here:
        TamuForm t = new TamuForm();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuTamuActionPerformed

    private void menuKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuKamarMouseClicked

    }//GEN-LAST:event_menuKamarMouseClicked

    private void menuKamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKamarActionPerformed
        // TODO add your handling code here:
        FrmKamar k = new FrmKamar();
        k.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuKamarActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
        // TODO add your handling code here:
        MngTransaksiForm mt = new MngTransaksiForm();
        mt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuTransaksiActionPerformed

    private void menuBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBayarActionPerformed
        // TODO add your handling code here:
        pembayaranForm p = new pembayaranForm();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBayarActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Main mn = new Main();
        mn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        TamuForm t = new TamuForm();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void btHome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btHome2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btHome2MouseClicked

    private void menuTamu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTamu2MouseClicked

    }//GEN-LAST:event_menuTamu2MouseClicked

    private void menuTamu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTamu2ActionPerformed
        // TODO add your handling code here:
        TamuForm t = new TamuForm();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuTamu2ActionPerformed

    private void menuKamar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuKamar2MouseClicked

    }//GEN-LAST:event_menuKamar2MouseClicked

    private void menuKamar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKamar2ActionPerformed
        // TODO add your handling code here:
        FrmKamar k = new FrmKamar();
        k.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuKamar2ActionPerformed

    private void menuTransaksi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksi2ActionPerformed
        // TODO add your handling code here:
        MngTransaksiForm mt = new MngTransaksiForm();
        mt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuTransaksi2ActionPerformed

    private void menuBayar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBayar2ActionPerformed
        // TODO add your handling code here:
        FormPembayaran p = new FormPembayaran();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuBayar2ActionPerformed

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
            java.util.logging.Logger.getLogger(pembayaranForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembayaranForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembayaranForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembayaranForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembayaranForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtPembayaran;
    private javax.swing.JButton btBack;
    private javax.swing.JMenu btHome;
    private javax.swing.JMenu btHome2;
    private javax.swing.JMenu btTamu;
    private javax.swing.JMenu btTamu2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem menuBayar;
    private javax.swing.JMenuItem menuBayar2;
    private javax.swing.JMenuItem menuKamar;
    private javax.swing.JMenuItem menuKamar2;
    private javax.swing.JMenuItem menuTamu;
    private javax.swing.JMenuItem menuTamu2;
    private javax.swing.JMenuItem menuTransaksi;
    private javax.swing.JMenuItem menuTransaksi2;
    private javax.swing.JComboBox<String> selectMethod;
    private javax.swing.JLabel txtAlamat;
    private javax.swing.JLabel txtDiskon;
    private javax.swing.JLabel txtIdKamar;
    private javax.swing.JLabel txtNama;
    private javax.swing.JTextField txtNmPembayar;
    private javax.swing.JTextField txtNoId;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
