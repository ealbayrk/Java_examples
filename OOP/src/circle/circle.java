/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

//Burada main metot olmadığı için run çalışmıyor .Burada yanlızca objeyi tarif ediyoruz . 
public class circle {
double r = 1.0 ;
public circle() {
 
}
public circle( double newR){//yeni bir r oluşturduğumu belli etmek için newR yaptım.
    r = newR;   
}
public double getArea () {
 return  r * r * Math.PI ; 
}







}