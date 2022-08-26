package car;
public class Car {
String make ;
String model;
String color;
int year;
double price;
boolean isStarted = false;
int speed = 0 ;
int time = 0 ;
int yol = 0 ;

 
 Car(String make, String model, String color, int carYear, double price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = carYear;
        this.price = price ;
        
    
}

    
public void start (){
    this.isStarted= isStarted;
    
}
public void drive (int time , int yol){
    if( isStarted  )
    this.time = time ;
    this.yol = yol ;
    System.out.println("You need to start the car before you drive!");
    
}
public void park(){
    if(isStarted)
    this.time=time;
    this.yol= yol ;
    System.out.println("You need to start the car before park ! ");
    
        
    }

    public void calculateAvgSpeed(){
        System.out.println(make+" "+model+"'s spped: "+ yol/(time/60));

    
    
    
    
    
}

    

   
    
}
