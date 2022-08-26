/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Excalibur
 */
public class TestClass{
    public static void main(String[] args) {
        Triangle t = new Triangle ("pembe" , false );
        System.out.println("equals: "+t.equals(t));
        System.out.println("alan:"+t.color);
        System.out.println("boşluk mu?"+ t.filled);
        System.out.println("üçgen:"+ t.toString());
        System.out.println("s1:"+ t.getSide1() + "s2:"+t.getSide2()+"s3:"+t.getSide3());
        
    }
    
}
