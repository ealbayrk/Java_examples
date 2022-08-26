
import java.util.Scanner;

public class ssoru2p {

	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter 2 integer: " );

		int n = scn.nextInt();
                int i = scn . nextInt () ;
                
                digitAt(n,i) ;
         
                
               
               
	
 }     
     
     //2         
    public static int digitAt (int n ,int i) {

    if(n > 0) {
        n= (n/10);
        System.out.printf("%d   ", (n%10));
    }
            return 0;
  
  }
}

    
    