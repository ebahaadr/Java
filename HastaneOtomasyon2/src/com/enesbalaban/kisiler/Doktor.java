
package com.enesbalaban.kisiler;

import java.util.ArrayList;

public class Doktor extends BasePerson{
    
    
    private String bolum;
    private String cinsiyet;
    private String email;
    private String telefonNo;

    public Doktor(int id,String isim, String soyisim,String bolum, String tcNo,String email,String cinsiyet,String telefonNo) {
        super(isim, soyisim, tcNo, id);
        this.bolum = bolum;
        this.cinsiyet = cinsiyet;
        this.email = email;
        this.telefonNo = telefonNo;
    }

    public Doktor(String tcNo) {
        super(tcNo);
    }
    public Doktor(){
        
        
    }
    
    
    

    

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
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

    @Override
    public void hastaGoruntule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    }


    

    
    
    
    
    
    

