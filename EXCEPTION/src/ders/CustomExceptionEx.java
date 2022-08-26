/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class CustomExceptionEx {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int num1 , num2;
        System.out.println("Enter first and second num");
        num1 = scn.nextInt();
         
        System.out.println("Enter second integer");
        num2 = Integer.parseInt(int.nextLine());
        DemoClass demo = new DemoClass();
        try {
            int result = demo.sum(num1, num2);
            System.out.println("Sum of the numbers is " + result);
        } catch (SumGreaterThan100Exception e) {
            System.out.println("Caught the custom exception : " + e);
        } 
    }
}

        
        
    
    

