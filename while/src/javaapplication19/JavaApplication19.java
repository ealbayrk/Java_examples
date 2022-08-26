/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scn = new Scanner ( System.in);
    System.out.println ( " Enter the h and r: ") ;
    int h = scn .  nextInt () ;
    int r = scn . nextInt  () ;
    
    while ( r<=0 ){
        System . out . println ( "Reenter :" ) ;
       
    }
    
    while ( h<=0 ){
        System . out . println ( "Reenter :" ) ;
    }
    
    
   double v = 1/3.0 * h * 3.14*r*r;
        System.out.println("The volume: " + v);
        
        
        

    

    
    }

 
}
