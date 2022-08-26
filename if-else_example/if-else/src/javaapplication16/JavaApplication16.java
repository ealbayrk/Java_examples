/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System . in ) ;
        System.out.println ( " Enter the number :") ; 
        int number = scn . nextInt() ;
        if ( number > 0 ) { 
            System. out . println ( " "+ number ) ;}
            else   {
            System . out .println ( "") ;
        }
    }
    
    
}
