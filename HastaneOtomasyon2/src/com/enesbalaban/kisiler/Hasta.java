
package com.enesbalaban.kisiler;

public class Hasta extends BasePerson{
    
    
    
    private String cinsiyet;
    private String email;
    private String telefonNo;
    private String polikinlik;
    private String saat;

    public Hasta(int id ,String isim, String soyisim,String cinsiyet,String email,String telefonNo,String polikinlik, String tcNo,String saat) {
        super(isim, soyisim, tcNo, id);
        
        this.cinsiyet = cinsiyet;
        this.email = email;
        this.telefonNo = telefonNo;
        this.polikinlik = polikinlik;
        this.saat = saat;
    }

    public Hasta(String tcNo) {
        super(tcNo);
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

    public String getPolikinlik() {
        return polikinlik;
    }

    public void setPolikinlik(String polikinlik) {
        this.polikinlik = polikinlik;
    }

    @Override
    public void hastaGoruntule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        
    }

    

    

   

   
    

    
   
    
            
    

