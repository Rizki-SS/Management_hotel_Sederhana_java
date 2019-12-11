package backend;

import java.util.ArrayList;
import java.sql.*;

public abstract class Kamar implements crud{

    private int id_kamar;
    private String jenis_kamar;
    private int harga;
    private int jumlah;
    private String fasilitas;

    public Kamar() {

    }

    public Kamar(String jenis_kamar, String fasilitas, int hargaKamar, int jumlahKamar) {
        this.fasilitas = fasilitas;
        this.jenis_kamar = jenis_kamar;
        this.harga = hargaKamar;
        this.jumlah = jumlahKamar;

    }

    public int getIdkamar() {
        return id_kamar;
    }

    public void setIdkamar(int idkamar) {
        this.id_kamar = idkamar;
    }

    public String getJenisKamar() {
        return jenis_kamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenis_kamar = jenisKamar;
    }

    public int getHargaKamar() {
        return harga;
    }

    public void setHargaKamar(int hargaKamar) {
        this.harga = hargaKamar;
    }

    public int getJumlahKamar() {
        return jumlah;
    }

    public void setJumlahKamar(int jumlahKamar) {
        this.jumlah = jumlahKamar;
    }

    public String getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public abstract Kamar getById(int id);
    public abstract ArrayList<Kamar> getAll();

    @Override
    public void save() {
        if (id_kamar == 0) {

            String SQL = "INSERT INTO kamar (fasilitas, harga, jenis_kamar, jumlah) VALUES("
                    + "     '" + this.fasilitas + "', "
                    + "     '" + this.harga + "', "
                    + "     '" + this.jenis_kamar + "',"
                    + "     '" + this.jumlah + "' )";
            this.id_kamar = BDHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kamar SET "
                    + "     fasilitas='" + this.fasilitas + "', "
                    + "     harga='" + this.harga + "', "
                    + "     jenis_kamar='" + this.jenis_kamar + "' ,"
                    + "     jumlah='" + this.jumlah + "'"
                    + "     WHERE id_kamar = '" + this.id_kamar + "'";
            BDHelper.executeQuery(SQL);
        }
    }

    @Override
    public void delete() {
        String SQL = "DELETE FROM kamar WHERE id_kamar = '" + this.id_kamar + "'";
        BDHelper.executeQuery(SQL);
    }
}
