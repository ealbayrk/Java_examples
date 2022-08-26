/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1q5;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class W1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner scn = new Scanner(System.in);
   System.out.println("enter the cost : ") ;
   double cost = scn . nextDouble ();
   
   double price = cost + (cost*0.18);

   System.out.println ( " price is " + price);
           
           
   
    
    
    }
    
}
