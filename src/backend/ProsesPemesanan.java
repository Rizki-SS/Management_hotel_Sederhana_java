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
    private static Tamu tamu;
    private static Pembayaran pembayaran;
    private static Kamar kamar;
    private static Transaksi transaksi;

    public static Tamu getTamu() {
        return tamu;
    }

    public static void setTamu(Tamu tamu) {
        ProsesPemesanan.tamu = tamu;
    }

    public static Pembayaran getPembayaran() {
        return pembayaran;
    }

    public static void setPembayaran(Pembayaran pembayaran) {
        ProsesPemesanan.pembayaran = pembayaran;
    }

    public static Kamar getKamar() {
        return kamar;
    }

    public static void setKamar(Kamar kamar) {
        ProsesPemesanan.kamar = kamar;
    }

    public static Transaksi getTransaksi() {
        return transaksi;
    }

    public static void setTransaksi(Transaksi transaksi) {
        ProsesPemesanan.transaksi = transaksi;
    }
}
