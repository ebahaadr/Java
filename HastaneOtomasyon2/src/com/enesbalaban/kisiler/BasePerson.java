
package com.enesbalaban.kisiler;


abstract class BasePerson {
    private String isim;
    private String soyisim;
    private String tcNo;
    private int id;

    public BasePerson(String isim, String soyisim, String tcNo, int id) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tcNo = tcNo;
        this.id = id;
    }
    public BasePerson(){
        
    }
    public BasePerson(String tcNo){
        
        this.tcNo = tcNo;
    }
    
    public abstract void hastaGoruntule();
    


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   

    
}
