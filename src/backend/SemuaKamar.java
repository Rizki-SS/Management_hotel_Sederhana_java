/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author rizki
 */
public class SemuaKamar extends Kamar{
    @Override
    public Kamar getById(int id) {
        Kamar kmr = new SemuaKamar();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM kamar WHERE id_kamar = '" + id + "'");

        try {
            while (rs.next()) {
                kmr = new SemuaKamar();
                kmr.setFasilitas(rs.getString("fasilitas"));
                kmr.setIdkamar(rs.getInt("id_kamar"));
                kmr.setHargaKamar(rs.getInt("harga"));
                kmr.setJenisKamar(rs.getString("jenis_kamar"));
                kmr.setJumlahKamar(rs.getInt("jumlah"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kmr;
    }
    
    @Override
     public ArrayList<Kamar> getAll() {
        ArrayList<Kamar> ListKamar = new ArrayList();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM kamar");
        try {
            while (rs.next()) {
                Kamar kmr = new SemuaKamar();
                kmr.setFasilitas(rs.getString("fasilitas"));
                kmr.setIdkamar(rs.getInt("id_kamar"));
                kmr.setHargaKamar(rs.getInt("harga"));
                kmr.setJenisKamar(rs.getString("jenis_kamar"));
                kmr.setJumlahKamar(rs.getInt("jumlah"));
                ListKamar.add(kmr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKamar;
    }
}
