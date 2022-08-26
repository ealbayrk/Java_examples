/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
/**
 *
 * @author Excalibur
 */
public class Person {
    public String name ;
    public String address ;
    
    Person(String name , String address){
        this.address=address;
        this.name=name;
        
    }
    public String getName (){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
        
    }
    public String toString(){
        return "name: " + name + "address: " + address;
    }

   }

