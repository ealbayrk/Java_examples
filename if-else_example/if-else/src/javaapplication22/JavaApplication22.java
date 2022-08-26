/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System.in ) ;
        int num = scn . nextInt () ;
        if ( num == 1 )  {
        System.out.println ( " I " ) ;
        }
        else if ( num == 2 )  {
        System.out.println ( " II " ) ;
        }
        else if ( num == 3 )  {
        System.out.println ( " III " ) ;
        }
        else  {
        System.out.println ( " noooo " ) ;
        }
    }
    
}
