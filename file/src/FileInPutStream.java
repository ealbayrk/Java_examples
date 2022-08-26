import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileInPutStream{
    public static void main(String[] args)  {
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("dosya.txt");
            
            

            int deger;
            
            String s = "";//dosyada yazılacak olanın yazılacağı string 
            
            int say = 0;
            fis.skip(5); //normalde imleç 1. den başlar bu sayede 5 tane atlıyor .0-1-2-3-4-5...
          //  System.out.println("Okunan değer :" + (char)fis.read()); Dosyadaki 5. değeri yazdırır .
            
            while ((deger =  fis.read()) != -1){ //karakter kalmayınca read -1 atıyor bu ebeple -1'i denetliyoruz .
                
                s += (char) deger;//karakterler tek tek s'e atanıyor .
                
                say++;
                
                if (say == 11) {//dosyanın 6. yerinden itibaren 11 karakter
                    break;
                }
                
            }
            System.out.println("Dosyanın 5.Yerinden İtibaren 11 karakter :  " + s);
            
            
            /*while ((deger =  fis.read()) != -1) {
                
                s += (char) deger;
                
            }
            
            System.out.println("Dosya İçeriği : " + s);*/
            
            
            
            //fis.skip(5);
            
            /*System.out.println("İlk Karakter : " + (char)fis.read());
            System.out.println("İkinci Karakter : " + (char)fis.read());*/
            
            /*System.out.println("Birinci Karakter : " + (char)(fis.read()));
            System.out.println("İkinci  Karakter : " + (char)(fis.read()));
            System.out.println("Üçüncü  Karakter : " + (char)(fis.read()));*/
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("File bulunamadı....");
        } catch (IOException ex) {
            System.out.println("Dosya okunurken hata oluştu...");
        }
        finally {
            try {
                if (fis != null ){
                    fis.close();
                    
                }
                
            } catch (IOException ex) {
                System.out.println("Dosya kapatılırken bir hata oluştu...");
            }
            
        }
        
        
        
    }
}
