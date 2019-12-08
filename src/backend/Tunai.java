/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;

/**
 *
 * @author rizki
 */
public class Tunai extends Pembayaran implements crud{

    public Tunai() {
    }
    
    public Pembayaran getById(int id) {
        Pembayaran pem;
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM pembayaran WHERE id_kamar = '" + id + "'");

        try {
            while (rs.next()) {
                pem = new Tunai();
                pem.setId_pembayran(rs.getInt("id_pembayaraan"));
                pem.setNama(rs.getString("nama"));
                pem.setNama(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kmr;
    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
