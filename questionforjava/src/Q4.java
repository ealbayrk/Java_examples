/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System.in ) ;
        System . out . println ( "Enter the 3 number :" ) ;
        
        int a = scn . nextInt () ;
        int b = scn . nextInt () ;
        int c = scn . nextInt () ;
       
        
     
        
    if ( a>14   ||    a <18) ; {
         a = 0 ;
         }
         
    else if   ( b>14   ||    b <18) ; {
        b=0 ;
        System.out.println (""+b)  ;
         }
         
   else if   ( c>14   ||    c <18) ; {
         c=0 ;
         }
    
             
   else  {
    int total ;
        total = (int) a+b+c ;
        
             }

    int total =scn . nextInt () ;
     System . out . println ( "sonuç"+ total ) ;
    }
    
}
