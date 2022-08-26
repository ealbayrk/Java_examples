/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircleWithStaticMembers;

/**
 *
 * @author Excalibur
 */
public class TestOfCircleWithStaticMembers {
public static void main (String[]args) {
    CircleWithStaticMembers mycircle = new CircleWithStaticMembers() ;    
        System.out.println("Circle:" + mycircle.radius);
        System.out.println("Circle's area:" + mycircle.getArea());
        System.out.println("Circle's number of object :" + mycircle .numberOfObjects);
     
    CircleWithStaticMembers yourcircle = new CircleWithStaticMembers() ; 
    yourcircle.radius = 20;
        System.out.println("Circle:" + yourcircle .radius);
        System.out.println("Circle's area:" + yourcircle .getArea());
        System.out.println("Circle's number of object :" + yourcircle .numberOfObjects);
        
    CircleWithStaticMembers ourcircle = new CircleWithStaticMembers() ; 
    yourcircle.radius = 25;
        System.out.println("Circle:" + ourcircle .radius);
        System.out.println("Circle's area:" + ourcircle .getArea());
        System.out.println("Circle's number of object :" + ourcircle .numberOfObjects);
     
    
         
         
         
         
         
         
         
         
         
         
         
     

         }
}