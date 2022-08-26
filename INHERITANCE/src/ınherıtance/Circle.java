/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınherıtance;

import java.util.Date;

/**
 *
 * @author Excalibur
 */
public class Circle extends INHERITANCE {
  public double radius ;

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(String color, boolean filled, Date dateCreated , double radius){
        super(color, filled, dateCreated);
        this.radius=radius;
    }
     public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea (){
        return radius*radius*Math.PI;
    }
    public double getDiameter (){
        return 2*radius;
    }
    public double getPerimeter (){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println( "and r is " + radius) ;
    }
}
