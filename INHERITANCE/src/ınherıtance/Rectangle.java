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
public class Rectangle extends INHERITANCE{
    public double width ;
    public double height ;

    public Rectangle(double width , double height ) {
        this.height=height;
        this.width=width;
    }

    public Rectangle(String color, boolean filled, Date dateCreated,double height , double width) {
        super(color, filled, dateCreated);
        this.height=height ;
        this.width=width ;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width*height ;
    }
    public double getPrimeter(){
        return (2*width)+(2*height);
    }
}