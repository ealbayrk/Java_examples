/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;



/**
 *
 * @author Excalibur
 */
public class TestOfClass {
    public static void main(String[] args) {
        
    
    
    Person p1 =new Person("Eren" , "Yahya Kemal");
    Student s1= new Student ("Eren" , "Timur sokak " , "işletme " , 2023 , 6.000);
    Staff staff = new Staff ("Eren" , "Timur sokak " , "Medeniyet", 6.000);
        System.out.println(p1.toString());
        System.out.println(s1.toString());
        System.out.println(staff.toString());
   
            }
    
}
