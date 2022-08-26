/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System . in ) ;
        System.out.println ( "Enter the 2 number " ) ;
        int x = scn. nextInt() ;
        int y = scn. nextInt() ;
       int i = 1;
        while(y > 0){
            i = i * x ;
            y-- ;
        }
        System.out.println("Result is : " + i) ;
    
        
        
        
    }
    
}
