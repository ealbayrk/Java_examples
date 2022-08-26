/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolcu;

import java.util.Scanner;



/**
 *
 * @author Excalibur
 */
public class Yolcu implements YurtDısıKuralları {

    
    private int harc;
    private boolean siyasiYasak ;
    private boolean vizeDurumu ;
public Yolcu() {
    Scanner scn = new Scanner (System.in);
    System.out.println("Yatırdığınız harç bedeli :");
    this.harc=scn.nextInt();
    System.out.println("Siyasi yasağınız var mı ?");
    String cevap = scn.nextLine() ;
    if("evet".equals(cevap)){
        this.siyasiYasak=true;
    }
    else{
        this.siyasiYasak=false;
    }
    System.out.println("Vizeniz bulunuyoe mu ?");
    String cevap2 = scn.nextLine() ;
    if("evet".equals(cevap2)){
        this.vizeDurumu=true;
    }
    else{
        this.vizeDurumu=false;
    }
}
    
    @Override
    public boolean yurtdisiHarciKontrol() {
        if (this.harc>=15){
            System.out.println("Çıkabilirsiniz. ");
        return true ;
    }
        else{
            System.out.println(" Çıkamazsınız ");
        return false;
                }
    }

    @Override
    public boolean siyasiYasakKontrol() {
         if (this.siyasiYasak==true ){
            System.out.println("Siyasi yasağınız yok . ");
         return true;
    }
         else{
            System.out.println("Siyasi yasağınız var . Çıkamazsınız .");
                    return false;
    }
    }
    @Override
    public boolean vizeDurumuKontrol() {
                 if (this.vizeDurumu==true ){
            System.out.println("Vizeniniz var ");
         return true;
    }
         else{
            System.out.println("Vizeniz yok . Çıkamazsınız .");
                    return false;
    }
    }
    
    
}
