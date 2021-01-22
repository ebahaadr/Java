
package com.enesbalaban.kisiler;


public class Admin extends BasePerson{
    
    private String username;
    private String parola;
    
    public Admin(String username,String parola,String isim, String soyisim, String tcNo, int id) {
        super(isim, soyisim, tcNo, id);
        this.username = username;
        this.parola = parola;
                
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    @Override
    public void hastaGoruntule() {
    }
    
    
    
    
}
