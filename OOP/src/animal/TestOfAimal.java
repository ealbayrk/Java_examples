/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Excalibur
 */
public class TestOfAimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Ebrar");
        Dog dog1 = new Dog("Eren");
        System.out.println("" + cat1.toString() + "\nher sound is" );
         cat1.greets();
        System.out.println("" + dog1.toString()+"\nhis sound is " );
         dog1.greets();
        System.out.println("Dog:" + dog1.name);
        System.out.println("Cat:" + cat1.name);
        
    }
    
}
