
package com.enesbalaban.metodİslemlerim;

import com.enesbalaban.kisiler.Doktor;
import com.enesbalaban.kisiler.Hasta;
import com.enesbalaban.kisiler.Polikinlikler;
import java.util.ArrayList;

public interface IDoktorMetodlar {
    
   public ArrayList<Doktor> doktorGetir();
   public ArrayList<Doktor> tcGetir();
   public ArrayList<Hasta> hastaGetir();
   public ArrayList<Polikinlikler> polikinlikGetir();
    
    
}
