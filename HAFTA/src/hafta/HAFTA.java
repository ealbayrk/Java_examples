/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class HAFTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System.in) ; 
         int weekday = scn . nextInt() ;
        if ( weekday == 1 ) {
             System.out.println( "sunday");
        } else if ( weekday == 2 ) {
            System.out.println( "monday");
        } else if ( weekday == 3 ) {
           System.out.println( "5");
        } else if ( weekday == 4 ) {
          System.out.println( "6");
        } else if ( weekday == 5 ) {
        System.out.println( "7");
        } else if ( weekday == 6 ) {
         System.out.println( "monday7");
        } else if ( weekday == 7 ) {
           System.out.println( "monday8");
        } else if ( weekday == 0 ) {
             System.out.println( "monday9");
        } else {
             System.out.println( "monday4");
        }
    }
    
}
