package com.enesbalaban.metodİslemlerim;

import com.enesbalaban.kisiler.Doktor;
import com.enesbalaban.kisiler.Hasta;
import com.enesbalaban.kisiler.Polikinlikler;
import java.util.ArrayList;

public interface IAdminMetodlar {

    public ArrayList<Doktor> doktorGetir();

    public void doktorEkle(String ad, String soyad, String bolum, String tcNo, String cinsiyet, String email, String telefonNo);

    public void doktorSil(int id);

    public void doktorGuncelle(int id, String yeniAd, String yeniSoyad, String yeniBolum, String yeniTcNo, String yeniCinsiyet, String yeniEmail, String yeniTelefonNo);

    public ArrayList<Hasta> hastaGetir();
    

    public void hastaEkle(String isim, String soyisim, String cinsiyet, String email,  String telefonNo, String polikinlik,String tcNo,String saat);
    
    public void hastaSil(int id);
    
    public void hastaGuncelle(int id,String yeniAd,String yeniSoyad, String yeniCinsiyet, String yeniEmail, String yeniTelefonNo, String yeniPolikinlik,String yeniTcNo,String yeniSaat);
    
    public ArrayList<Polikinlikler> polikinlikGetir();
    
    public void polikinlikEkle(String ad, String kapasite, String odaSayisi);
    
    public void polikinlikSil(int id);
    
    public void polikinlikGuncelle(int id, String yeniAd, String yeniKapasite, String yeniOdaSayisi);
    
}
