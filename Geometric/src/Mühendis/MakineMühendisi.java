/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mühendis;

/**
 *
 * @author Excalibur
 */
public class MakineMühendisi implements IMuhendis , IÇalısma {
    public boolean askerlik ;
    public boolean adli_sicil_sorgulama ;

    public MakineMühendisi(boolean askerlik, boolean adli_sicil_sorgulama) {
        this.askerlik = askerlik;
        this.adli_sicil_sorgulama = adli_sicil_sorgulama;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik)
            System.out.println("Askerlik yaptım");
        else 
            System.out.println("Askerlik yapmadım");
            
    }
    @Override
    public String mezuniyet_ortalamasi(double derece) {
     return "Ortalama:"  + derece ;
    } 

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil_sorgulama)
            System.out.println("Adli Sicil Kaydım Bulunuyor.");
        else
            System.out.println("\"Adli Sicil Kaydım Bulunmuyor");
       
    }

   @Override
    public void is_tecrubesi(String[] array) {
        
        if (array.length == 0 ) {
            System.out.println("Herhangi bir iş tecrübem bulunmuyor...");
        }
        else {
            
            System.out.println("Makine Mühendisi olarak şu şirketlerde çalıştım.");
            for (int i = 0 ; i < array.length ;i++) {
                System.out.println(array[i]);
                
            }
        }
    }
    public void referans_getir(String[] array) {
        
        if (array.length == 0) {
            System.out.println("Herhangi bir referansım bulunmuyor...");
        }
        else {
            System.out.println("Referanslarım...");
            for (int i = 0 ; i < array.length ;i++) {
                System.out.println(array[i]);
                
            }
            
        }
    }

    @Override
    public void çalıs() {
        System.out.println("Makine mühendisi çalışıyor ... ");
    }
    
    
}


