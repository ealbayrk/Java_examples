/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Excalibur
 */
public class Staff extends Person{
    public String school ;
    public double pay ;
    
    
    public Staff(String name, String address,String school , double pay ) {
        super(name, address);
        this.pay=pay;
        this.school=school;
    }

   

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    @Override
    public String toString() {
        return "Staff school=" + school + ", pay=" + pay ;
    }
}
