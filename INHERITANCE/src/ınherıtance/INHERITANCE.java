/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ınherıtance;

import java.util.Date;

/**
 *
 * @author Excalibur
 */
public class INHERITANCE {

   public String color ;
   public boolean filled ;
   public Date dateCreated ;
 public INHERITANCE() {
    }

    public INHERITANCE(String color, boolean filled, Date dateCreated) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }
   @Override
   public String toString (){
    return  "color"+ color + "filled"+ filled + "date"+ dateCreated ;
}
    

   
    }
    

