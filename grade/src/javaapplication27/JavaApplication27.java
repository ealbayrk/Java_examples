/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System . in ) ;
        System . out . println ( "Enter a grade :") ;
        int a = scn . nextInt() ;
          System . out . println ( "Enter b grade :") ;
        int b = scn . nextInt() ;
          System . out . println ( "Enter c grade :") ;
        int c = scn . nextInt() ;
        double ortalama = ( double )  (a+b+c ) / 3.0 ;
         System . out . println ( "ortalama :" + ortalama ) ;
        
    }
    
}
