/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptıon;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class iÇiÇE {

    private static int t;
    private static int g ;
   
    public static void ucuncufonksiyon() {
      
      
        
        int a = g / t;
    }
      
    public static void ikincifonksiyon() {
        try {
        ucuncufonksiyon();  
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez..");
        }
       
        
       
    }
    public static void birincifonksiyon() {
        
        ikincifonksiyon();
        
    }
    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
       birincifonksiyon();
        System.out.println("t için rakam giriniz");
       int t = scn.nextInt();
       System.out.println("g için rakam giriniz");
       int g = scn.nextInt();
        
        
        
    }
}

    
    

