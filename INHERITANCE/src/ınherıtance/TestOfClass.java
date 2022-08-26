/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınherıtance;

/**
 *
 * @author Excalibur
 */
public class TestOfClass {
    public static void main(String[] args) {
        Circle c = new Circle (1) ;
        System.out.println("A circle :" + c.toString());
        System.out.println("The color is : " + c.getColor());
        System.out.println("The r is :" + c.getRadius());
        System.out.println("The area is :" + c.getArea());
        System.out.println("The diameter is :" + c.getDiameter());
        
        Rectangle r = new Rectangle (7,5) ;
        System.out.println("Rectangle:" + r.toString());
        System.out.println("The area is:"+c.getArea());
        System.out.println("The perimeter is : " + r.getPrimeter());
        
        
        
    }
    
}
