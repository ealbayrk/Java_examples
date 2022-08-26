/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bm?;
/**
 *
 * @author Excalibur
 */
public class BMI {
    private String name ;
    private int age ;
    private double weight ;
    private double height ;
    private double kilogram  ;
    private double m  ;
    private int bmi;
    
    BMI(String name ,  int age , double weight , double height  ){
        this.age=age ;
        this.height=height ;
        this.name=name;
        this.weight=weight ;
    }
    BMI(String name , double weight , double height  ){
    this (name , 20 , weight , height ) ;     
    }
 public double getBMI   () {
        double BMI = weight * kilogram / height * m * height * m ;
        return Math.round(BMI*100)/100.0 ;    
 }
public String getStatus () {
    double BMI = getBMI ();
    if (BMI<18.5)
       return  "underweight" ;
    else if (BMI>25) 
        return " normal" ;
     else if (BMI>30) 
        return " overweigt" ;
     else 
        return "obese" ;  
}
public String getname  (){
   return name ;
}
public int getage () {
   return age ;
}
public double weight () {
    return weight ;
}
public double height () {
    return height ;
}
}
