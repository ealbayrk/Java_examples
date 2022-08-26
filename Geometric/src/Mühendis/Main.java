package Mühendis;
import Mühendis.PcMuhendisi;
public class Main {
    
    public static void main(String[] args) {
       /* 
        // IMuhendis muhendis1 = new IMuhendis();
        
        PcMuhendisi muhendis1 = new PcMuhendisi(false,false);
       // System.out.println(muhendis1.askerlik_durumu_sorgula() + muhendis1.adli_sicil_sorgula()+muhendis1.mezuniyet_ortalamasi(3.7);
        
        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.7));
        
      
        String[] tecrube = {"Vestel","Havelsan","Turksat"};
        
        muhendis1.is_tecrubesi(tecrube);
        */
        
        
        MakineMühendisi muhendis2 = new MakineMühendisi(true,false);
        
      
        String[] tecrube = {};
        String[] referans = {"Mustafa Murat Coşkun","Serhat Say"};
        muhendis2.adli_sicil_sorgula();
        muhendis2.askerlik_durumu_sorgula();
        System.out.println(muhendis2.mezuniyet_ortalamasi(2.31));
        muhendis2.is_tecrubesi(tecrube);
        muhendis2.referans_getir(referans);
        muhendis2.çalıs();
       
        
        
        
        
        
        
    }
    
}
