
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excalibur
 */
public class RandomClasss {
public static void main (String[]args) {
/* Random random1 = new Random () ;
    System.out.println("random1:");
    int a = random1.nextInt(10);
    System.out.println(a);
 for ( int i = 0 ; i<10 ; i++ ) {
        System.out.println("random 2 : " + random1.nextInt(10)+ " ") ;
 
}
}*/
Random random1 = new Random (4) ; // 4 NE İFADE EDİYOR 
    for ( int i = 0 ; i<10 ; i++ ) 
        System.out.println("random 1 : " + random1.nextInt(1000)+ " ") ;
    
Random random2 = new Random (4) ;
    for ( int i = 0 ; i<10 ; i++ ) 
        System.out.println("random 2 : " + random2.nextInt(1000)+ " ") ;
        
Random random3 = new Random (4) ;
  for ( int i = 0 ; i<10 ; i++ ) 
        System.out.println("random 3 : " + random3.nextInt(1000)+ " ") ;
        
    
}
}