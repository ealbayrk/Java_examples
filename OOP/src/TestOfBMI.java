/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmı;
/**
 *
 * @author Excalibur
 */
public class TestOfBMI{
    public static void main(String[] args) {
        BMI M = new BMI("E" , 21 , 56.5 , 171.2) ;
        System.out.println("BMI of :" + M.getname()+ ":" + M.getBMI() + " " + M.getStatus() );
        
    }
}
