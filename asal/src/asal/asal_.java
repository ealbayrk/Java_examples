/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner scn = new Scanner (System.in) ;
        System.out.println( " Enter the int . number : ");
     
        int sayaç = 0 ;
        int i ,j ;
        for ( i =3 ; i<10000 ;i++ )
            for ( j = 2 ; j<i ; j++ )  
                if ( i%j==0 ){
                     System.out.println( " asal değil ");
                     int sayaç ++ ;
                     else if ( i%j != 0 ){
                     System.out.println( " asal  ");
                 
                }
    }
    

