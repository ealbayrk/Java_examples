/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crop;

/**
 *
 * @author Excalibur
 */

public abstract class Crop{
    protected  String name;
    protected double weight;
    protected String cultivatedSeason;

    public Crop() {
        
    }
    
    public Crop(String name, double weight, String cultivatedSeason) {
        this.name = name;
        this.weight = weight;
        this.cultivatedSeason = cultivatedSeason;
    }
    
    public void setName(String name) {
    this.name = name;
    }
    
    public void setWeight(double weight) {
    this.weight = weight;
    }
    
    public void setCultivatedSeason(String cultivatedSeason) {
    this.cultivatedSeason = cultivatedSeason;
    }
    
    public String getName() {
    return name;
    }
    
    public double getWeight() {
    return weight;
    }
    
    public String getCultivatedSeason() {
    return cultivatedSeason;
    }
    
    
    public abstract String consumeIt();
    public abstract void storeIt(Store s);
    
    @Override
    public abstract String toString();
}

