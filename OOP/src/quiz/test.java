/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Excalibur
 */
public class test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Voleyball v = new Voleyball(2);
        Bownlingball b = new Bownlingball(3);
        dog.bounce();
        v.bounce();
        b.bounce();
    }
}
