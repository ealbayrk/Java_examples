/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Excalibur
 */
public class Triangle extends Shape{
    
  private int side1 = 1, side2 = 1, side3 = 1;

    public Triangle( String color, boolean filled) {
        super( color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

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
public double getArea(){
     double semiPerimeter = (side1 + side2 + side3) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - side1)
              * (semiPerimeter - side2) * (semiPerimeter - side3));
}
public double getPerimeter(){
    return side1+side2+side3;
}

    @Override
    public String toString() {
        return "Triangle side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 ;
    }


   public boolean equals (Triangle t){
       return this.side1==t.side1 && this.side2==t.side2&&this.side3==t.side3;
   }
    


    
}
