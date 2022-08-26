/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school;

/**
 *
 * @author Excalibur
 */
public class Person{
public String name ;
public int age ;

Person(String name , int age ){
    this.age=age;
    this.name=name;
    
}


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
public String toString(){
       return "name:" + name +"\nage:" +age ;
}
}
