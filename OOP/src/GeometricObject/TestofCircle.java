  package GeometricObject ;

public class TestofCircle {
    public static void main(String[] args) {
        Circle circle = new Circle (5);
        System.out.println("CIRCLE");
        System.out.println(".................................................");
        System.out.println("A circle :"+ circle.toString() );
        System.out.println("Color:" + circle.color);
        System.out.println("R:" + circle.r);
        System.out.println("Area:" + circle.getArea());
        System.out.println("Diameter:" + circle.getDiameter());
        Rectangle rec= new Rectangle(5,3);
        System.out.println("RECTANGLE");
        System.out.println("...................................................");
        System.out.println("A circle :"+ rec.toString() );
        System.out.println("Area:" + rec.getArea());
        System.out.println("Diameter:" + rec.getParimeter());

        
        
        
        
        
        
        
        
    }
}
