/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author rizki
 */
public class Card extends Pembayaran{
    @Override
    public void save() {
        int hargaTotal = ProsesPemesanan.getTransaksi().getTotal()-10000;
        ProsesPemesanan.getTransaksi().setTotal(hargaTotal);
        String SQL = "INSERT INTO pembayaran (nama,no_identitas,tanggal_pembayran, Jenis) VALUES("
                    + "     '" + getNama() + "', "
                    + "     '" + getNo_id()+ "',"
                    + "     NOW(),"
                    + "     ' Card ' )";
            setId_pembayran(BDHelper.insertQueryGetId(SQL));
    }

    public Card() {
    }

    public Card(String nama, String no_id) {
        super(nama, no_id);
    }
}
