/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Excalibur
 */
public class Rectangle extends Shape {
    public int lenght;
    public int width;

    public Rectangle(String color , int lenght , int width) {
        super(color);
    }
 
    
    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    

    double getArea() {
       
        return lenght*width;
    }

    @Override
    public String toString() {
        return "l:" + lenght + "w: " + width ;
    }

   
}
