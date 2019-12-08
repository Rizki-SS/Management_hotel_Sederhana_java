
package backend;



import java.util.ArrayList;
import java.sql.*;

public class Transaksi implements crud{
    private int idTansaksi;
    private Tamu tamu = new Tamu();
    private Pemabayaran bayar = new Pemabayaran();
    private Kamar kamar = new Kamar();
    private int lamaInap;
    private int total;
    private int status;

    public int getIdTansaksi() {
        return idTansaksi;
    }

    public void setIdTansaksi(int idTansaksi) {
        this.idTansaksi = idTansaksi;
    }

    public Tamu getTamu() {
        return tamu;
    }

    public void setTamu(Tamu tamu) {
        this.tamu = tamu;
    }

    public Pemabayaran getBayar() {
        return bayar;
    }

    public void setBayar(Pemabayaran bayar) {
        this.bayar = bayar;
    }

    public Kamar getKamar() {
        return kamar;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public Transaksi() {
    }
    
    public Transaksi(int lamaInap, int total) {
        this.lamaInap = lamaInap;
        this.total = total;
    }
    
     public Transaksi getById(int id){
        Transaksi transaksi = new Transaksi();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM tamu WHERE id_transaksi = '"+id+"'");
        
        try {
            while (rs.next()) {
               transaksi = new Transaksi();
               transaksi.setIdTansaksi(rs.getInt("id_transaksi"));
               transaksi.setTamu(transaksi.tamu.getById(Integer.parseInt("id_tamu")));
               transaksi.setKamar(transaksi.kamar.getByid(Integer.parseInt("id_kamar")));
               transaksi.setBayar(transaksi.bayar.getByid(Integer.parseInt("id_pembayaran")));
               transaksi.setKamar("lama_inap");
               transaksi.setTotal(Integer.parseInt("total_biaya"));
               transaksi.setStatus(Integer.parseInt("status"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tamu;
    }
     
     public ArrayList<Transaksi> getAll(){
        ArrayList<Transaksi>ListBuku = new ArrayList();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM peminjaman");
        try {
            while (rs.next()) {     
               Transaksi transaksi = new Transaksi();
               transaksi.setIdTansaksi(rs.getInt("id_transaksi"));
               transaksi.setTamu(transaksi.tamu.getById(Integer.parseInt("id_tamu")));
               transaksi.setKamar(transaksi.kamar.getByid(Integer.parseInt("id_kamar")));
               transaksi.setBayar(transaksi.bayar.getByid(Integer.parseInt("id_pembayaran")));
               transaksi.setKamar("lama_inap");
               transaksi.setTotal(Integer.parseInt("total_biaya"));
               transaksi.setStatus(Integer.parseInt("status"));
               ListBuku.add(transaksi);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
     
    @Override
     public void save(){
            String SQL = "UPDATE transaksi SET "
                    +"      id_tamu = '"+this.tamu.getIdTamu()+ "', "
                    +"      id_pembayaran = '"+this.bayar.getIdBayar()+ "', "
                    +"      id_kamar = '"+this.kamar.getIdKamar + "', "
                    +"      lama_inap = '"+this.lamaInap + "' "
                    +"      status = '"+this.status + "' "
                    +"      WHERE id_transaksi = '"+this.idTansaksi + "'";
            BDHelper.executeQuery(SQL);
    }
     
    @Override
     public void delete(){
        String sql = "DELETE FROM tamu WHERE id_tamu ='"+this.idTansaksi+"'";
        BDHelper.executeQuery(sql);
    }
}
