/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person ;
/**
 *
 * @author Excalibur
 */
public class Person {
    public String name ;
    public String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

 
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person name is " + name + ", address=" + address ;
    }
    
    
}
