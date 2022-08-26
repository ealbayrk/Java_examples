/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w2q1;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class W2q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scn = new Scanner (System.in) ;
       System .out.println ( "Enter the price:") ;
       int p = scn.nextInt();
       if (p == 172) {
       double total = (0.18*p ) + p ; 
       System.out.println("total is : "+ total) ;
       }
       else if ( p==196) {
        double total = p ;
        System.out.println ("total is : 196") ;
        }
    
    
    
      
       
              
       
       
    }
    
}
