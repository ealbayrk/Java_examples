   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1111l6;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a, b, c, n and x0 values respectively: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int n = scn.nextInt();
        int x = scn.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            x = x - ((a*x*x + b*x +c)/(2*a*x+b));
            
        }
    }
}

    
        
