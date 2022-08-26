/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders;
/**
 *
 * @author Excalibur
 */
public class DemoClass {
  
public int sum(int x, int y) throws SumGreaterThan100Exception {
        int sumofIntegers = x + y;
       
        if (sumofIntegers <= 100) {
            return sumofIntegers;
        } else {
            throw new SumGreaterThan100Exception("Sum is greater than 100");
        }
    }
}