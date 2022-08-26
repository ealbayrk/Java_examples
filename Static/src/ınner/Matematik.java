/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınner ;
    
import java.util.Scanner;


public class Matematik {
    
    private double PI = Math.PI;
    
    
    public class Factorial{
        
        public void faktoriyel() {
            
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter a number :");
            
            int sayi = scanner.nextInt();
            int fakt = 1;
            
            for (int i =  2 ; i <= sayi ; i++) {
                
                fakt *= i;
            }
            System.out.println("Factorial: " + fakt);
            

        }
    
    }
    
    public class Asal {
        
        public boolean asal(int sayi) {
            
            int i = 2;
            
            while (i < sayi) {
                
                if (sayi % i == 0 ) {
                    return false;
                }
                i++;
               }
            return true;      
        }
    }
    public class Alan {
        
        public class DaireAlan{
            public void daire_alan(int yaricap) {
            
            System.out.println("ARE OF CIRCLE:: " + (yaricap * yaricap * PI)); //en dıştaki class özelliği private olsa bile kullanılabilr.
       
        }
        } 
    }
   
}
