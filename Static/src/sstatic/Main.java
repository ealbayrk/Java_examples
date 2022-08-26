/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sstatic;

    
public class Main {
    public static void main(String[] args) { //ana metod statictir çünkü bellekte her zaman oluşması gerekir . 
        
        /*Seyirci seyirci1 = new Seyirci("Ebrar ALBAYRAK");
        Seyirci seyirci2 = new Seyirci("Eren Kayali");
        
        seyirci1.oyun_seyret();
        System.out.println("Seyirci Sayısı: " + Seyirci.getSeyirciSayisi()); //seyirci sayısı direk göründü çünkü artık öbjeye değil classa bağlı . Classı çağırdığımda geliyor .
        System.out.println("Seyirci Sayısı: " + seyirci1.getSeyirciSayisi());
        System.out.println("Seyirci Sayısı: " + seyirci2.getSeyirciSayisi());*/
        
        selamla(); //metodu static olmasaydı  hata verirdi .
        
        System.out.println(Math.PI); 
    }
    public static void selamla(){
        
        System.out.println("helloo");
        
    }
}

    