/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yolcu;

/**
 *
 * @author Excalibur
 */
public class MAİN {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Havalimanına Hoşgeldiniz...");
        String şartlar = " Kurallar :\n"
                +"Siyasi yasak olmamalı\n"
                +"Harç yatırılmalı (15tl)\n"
                +"Vize olmalı" ;
        String mesaj ="Şartların hepsini sağlamalısınız " ;
        while (true){
        System.out.println("-------------------------------");
        System.out.println(şartlar);
        System.out.println("-------------------------------");
        System.out.println();
        Yolcu yolcu= new Yolcu();
            System.out.println("Harç bedeli kontrol edliyor ...");
            Thread.sleep(3000);
            if(yolcu.yurtdisiHarciKontrol()==false){
            System.out.println(mesaj);
            continue ;
        }
            System.out.println("Siyasi yasak kontrol ediliyor ...");
            Thread.sleep(3000) ;
            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println("Siyasi yasağınız var ." + mesaj);
            continue;
            }
            System.out.println("Vize durumu kontrol ediliyor ...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println("Vizeniz yok"+mesaj);
                continue;
            }
            System.out.println("İşlemleriniz tamam . Yurt dışına çıkabilirsiniz:)");
break ;            
            
    }
                
    }}
    

