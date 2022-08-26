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

public class Vegetable extends Crop implements Comparable {
    
    private String cultivatedRegion;
    public String color;

    public Vegetable(String name, double weight, String cultivatedSeason, String cultivatedRegion) {
        super(name, weight, cultivatedSeason);
         this.cultivatedRegion=cultivatedRegion;
    }

    Vegetable() {
        
    }
    
    public String getCultivatedRegion() {
        return cultivatedRegion;
       }
    
    @Override
    public String consumeIt() { 
        return "vegetables are cooked";
    }
    
    @Override
    public void storeIt(Store s) {
        try {
            throw  new CanNotBeStoredException();
        }catch (CanNotBeStoredException ex) {
            System.err.println("Can Not Be Stored Exception");   
        }
         
        
    }
    
    @Override
    public String toString() {
        return "Vegetable{" + "Crop name=" + name + ", weight=" + weight + ", cultivatedSeason=" + cultivatedSeason + ", cultivatedRegion=" + cultivatedRegion + '}';
    }

    

    @Override
    public double compareTo(Crop C) {
        Vegetable f = (Vegetable) C;
        if(this.name.equals(f.name)){
            return 0;
        }else{
            return (int) (this.weight - (int)f.weight);
        
}
    }
}

   
    
    
    


    