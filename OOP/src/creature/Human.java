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
public class Human  extends Creature{
    
   
    public String name;
    private  int count ;
    
   Human(String name ,  int count ){
       this.name=name;
       this.count=count ;
       
   }
    public String toString(){
       return "name " + name  + "count  " + count  ;
}
    
    
    
}
