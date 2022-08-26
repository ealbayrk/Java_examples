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


public class Bownlingball extends Ball{

    public Bownlingball(double size) {
        super(size);
    }

    @Override
    public void bounce() {
        super.bounce();
        System.out.println("A bowling ball bounces so low.");
    }

    @Override
    public void toss() {
        super.toss();
    }
}
