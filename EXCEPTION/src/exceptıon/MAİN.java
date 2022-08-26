/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptıon;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;
/**
 *
 * @author Excalibur
 */
public class MAİN {
    public static void mekan_kontrol(int yas) throws InvalidAgeException{
        if(yas<18){
                throw new InvalidAgeException("yaşınız küçük" );
            } 
            else{
                    System.out.println("Hoşgeldiniz...");
            }    
        }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz ...");
        int yas = scn.nextInt();
        try
        {
        mekan_kontrol(yas);
        }
        catch(InvalidAgeException e)
        {
           // e.printStackTrace();
            System.out.println(e);
        }  
    }
    }
    

