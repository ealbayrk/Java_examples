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
public class Animal extends Creature{
    public int numberOfLegs ;
    private int count ;
    
Animal (int numberOfLegs , int count ){
    this.count=count;
    this.numberOfLegs=numberOfLegs;
}

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

 public String toString(){
       return "numberOFLegs: " + numberOfLegs  + "count  " + count  ;
}
}
