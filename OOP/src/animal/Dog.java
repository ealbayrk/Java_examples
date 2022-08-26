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
public class Dog extends Mammal {
    
    public Dog(String name) {
        super(name);
    }
    public void greets (){
        System.out.println("woof");
    }
    public void greets(Dog another) {
        System.out.println("wooof");
    }

    @Override
    public String toString() {
        return "Dog's name is " + name ;
    }
    
}
