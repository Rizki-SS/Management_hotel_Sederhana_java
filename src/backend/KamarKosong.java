/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author rizki
 */
public class KamarKosong extends Kamar{
    @Override
    public ArrayList<Kamar> getAll() {
        ArrayList<Kamar> ListKamar = new ArrayList();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM kamar LEFT JOIN (SELECT id_kamar as id, COUNT(id_kamar) as jumlah_disewa FROM transaksi WHERE status = 0 GROUP BY id_kamar) as a ON id=id_kamar");
        try {
            while (rs.next()) {
                Kamar kmr = new KamarKosong();
                kmr.setFasilitas(rs.getString("fasilitas"));
                kmr.setIdkamar(rs.getInt("id_kamar"));
                kmr.setHargaKamar(rs.getInt("harga"));
                kmr.setJenisKamar(rs.getString("jenis_kamar"));
                if (rs.getString("jumlah_disewa") == "Null") {
                    kmr.setJumlahKamar(rs.getInt("jumlah"));
                }else{
                    kmr.setJumlahKamar(rs.getInt("jumlah")-rs.getInt("jumlah_disewa"));
                }
                ListKamar.add(kmr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKamar;
    }

    @Override
    public Kamar getById(int id) {
        Kamar kmr = new KamarKosong();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM kamar LEFT JOIN (SELECT id_kamar as id, COUNT(id_kamar) as jumlah_disewa FROM transaksi WHERE status = 0 GROUP BY id_kamar) as a ON id=id_kamar WHERE id_kamar = '" + id + "'");

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
}
