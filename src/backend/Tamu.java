/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

public class Tamu implements crud{
    private int idTamu;
    private String namaTamu;
    private String alamat;
    private String telp;

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getTelp() {
        return telp;
    }
 

    public int getIdTamu() {
        return idTamu;
    }

    public void setIdTamu(int idTamu) {
        this.idTamu = idTamu;
    }

    public String getNamaTamu() {
        return namaTamu;
    }

    public void setNamaTamu(String namaTamu) {
        this.namaTamu = namaTamu;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Tamu() {
    }

    public Tamu(String namaTamu, String alamat, String telp) {
//        this.idTamu = idTamu;
        this.namaTamu = namaTamu;
        this.alamat = alamat;
        this.telp = telp;
    }

   
    
    public Tamu getById(int id){
        Tamu tamu = new Tamu();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM tamu WHERE id_tamu = '"+id+"'");
        
        try {
            while (rs.next()) {
               tamu = new Tamu();
               tamu.setIdTamu(rs.getInt("id_tamu"));
               tamu.setNamaTamu(rs.getString("nama"));
               tamu.setAlamat(rs.getString("alamat"));
               tamu.setTelp(rs.getString("telp"));
               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tamu;
    }
    
    public ArrayList<Tamu> getAll(){
        ArrayList<Tamu> listAnggota = new ArrayList();
        ResultSet rs = BDHelper.selectQuery("SELECT * FROM tamu");
        
        try {
            while (rs.next()) {
                Tamu kat = new Tamu();
                kat.setIdTamu(rs.getInt("id_tamu"));
                kat.setNamaTamu(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelp(rs.getString("telp"));
                listAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public ArrayList<Tamu> search(String key){
        ArrayList<Tamu> listAnggota = new ArrayList();
        
        String sql = "SELECT * FROM tamu WHERE nama LIKE '%"+key+"%' OR alamat LIKE '%"+key+"%' OR telp LIKE '%"+key+"%'";
        ResultSet rs = BDHelper.selectQuery(sql);
    
        try {
            while (rs.next()) {
                Tamu kat = new Tamu();
                kat.setIdTamu(rs.getInt("id_tamu"));
                kat.setNamaTamu(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelp(rs.getString("telp"));
                listAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }
    
    public void save(){
        if (getById(idTamu).getIdTamu()==0) {
            String sql = "INSERT INTO tamu(nama,alamat,telp) VALUE ('"+this.namaTamu+"','"+this.alamat+"','"+this.telp+"')";
            this.idTamu = BDHelper.insertQueryGetId(sql);
        }else{
            String sql = "UPDATE tamu SET nama = '"+this.namaTamu+"', alamat = '"+this.alamat+"', telp = '"+this.telp+"' WHERE id_tamu = '"+this.idTamu+"'";
            BDHelper.executeQuery(sql);
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM tamu WHERE id_tamu ='"+this.idTamu+"'";
        BDHelper.executeQuery(sql);
    }
    
    public ArrayList<Tamu> getByDetai(String namaTamu, String alamat, String telp){
        ArrayList<Tamu> listAnggota = new ArrayList();
          ResultSet rs;
          
        namaTamu = namaTamu.trim();
        alamat = alamat.trim();
        telp = telp.trim();
        rs = BDHelper.selectQuery("SELECT * FROM tamu Where nama = '"+ namaTamu +"' and alamat = '"+alamat+"' and telp = '"+telp+"'");
        
        try {
            while (rs.next()) {
                Tamu kat = new Tamu();
                kat.setIdTamu(rs.getInt("id_tamu"));
                kat.setNamaTamu(rs.getString("nama"));
                kat.setAlamat(rs.getString("alamat"));
                kat.setTelp(rs.getString("telp"));
                listAnggota.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listAnggota;
    }
}
