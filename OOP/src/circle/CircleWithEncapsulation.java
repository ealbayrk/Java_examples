/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Excalibur
 */
public class CircleWithEncapsulation {
    private double r = 1 ;
    private static int  numberOfObjects = 0 ;
    public  CircleWithEncapsulation() {
        numberOfObjects ++ ;  
}
   public  CircleWithEncapsulation(double R){
       r=R;
          numberOfObjects ++ ;  
   }
  public double  getr () {
       return r ;
   }
  public double  setr (double R) {
       r = R ; 
       return r ;

   }
  public static int getNumberOfObjects() {
      return numberOfObjects ;
  }
  
   public double getArea (){
   return Math.PI *r*r ; 
           
           }   
}
