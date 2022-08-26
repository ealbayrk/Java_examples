
package GeometricObject ;

public class Circle extends GeometricObject {
    public double r ;
    
 Circle (){
     
 }
  Circle (double r){
      this.r=r;
     
 }
 Circle(double r , String color , boolean filled){
     setColor(color) ;
     setFilled(filled);
     this.r=r;
   
     
 }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }
    public double getArea(){
        return r*r*Math.PI ;
        
    }
    public double getDiameter(){
        return 2*r;
    }
    public double getPerimeter(){
        return 2*r*Math.PI;
    }
    public void printCirle(){
        System.out.println("The circle created :"+ getDateCreated() + " r :"+r);
        
    }
   
}

