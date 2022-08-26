import java.util.Scanner;

public class soru1p {

	public static void main(String [] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer: " );

		int n = scn.nextInt();
           
		System.out.println("the input is " + n);
		
		digitZero(n);
	}

    public static int digitZero(int n) {
	 
		System.out.println("the output is " + n%10);
    	
       return n%10;
	 
 }
	
}