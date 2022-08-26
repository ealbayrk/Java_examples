package kodbloklari.com;
 
import java.util.Scanner;
 
public class Faktöriyel {
    
    public static int gcd(int M, int N) {
        Scanner scn = new Scanner (System.in ) ;
        System.out.println("2 tane sayı girin :1.girdiğimiz sayının 2.sayıdan küçük olmasına dikkat edelim lütfen eren lütfen tıhegk");
        
         N = scn . nextInt () ;
         System.out.println("ikinciyi de girseneeeee ne bekliyon unutma 1. den daha küçük olsun sıçtırma çarkına  !!");
         M = scn . nextInt () ;
         int ebob = 0 ;
      for(int i = 1; i < N; i++)
        {
            if(N % i == 0 && M % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);
        return  ebob ;
    }
    
    public static int lcm(int M, int N) {
        Scanner scn = new Scanner (System.in ) ;
     
        int ekok = 0;
        int max;
        
        System.out.print("1. Sayiyi giriniz: ");
         N = scn.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        M = scn.nextInt();
        max = N * M;
        
        
        for(int i = max; i > 0; i--)  {
            if(i % N == 0 && i % M == 0) {
                ekok = i;
            }
        }
        System.out.println("Ekok = " + ekok);
    

        return ekok;
    }

    
          public static void main(String[] args) {
               System.out.println("1. en büyük ortak bölen bulmak için 1 e basın");
            System.out.println("2.  en küçük ortak kat için 2 ye basın ");
              
              Scanner scn = new Scanner (System.in) ;
              int  n = scn.nextInt();
           

switch (n) {
    case 1 :
    gcd(1532555464,10155468) ;
    break ;
    case 2:
        lcm ( 683536359,95633935);
       
}
       }
      
  
         
         
         
         
         
         
         
         
         
         
         
         
    }


        
    

  