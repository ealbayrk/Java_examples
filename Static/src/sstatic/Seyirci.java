
package sstatic; 
/*static anahtar kelimesi static bir alan oluşturuyor .
Bu alan sayesinde o alana yazılan , eklenen , çıkartılan şeyler tüm sınıflar tarafından görülüyor,ulaşılıyor.
*/



    public class Seyirci {
    
    private String isim;
    
    private static int seyirci_sayisi = 0; //bunu private yaptığımız için main kısımda getseyirci_sayisi kullanıyoruz.
    
    
    public Seyirci(String isim) {
        this.isim = isim;
        
        seyirci_sayisi++;
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void oyun_seyret() {
        
        System.out.println(isim + " being watched ");
    }
    public static int getSeyirciSayisi() {
        return seyirci_sayisi;
        
    }
    
}
