 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1111w10;

import java.util.Scanner;

/**
 *
 * @author Ozay
 */
public class q2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = scn.nextInt () ;
        for ( int i = 2 ; i<x ; i++){
            if ( x % i == 0){
                System.out.println("asal değil ");
            }
            else  {
            System.out.println("asal ");
                        }
            break ;
            }
        }
        
        
      
      
      
      
      
      
    }
    }