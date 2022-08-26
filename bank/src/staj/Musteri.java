/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staj;

import java.util.ArrayList;

/**
 *
 * @author Excalibur
 */
public class Musteri implements Bank {

    private String name;
    private int id;
    private double budget;
    ArrayList<Musteri> MusteriFile = new ArrayList<>();

    public Musteri(String name, int id, int budget) {

        this.budget = budget;
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double Budget) {
        this.budget = budget;
    }

    public void addmoney(int money) {
        budget += money;
        System.out.println("your new balance :" + budget);
    }

    public void withdraw(int money) throws HasNotEnougMoneyException {

        if (budget - money >= 0) {
            budget -= money;

            System.out.println("your new balance : " + budget);
        } else {
            throw new HasNotEnougMoneyException("not enough money ");
        }
    }

    @Override
    public String toString() {
        return "Musteri" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", budget=" + budget ;
    }
}
