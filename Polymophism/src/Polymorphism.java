class Animal {
public void makeNoise(){
System.out.println("Some sound");
}
}
class Dog extends Animal{
    public void makeNoise(){
System.out.println("Bark");
}
}
class Cat extends Animal{ 
    public void makeNoise(){
    System.out.println("Meawoo");
}
}
public class  Polymorphism{
public static void main(String[]args) {
Animal a1 = new Cat(); 
a1.makeNoise(); //Prints Meowoo

Animal a2 = new Dog(); 
a2.makeNoise(); //Prints Bark
}
}
 

