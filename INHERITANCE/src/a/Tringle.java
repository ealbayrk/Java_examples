/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a ;
/**
 *
 * @author Excalibur
 */
public class Tringle {
    public int side1 = 1;
    public int side2 = 1;
    public int side3 = 1;
    public String color ;
    public boolean filled ;
    
    

    public Tringle(String color , boolean filled , int side1 , int side2 , int side3) {
        this.color = color;
        this.filled = filled;
        this.side1=side1 ;
        this.side2=side2 ;
        this.side3=side3 ;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return (side1+side2+side3)/2 ;
    }
    public int getPerimeter (){
        return side1+side2+side3;  
    }

    @Override
    public String toString() {
        return "Triangle sides are " + side1 + " " + side2 + " " + side3 + "\nArea:" + getArea() +  "\nPerimeter:" + getPerimeter() + "\ncolor:" + getColor() + "\nisFilled" + isFilled(); 
                
    }
    public boolean equals (Tringle tri ){
        return tri.side1==this.side1 && tri.side2==this.side2 && tri.side3==this.side3;
        
        
    }
    
    
}
