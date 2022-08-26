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
    public String schoool;
    public double pay;

    public Staff(String name, String address , String school , double pay) {
        super(name, address);
        this.pay=pay;
        this.schoool=school;
    }

    

    public String getSchoool() {
        return schoool;
    }

    public void setSchoool(String schoool) {
        this.schoool = schoool;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "name: " + name + "address: " +address + "school:  " + schoool +"pay: " + pay ;
    }
}
