package com.enesbalaban.database;

import com.enesbalaban.kisiler.*;
import com.enesbalaban.frameler.*;
import com.enesbalaban.metodİslemlerim.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Veriİslemleri implements IAdminMetodlar{
    
    

    
    

    private Connection connection;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

    public Veriİslemleri() {

        String url = "jdbc:mysql://" + DataBase.host + ":" + DataBase.port + "/" + DataBase.dbİsmi + "?useUnicode=true&characterEncoding=utf8";

        try {

            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı...");
        }

        try {

            connection = DriverManager.getConnection(url, DataBase.kullaniciAdi, DataBase.parola);

            System.out.println("Bağlantı Başarılı...");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
    }

    public boolean girisYap(String kullaniciAdi, String parola) {

        String sorgu = "Select * From adminler where username = ? and password = ? ";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2, parola);

            ResultSet rs = preparedStatement.executeQuery();

            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    @Override
    public ArrayList<Doktor> doktorGetir() {

        ArrayList<Doktor> cikti = new ArrayList<Doktor>();

        try {
            statement = connection.createStatement();
            String sorgu = "Select * From doktorlar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String isim= rs.getString("ad");
                String soyisim = rs.getString("soyad");
                String bolum = rs.getString("bolum");
                String tcNo = rs.getString("tcNo"); 
                String email = rs.getString("email");
                String cinsiyet = rs.getString("cinsiyet");
                String telefonNo = rs.getString("telefonNo");

                cikti.add(new Doktor(id, isim, soyisim, bolum, tcNo, email, cinsiyet, telefonNo));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
        
    }
    
    @Override
    public void doktorEkle(String ad, String soyad, String bolum, String tcNo, String cinsiyet, String email, String telefonNo) {

        try {
            String sorgu = "Insert Into doktorlar (ad,soyad,bolum,tcNo,cinsiyet,email,telefonNo) VALUES(?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, bolum);
            preparedStatement.setString(4, tcNo);
            preparedStatement.setString(5, cinsiyet);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, telefonNo);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Override
    public void doktorSil(int id) {

        String sorgu = "Delete from doktorlar where id = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Override
    public void doktorGuncelle(int id, String yeniAd, String yeniSoyad, String yeniBolum, String yeniTcNo, String yeniCinsiyet, String yeniEmail, String yeniTelefonNo) {

        String sorgu = "Update doktorlar set ad = ?,soyad = ?,bolum= ?,tcNo = ?,cinsiyet = ?,email = ?,telefonNo = ? where id = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniSoyad);
            preparedStatement.setString(3, yeniBolum);
            preparedStatement.setString(4, yeniTcNo);
            preparedStatement.setString(5, yeniCinsiyet);
            preparedStatement.setString(6, yeniEmail);
            preparedStatement.setString(7, yeniTelefonNo);

            preparedStatement.setInt(8, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public ArrayList<Hasta> hastaGetir() {

        ArrayList<Hasta> cikti = new ArrayList<Hasta>();

        try {
            statement = connection.createStatement();
            String sorgu = "Select * From hastalar";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String isim = rs.getString("isim");
                String soyisim = rs.getString("soyisim");
                String cinsiyet = rs.getString("cinsiyet");
                String email = rs.getString("email");
                String telefonNo = rs.getString("telefonNo");
                String polikinlik = rs.getString("polikinlik");
                String tcNo = rs.getString("tcNo");
                String saat = rs.getString("saat");

                cikti.add(new Hasta(id, isim, soyisim, cinsiyet, email, telefonNo, polikinlik,tcNo,saat));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }
    @Override
    public void hastaEkle(String isim, String soyisim, String cinsiyet, String email, String telefonNo, String polikinlik,String tcNo,String saat) {

        try {
            String sorgu = "Insert Into hastalar (isim,soyisim,cinsiyet,email,telefonNo,polikinlik,tcNo,saat) VALUES(?,?,?,?,?,?,?,?)";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, isim);
            preparedStatement.setString(2, soyisim);
            preparedStatement.setString(3, cinsiyet);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, telefonNo);
            preparedStatement.setString(6, polikinlik);
            preparedStatement.setString(7, tcNo);
            preparedStatement.setString(8, saat);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Override
    public void hastaSil(int id) {
        
        String sorgu = "Delete from hastalar where id = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void hastaGuncelle(int id,String yeniAd,String yeniSoyad, String yeniCinsiyet, String yeniEmail, String yeniTelefonNo, String yeniPolikinlik,String yeniTcNo,String yeniSaat) {
        
        String sorgu = "Update hastalar set isim = ?,soyisim = ?,cinsiyet= ?,email = ?,telefonNo = ?,polikinlik = ?,tcNo = ?, saat = ? where id = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniSoyad);
            preparedStatement.setString(3, yeniCinsiyet);
            preparedStatement.setString(4, yeniEmail);
            preparedStatement.setString(5, yeniTelefonNo);
            preparedStatement.setString(6, yeniPolikinlik);
            preparedStatement.setString(7, yeniTcNo);
            preparedStatement.setString(8, yeniSaat);
            
            preparedStatement.setInt(9, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public ArrayList<Polikinlikler> polikinlikGetir() {

        ArrayList<Polikinlikler> cikti = new ArrayList<Polikinlikler>();

        try {
            statement = connection.createStatement();
            String sorgu = "Select * From polikinlikler";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String kapasite = rs.getString("kapasite");
                String odaSayisi = rs.getString("odaSayisi");

                cikti.add(new Polikinlikler(id, ad, kapasite, odaSayisi));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }

    }
    @Override
    public void polikinlikEkle(String ad, String kapasite, String odaSayisi) {

        try {
            String sorgu = "Insert Into polikinlikler (ad,kapasite,odaSayisi) VALUES(?,?,?)";

            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, kapasite);
            preparedStatement.setString(3, odaSayisi);

            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Override
    public void polikinlikSil(int id) {

        String sorgu = "Delete from polikinlikler where id = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    @Override
    public void polikinlikGuncelle(int id, String yeniAd, String yeniKapasite, String yeniOdaSayisi) {

        String sorgu = "Update polikinlikler set ad = ?,kapasite = ?,odaSayisi = ? where id = ?";

        try {
            preparedStatement = connection.prepareStatement(sorgu);

            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2, yeniKapasite);
            preparedStatement.setString(3, yeniOdaSayisi);
            preparedStatement.setInt(4, id);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {

        Veriİslemleri veriİslemleri = new Veriİslemleri();
    }

    /*public ArrayList<Hasta> hastaTcGetir() {
        ArrayList<Hasta> cikti = new ArrayList<Hasta>();

        try {
            statement = connection.createStatement();
            String sorgu = "Select * From hastalar ";

            ResultSet rs = statement.executeQuery(sorgu);

            while (rs.next()) {
                
                String tcNo = rs.getString("tcNo");

                cikti.add(new Hasta(tcNo));

            }
            return cikti;

        } catch (SQLException ex) {
            Logger.getLogger(Veriİslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;

        }
    }*/

    

}
