/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal ;

/**
 *
 * @author Excalibur
 */
public class Animal {
    public String name ;
  public Animal(String name) {
        this.name = name;
    }
           
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String toString(){
       return "Animal name is " + name ;
   }
    
}
