
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class hesapmakinesi {

  

    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String işlemler = "1.Toplama\n" + "2.Çarpma\n"+"3.Bölme\n"+"4.Fark\n";
        
         System.out.println(işlemler);
                    System.out.println("Hangi işlemi yapmak istiyorsunuz");
                    String işlem=scn.nextLine();
                    try{
                    if(işlem.equals("1")){
                        System.out.println("2 rakam giriniz:");
                        int a = scn.nextInt();
                        int b = scn.nextInt();
                        
                        System.out.println(a+b);
                        
    }
                    else if(işlem.equals("2")){
                        System.out.println("2 rakam giriniz:");
                        int a = scn.nextInt();
                        int b = scn.nextInt();
                        System.out.println(a*b);
                        
    }
                    else   if(işlem.equals("3")){
                        System.out.println("2 rakam giriniz:");
                        int a = scn.nextInt();
                        int b = scn.nextInt();
                        System.out.println(a/b);
                        
    }
                    else  if(işlem.equals("4")){
                        System.out.println("2 rakam giriniz:");
                        int a = scn.nextInt();
                        int b = scn.nextInt();
                        System.out.println(a-b);
                        
    }
                    else {
                        System.out.println("Geçersiz ...");
                    }
        
    
        }
        catch (ArithmeticException e ){
            System.out.println("Sayı sıfıra bölünemez ... ");
        }
        catch (InputMismatchException e ){
            System.out.println("Lütfen geçerli sayı giriniz...");
        }
     
    }
}
