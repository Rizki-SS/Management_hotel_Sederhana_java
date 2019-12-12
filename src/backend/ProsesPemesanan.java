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
public class ProsesPemesanan {
    private static Pembayaran pembayaran;
    private static Transaksi transaksi = new Transaksi();

    public static Pembayaran getPembayaran() {
        return pembayaran;
    }

    public static void setPembayaran(Pembayaran pembayaran) {
        ProsesPemesanan.pembayaran = pembayaran;
    }

    public static Transaksi getTransaksi() {
        return transaksi;
    }

    public static void setTransaksi(Transaksi transaksi) {
        ProsesPemesanan.transaksi = transaksi;
    }

    public static void save() {
        pembayaran.save();
        transaksi.setBayar(pembayaran);
        transaksi.save();
    }

    
}
