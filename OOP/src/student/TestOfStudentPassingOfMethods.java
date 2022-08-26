/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Excalibur
 */
public class TestOfStudentPassingOfMethods {
public static void main (String[]args) {
    int times = 5 ;
    student s1 = new student () ;
        System.out.println("time inside main method before calling aMethod: " + times );
        System.out.println("student's age  inside main method before calling aMethod: " + s1.age );
    aMethod (times , s1) ;
        System.out.println("time inside main method after calling aMethod: " + times );
        System.out.println("student's age  inside main method after calling aMethod: " + s1.age );
    }    
        
    public static void aMethod (int n , student s2 )  {
    n ++ ;
        System.out.println("test inside method : " + n );
        s2.age+=n ;
        System.out.println("s2 age inside method " + s2.age);
        
    }
    }
    
    

