/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Excalibur
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        Rectangle r = new Rectangle("pembe" , 5 , 3 );
        System.out.println(r.toString()); 
        System.out.println("Üçgenin alanı hesaplanıyor ...");
        Thread.sleep(3000);
        System.out.println(r.getArea());
        System.out.println(r instanceof Rectangle);
        
    }
    
}
