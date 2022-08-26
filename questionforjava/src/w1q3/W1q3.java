/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1q3;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class W1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.println ("Enter the coni r : ");
        int r = scn.nextInt();
        System.out.println ("Enter the h :" ) ;
        int h = scn.nextInt ();
        double v = 1.0/3*h*3.14*r*r;
        System.out.println( " value is :" + v ) ;
        
    }
  
}
