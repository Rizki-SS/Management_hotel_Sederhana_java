package backend;

import java.sql.ResultSet;

public abstract class Pembayaran{
    private int id_pembayran;
    private String nama;
    private String date;

    public Pembayaran(String nama) {
        this.nama = nama;
    }

    public Pembayaran() {
    }

    public int getId_pembayran() {
        return id_pembayran;
    }

    public void setId_pembayran(int id_pembayran) {
        this.id_pembayran = id_pembayran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
