
import java.util.Scanner;

public class JavaApplication17 {
  public static void main(String[] args) {
     int [] dizi = dizi_2() ;
     for ( int i = 0 ; i<dizi.length ; i++){
          System.out.print("    " + dizi[i] );
  }
      
  }

  public static int [] dizi_2 () {  
      Scanner scn = new Scanner (System.in) ;
      System.out.println("sayı girin lütfen ");
     int n = scn . nextInt() ;
     int [] digits = new int[10] ;
     int i = 0 ;
     while (n>0){
         
     digits[i] = n % 10 ;
     n = n / 10 ;
     i++;
  }
      return digits ;


  }
}
     