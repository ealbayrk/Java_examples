/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yurtdışı;

import java.util.Scanner;
class SiyasiException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("You Have a Political Ban...");
    }
}
class VizeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("You don't have a visa ...");
    }   
}
class HarcException extends Exception {

    @Override
    public void printStackTrace() {

        System.out.println("Please pay full overseas fees...");
    }  
}
public class Yolcu{
    
    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;
    
    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Fee you deposited: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Do you have any political bans (yes or no)?");
        
        String cevap = scanner.nextLine();
        
        if (cevap.equals("yes")) {
            
            this.siyasiYasak = true;
        } 
        else {
            this.siyasiYasak = false;
        }
        System.out.print("Do you have a visa? (Yes or no)");
        
        String cevap2 = scanner.nextLine();
        
        if (cevap2.equals("yes") ){
            this.vizeDurumu = true;
            
        }
        else {
            this.vizeDurumu = false;
        }
    }
    public void yurtdisiHarciKontrol() throws HarcException {
        if (this.harc < 15) {     
           throw new HarcException();   
        }
        else {
            System.out.println(" fee process complete!");
          
        }
    }

    
    public void siyasiYasakKontrol() throws SiyasiException {
        
        if (this.siyasiYasak == true) {
            throw new SiyasiException();
            
           
        }
        else {
            System.out.println("Siyasi yasağınız bulunmuyor...");
           
        }
    }
    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            System.out.println("Vize işlemleri tamam!");
            
        }
        else {
            throw new VizeException();
            
            
        }

    }
    
    
}
