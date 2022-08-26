/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author Excalibur
 */
public class testOfCircle {
    //diğer ekranda bulunan tarnımla atıfla nesneleri oluşturacağım .
    public static void main (String[]args) {

circle myCricle = new circle () ; // new circle tanımını çağırak için kullanılıyor. Nesne oluşuyor . Bu nesneye göre benim e başta aldığım r değeri = 1
circle yourCricle = new circle (5.2) ; // burada ise circle ( double newR ) çağırıyoruz .Nesne oluşuyor . Daha sonra ise r değerimi 5.2 ile değiştiriyorum ve yeni bir r nesnesi oluşturuyorum .
System.out.println("My circle r :" + myCricle.r); //çağırmak istediğim nesne circle r olduğu için . r yapıyoruz . Scanner ile nesne oluşturuken scn ile çağırıyordum fakat burada" . " ile çağırılıyor .
System.out.println("Your circle r :" + yourCricle.r);
yourCricle . r = 12.5 ; // nesnenin değerini yeniden değiştirmek için  kullanılıyor .
System.out.println("Your circle r :" + yourCricle.r);
System.out.println("My circle  area is  :" + myCricle.getArea() ); //Alanı hesaplaması için getArea metotunu çağırıyoruz .
System.out.println("Your circle  area is  :" + yourCricle.getArea() );//Alanı hesaplaması için getArea metotunu çağırıyoruz .


    
}
}