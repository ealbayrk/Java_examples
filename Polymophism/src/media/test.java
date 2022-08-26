/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author Excalibur
 */
public class test {
    public static void main(String[] args) {
        Media film1= new Movie (" title" ,50 , "subTitle ", "director" , 50);
        System.out.println(film1.equals(args));
        System.out.println(film1.length);
    }
            
   
}
