/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptıon;

/**
 *
 * @author Excalibur
 */
public class finallyy{
    public static void main(String[] args) {
  try {
            
            int a = 30 / 0;
    
        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez..");
        }
        catch (NullPointerException e) {
            System.out.println("Null Referans Hatası.... ");
        }
        finally {
            
            System.out.println("Finally bloğu çalışıyor....");
        }
        System.out.println("Burası Çalışıyor....");
        
        
    }
}



