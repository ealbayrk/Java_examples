/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication32;

import java.util.Scanner;
import java.lang.Math ;
import java.text.DecimalFormat;


/**
 *
 * @author Excalibur
 */
public class JavaApplication32 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scn = new Scanner(System.in);
    System.out.print("How many darts do you want to throw? : ");
     double arrow_number = scn .nextDouble() ;
     double x = (double)(Math.random() * 2) -1 ;
     double y = (double)(Math.random() * 2) -1 ; 
     DecimalFormat formatter =  new DecimalFormat ("#.#") ;
    System.out.println(" The coordinates of the arrow are: " + formatter.format (x) + " and "+ formatter.format  (y) );
    
    
    if ( x < 0 ) {
        if ( y > 0  ) {
        System.out.println(" your dart hit zone C  " + formatter.format (x) + " and "+ formatter.format  (y) );    
        }
        //else if (     ) {
    }
        
    if ( x > 0 ){
        if ( y < 0 ) {
       System.out.println(" your dart hit zone F  , %25 "  + formatter.format (x) + " and "+ formatter.format  (y) );    
       }
       // else if (y > 0 ) {
    } 
        else {
            System.out.println(" darts in undecided zone  "   );   
        }
    
}
    }
