/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the weight");
        System.out.println("Enter the height");
        double c1=input.nextDouble();
        double c2=input.nextDouble();
        double total = c1 + c2;
        if(c1<=1.0 && c2>100.0){
            total=20+7;
            System.out.println("total cost is:"+ total);
        }    
        else if(c1<=1.0 && c2<100.0){
            total=20;
            System.out.println("total cost is:"+ total);
        }
        else if(c1>1.0 && c2>100.0){
            total=30+7;
            System.out.println("total cost is:"+ total);
        }
        else if (c1>1.0 && c2<100.0){
            total=30;
            System.out.println("total cost is:"+ total);
        }
        else{
            System.out.println("Invalid type");
        }
    }
    
}
