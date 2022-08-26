package şekill ;
import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "İşlemler...\n"
                          +"1. Kare Alan Hesapla\n"
                          +"2. Üçgen Alan Hesapla\n"
                          +"3. Daire Alan Hesapla\n"
                          + "Çıkış : q";
        
        while(true) {
            System.out.println(islemler);
            System.out.print("Hangi Şeklin Alanını Hesaplamak İstiyorsunuz : ");
            String sekil_turu = scanner.nextLine();
     
            if (sekil_turu.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (sekil_turu.equals("1")){
                System.out.print("Karenin Kenarı : ");
              
               
            }
            else if (sekil_turu.equals("2")) {
                
                System.out.print("Kenar 1 : ");
               
                
            }
            else if (sekil_turu.equals("3")){
                System.out.print("Dairenin Yarıçapı : " );
              
                
            }
            else {
                System.out.println("Geçersiz İşlem....");
            }
            
            
        }
    }
    
}