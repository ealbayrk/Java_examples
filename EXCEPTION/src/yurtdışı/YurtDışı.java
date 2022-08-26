/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdışı;
        
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Excalibur
 */
public class YurtDışı {
    public static void main(String[] args) throws InterruptedException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Havaalanına HOŞGELDİNİZ...");
        String m = " To go abroad, you must meet the following conditions ...\n"
                          +"You must not have any political bans...\n"
                          +"You have to pay your 15 TL tuition fee in full...\n"
                          +"You need a visa to the country you are going to...";
        String message = "You have to meet all of the foreign requirements";
while(true){
    System.out.println("---------------------------------");
    System.out.println(m);
    System.out.println("---------------------------------");
    Yolcu y = new Yolcu();
    System.out.println("\"The tuition fee is being checked...");
    Thread.sleep(3000);
            
            try {
                y.yurtdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
    System.out.println("Political ban is being checked ...\"");
    Thread.sleep(3000);
            try {
                y.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
               ex.printStackTrace();
               continue;
            }
    System.out.println("Visa is being checked ...");
    Thread.sleep(3000);
            try {
                y.vizeDurumuKontrol();
            }
                catch (VizeException ex) {
               ex.printStackTrace();
               continue;
            };
            
            
            System.out.println("We wish you a good trip...");
            
    
    
    
    
    
    
    
    
    
    
}
    }
    
    
}
