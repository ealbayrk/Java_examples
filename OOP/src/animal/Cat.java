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
public class Cat extends Mammal{
    
    public Cat(String name) {
        super(name);
    }

 
    
 public void greets (){
     System.out.println("meow");
 } 
 @Override 
 public String toString(){
     return "Cat's name is " + name ;
 }
}
