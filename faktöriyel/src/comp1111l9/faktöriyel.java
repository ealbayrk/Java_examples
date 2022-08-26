    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1111l9;

import java.util.Scanner;

public class Q1 {
    
   public static int faktöriyel(int n) {
        Scanner scn = new Scanner (System.in ) ;
        System.out.println("Enter the num");
         n = scn . nextInt() ;
         int sum = 1 ;
        for ( int i = 1 ; i <=n ; i++ ) {
            sum = sum* i ;
            
        }
        System.out.println(""+sum);
       return sum ;
}
    public static int permutation(int M, int  N ) {
        Scanner scn = new Scanner (System.in) ;
        System.out.println("enter the 2 num");
        M = scn . nextInt() ;
        N = scn . nextInt () ;
         if ( N==0) {
        return M ;
        }
        else {
            return (faktöriyel(M)/faktöriyel(M-N));

        }
    
        
        
        
        
    }
        
   public static void main(String[] args) {
       permutation (5166,6565) ;
   }
}
