/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 
package CircleWithStaticMembers ;
/**
 *
 * @author ATE
 */
public class CircleWithStaticMembers {
    
    
    double radius; //instance variable
    
    // Statik bir değişken, sınıfın tüm nesneleri tarafından paylaşılır . 
    static int numberOfObjects = 0;
    
    static final int MAX_NUMBER_OF_OBJECT = 10 ;
    
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjects++;
    }
    
    //static method
    static int getNumberOfObjects(){
        return numberOfObjects;
    }
    
    //instance method
    double getArea(){
        return Math.PI * radius * radius; 
    }
}
    


/* static final olarak tanımlanmış bir instance variable ya değer tanımlanırken (örnek olarak a değişkeni) yada 
static blok (örnek olarak b değişkeni) ile tanımlanır. Bu kullanımda constructor’a parametre geçerek değer 
atama işlemi gerçekleştirilemez.
public class TestFinalStaticVariable {

    private static int x;
    private static int y = 5;
    private static int z;

    private static final int a = 10;
    private static final int b;

    static {  // static final constructor'dan tanımlanamadığı için static blok ile tanımlama yapabiliriz.
        b = 30;
        
*/