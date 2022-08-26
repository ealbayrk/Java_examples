/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication105;

/**
 *
 * @author Excalibur
 */
public class Creature{

    public int lifetime;
    protected double height = 0.0;
    
Creature (int lifetime , double height ){
    this.height=height ;
    this.lifetime=lifetime ;

}

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
public Creature produce (Creature a ) {
        return a ; //dön
    
}
public void  decreaseLifetime ( int lifeTime  ) {
    }


public String toString(){
       return "lifetime:" + lifetime + "height " + height ;
}
}
 



.abstract .abstract .abstract 
class Creature{
    private int lifetime;
    protected double height;
    
    protected Creature(int lifetime, double height){
        this.lifetime = lifetime; 
        this.height = height;
    }

    Creature produce(Creature a){
        return null;
    }
    
    public void decreaseLifetime(){
        lifetime--;
    }
    
    public String toString(){
        return "lifetime: " + lifetime + " height: " + height;
    }
}

class Human extends Creature{
    private String name;
    private int count;
    
    public Human(int lifetime, double height, String name, int count){
        super(lifetime, height);
        this.name = name;
        this.count = count;
    }

    Creature produce(Creature a){
        Human aa = ((Human) a);
        int maxCount;
        double maxHeight;
        
        if(aa.count > count)
            maxCount = aa.count;
        else
            maxCount = count;

        if(aa.height > height)
            maxHeight = aa.height;
        else
            maxHeight = height;

        Creature newCreature = new Human(20, maxHeight, name, maxCount);
        return newCreature;
    }

    public String toString(){
        return super.toString() + " name: " + name + " count: " + count;
    }
}

class Animal extends Creature{
    private int numberOfLegs;
    private int count;

    public Animal(int lifetime, double height, int numberOfLegs, int count){
        super(lifetime, height);
        this.numberOfLegs = numberOfLegs;
        this.count = count;
    }

    Creature produce(Creature a){
        Animal aa = ((Animal) a);
        int maxNofLegs; 
        int maxCount;
        double maxHeight;
        if(aa.numberOfLegs > numberOfLegs)
            maxNofLegs = aa.numberOfLegs;
        else
            maxNofLegs = numberOfLegs;
        
        if(aa.count > count)
            maxCount = aa.count;
        else
            maxCount = count;

        if(aa.height > height)
            maxHeight = aa.height;
        else
            maxHeight = height;
        
        Creature newCreature = new Animal(20, maxHeight, maxNofLegs, maxCount);
        return newCreature;
    }

    public String toString(){
        return super.toString() + " numberOfLegs: " + numberOfLegs + " count: " + count;
    }
}

public class Main {
    
    public static void main(String[] args) {
        Creature [] creatures = new Creature[4];
        
        creatures[0] = new Human(75,165, "name", 100);
        creatures[1] = new Animal(20, 85, 4, 10);
        creatures[2] = new Animal(5, 23, 2, 34);
        creatures[3] = creatures[1].produce(creatures[2]);
        
        for(int i = 0;i<4;i++)
            System.out.println(creatures[i].toString());
    }
}
