/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q6;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class Q6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner ( System . in ) ;
        System . out . println ( " Enter the int number : ") ;
        int num = scn . nextInt ( ) ;
       int min = scn .nextInt() ;
       
        for ( int i = 1 ; i< num ; i ++  ) ;
        int r = (int) ((Math.random()*90)+10) ;
        int i = 1;
       //if ( i ==1 )//
        //System . out . println ( "," + r ) ;//
        System . out .  println ( " " + r ) ;
        
        
         if (  r <= min ) {
        min = r ;
        }
        System . out .  println ( "min number " + min ) ;
        
        
        
        
      
        
        
    }
    
}
