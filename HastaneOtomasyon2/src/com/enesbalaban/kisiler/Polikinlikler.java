
package com.enesbalaban.kisiler;

public class Polikinlikler {
    
    private int id;
    private String ad;
    private String kapasite;
    private String odaSayisi;

    public Polikinlikler(int id, String ad, String kapasite, String odaSayisi) {
        this.id = id;
        this.ad = ad;
        this.kapasite = kapasite;
        this.odaSayisi = odaSayisi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKapasite() {
        return kapasite;
    }

    public void setKapasite(String kapasite) {
        this.kapasite = kapasite;
    }

    public String getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(String odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
    
    

   
    
    
}
