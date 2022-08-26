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
public class Voleyball extends Ball{

    public Voleyball(double size) {
        super(size);
    }

    @Override
    public double getSize() {
        return super.getSize();
    }

    @Override
    public void bounce() {
        super.bounce();
        System.out.println("A volleyball bounces very high.");

    }

    @Override
    public void toss() {
        super.toss();
    }
}
