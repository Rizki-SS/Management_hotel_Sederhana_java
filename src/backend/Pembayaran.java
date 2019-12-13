package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Pembayaran implements crud {

    private int id_pembayran;
    private String nama;
    private String no_id;
    private String date;
    private String jenis;

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

    public String getNo_id() {
        return no_id;
    }

    public void setNo_id(String no_id) {
        this.no_id = no_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Pembayaran(String nama, String no_id) {
        this.nama = nama;
        this.no_id = no_id;
    }

    public Pembayaran getById(int id) {
        Pembayaran pem = new Pembayaran();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM pembayaran WHERE id_pembayaran = '" + id + "'");

        try {
            while (rs.next()) {
                pem = new Pembayaran();
                pem.setId_pembayran(rs.getInt("id_pembayaran"));
                pem.setNama(rs.getString("nama"));
                pem.setNo_id(rs.getString("no_identitas"));
                pem.setDate(rs.getString("tanggal_pembayran"));
                pem.setJenis(rs.getString("Jenis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pem;
    }

    public ArrayList<Pembayaran> getAll() {
        ArrayList<Pembayaran> listPembayaran = new ArrayList();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM pembayaran");
        try {
            while (rs.next()) {
                Pembayaran pem = new Pembayaran();
                pem.setId_pembayran(rs.getInt("id_pembayaran"));
                pem.setNama(rs.getString("nama"));
                pem.setNo_id(rs.getString("no_identitas"));
                pem.setDate(rs.getString("tanggal_pembayran"));
                pem.setJenis(rs.getString("Jenis"));
                listPembayaran.add(pem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPembayaran;
    }

    @Override
    public void save() {
        String SQL = "INSERT INTO pembayaran (nama,no_identitas,tanggal_pembayran, Jenis) VALUES("
                + "     '" + getNama() + "', "
                + "     '" + getNo_id() + "',"
                + "     NOW(),"
                + "     ' Tunai ' )";
        this.id_pembayran = BDHelper.insertQueryGetId(SQL);
    }

    @Override
    public void delete() {
        String sql = "DELETE FROM pembayaran WHERE id_tamu ='" + this.id_pembayran + "'";
        BDHelper.executeQuery(sql);
    }

    ArrayList<Pembayaran> getByDetai(String nama, String no_id) {
        ArrayList<Pembayaran> listAnggota = new ArrayList();
          ResultSet rs;
          
        nama = nama.trim();
        no_id = no_id.trim();
        rs = BDHelper.selectQuery("SELECT * FROM pembayaran Where nama = '"+ nama +"' and no_identitas  = '"+no_id+"'");
        
        try {
            while (rs.next()) {
                Pembayaran kat = new Pembayaran();
                kat.setId_pembayran(rs.getInt("id_pembayaran"));
                kat.setNama(rs.getString("nama"));
                kat.setNo_id(rs.getString("no_identitas"));
                kat.setDate(rs.getString("tanggal_pembayran"));
                kat.setJenis(rs.getString("Jenis"));
                listAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }

}
