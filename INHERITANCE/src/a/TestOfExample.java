/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class TestOfExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("3 tane raaaggam gir ");
        int side1=scn.nextInt();
        int side2=scn.nextInt();
        int side3=scn.nextInt();
        System.out.println("Renk ne olsun?");
        String color= scn.next();
        System.out.println("içi dolu mu kardeş doluysa:true yaz , boşsa :false");
        boolean isFilled=scn.nextBoolean();
        Tringle tri = new Tringle(color,isFilled,side1,side2,side3);
        System.out.println(tri.toString());
        
    }
    
}
