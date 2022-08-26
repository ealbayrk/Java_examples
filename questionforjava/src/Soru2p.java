 import java.util.Scanner;

public class Soru2p {

	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 2 integer: " );

		int n = scn.nextInt();
                int i = scn . nextInt () ;
                
                digitAt(n,i) ;
               
	
 }     
     
     //2         
    public static int digitAt (int n ,int i) {
        
      if ( i==0) {
      System.out.println ( "the number is =" + n%10) ;
      return n % 10 ;
       }else if ( i ==1 ){
           System.out.println ("the number is : " (n%100)/10 ) ;
       }else if ( i ==2 ){
           System.out.println ("the number is : " (n%100)/10)
       }else if ( i ==3 ){
           System.out.println ("the number is : " (n%1000)/10);
       }else  {
           System.out.println ("number is undefined: " ) ;
   f 
 
 
