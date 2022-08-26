/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner (System.in) ;
     
       System. out . println (" Enter the number : "  ) ;
     
        int n = scn . nextInt () ;
        double FI = (1+ sqrt(5))/2 ;
        double FI_H = (1- sqrt(5))/2 ;
        int fib = (int) ((Math.pow(FI, n) - Math.pow(FI_H, n)))/Math.sqrt(5))) ;
        System. out . println ( "fib" + n +fib) ;
        
                
         }
    
}
