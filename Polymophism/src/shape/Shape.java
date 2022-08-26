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
public abstract class Shape {
    public String color;
    
  public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
abstract double getArea();
public abstract String toString();
  
    
}
