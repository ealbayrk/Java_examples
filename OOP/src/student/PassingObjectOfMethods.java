/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Excalibur
 */
public class PassingObjectOfMethods {
    
    public static void main (String[]args) {
        int i = 20 ;
        System.out.println("i inside main method before calling aMethod: " + i );
        aMethod (i) ;
        System.out.println("i inside main method after calling aMethod: " + i );
    }    
        
    public static void aMethod (int i)  {
    i ++ ;
        System.out.println("i inside method : " + i );
        
    }
    }
    
