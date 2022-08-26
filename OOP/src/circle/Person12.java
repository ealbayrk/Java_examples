
package circle;
public class TestOfCircleWithEncapsulation {
        public static void main(String[] args) {
        CircleWithEncapsulation c1= new CircleWithEncapsulation () ;
        CircleWithEncapsulation c2= new CircleWithEncapsulation () ;
            System.out.println("R of  c1 is  :" + c1.getr() );
        c1.setr(25) ; // c1.r = 20 ; modifiye edildi setr ile
            System.out.println("R of  c1 is  :" + c1.getr() );         
             System.out.println("number of circle object :" + CircleWithEncapsulation.getNumberOfObjects() );         
        }   
}
