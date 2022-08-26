/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monster;

import java.util.Scanner;

/**
 *
 * @author Excalibur
 */
public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Canavar seçiniz ..."
        + "\n1.Su " + "\n2.ateş");
        String seç = scn.nextLine();
        
            if(seç.equals("1")){
                System.out.println("Su canarını seçtiniz...");
                monster s = new su("suu ");
                System.out.println(s.getName()+ s.attact());
                
            }
            else if(seç.equals("2")){
                System.out.println("Ateş canavarını seçtiniz...");
                monster a = new fire("ateşş ");
                System.out.println(a.getName() +a.attact());
            }
            else{
                System.out.println("hatalı seçim ... 1 veya 2 seç");
            }
        
        
    }
    
}
