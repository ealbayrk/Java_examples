/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System . in ) ;
        System.out.println ( " Enter the number from  0 to 999") ;
        int num = scn . nextInt () ;
        
        
        if ( 9>=num &&  num>= 0   )  { 
         System.out.println ( "1") ;
    }else if ( 10>=num &&  num>= 99   )  { 
         System.out.println (" 2") ;
    }else if  ( 100>=num &&  num>= 999   )  {
         System.out.println ( "3")  ;
    }
    else  {
         System.out.println ( "reenter")  ;
    }
        
        
    }
    
}
