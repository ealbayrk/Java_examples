/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınner;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
       
        
        Matematik.Factorial factorial = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan alan = new Matematik().new Alan();
        Matematik.Alan.DaireAlan daire_alan = new Matematik().new Alan().new DaireAlan(); //Matematik classı içindeki ala classı içindeki daire classından nesne oluşturuyor .
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter the number : ");
        
        int sayi = scanner.nextInt();
        
        if (asal.asal(sayi)) {
            
            System.out.println("prime");
            
        }
        else {
            
            System.out.println("unprime");
        }
        factorial.faktoriyel();
        //alan.daire_alan(5);
        daire_alan.daire_alan(6);
        
    }
    
}

    