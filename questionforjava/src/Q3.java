/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner  scn = new Scanner ( System . in ) ;
        System .out . println ( " enter the number 0 -3 ") ;

     int day = scn . nextInt ();
     
   
   switch ( day ) { 
       case 0 : 
           System . out . println ( " monday ") ;
       break ;
       case 1 : 
           System . out . println ( " sunday ") ;
       break ;
       case 2 : 
           System . out . println ( " wednesday") ;
       break ;
       case 3 : 
           System . out . println ( " thusday ") ;
       break ;
   }
    }
    
}
