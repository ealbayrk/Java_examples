package GeometricObject ;

public class Rectangle extends GeometricObject {
    public double width ;
    public double height ;
    
    
Rectangle(){
    
}
Rectangle(double width , double height ){
    this.width=width;
    this.height=height ;
    
}
Rectangle (double width , double height , String color , boolean filled )  {
    this.height=height ;
    this.width=width ;
    setColor(color) ;
    setFilled(filled) ;
}    

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
public double getArea () {
        return width*height ;
    
}
public double getParimeter (){
    return 2*(width + height);
}
}




        