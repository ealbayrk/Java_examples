/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricObject ;

import java.util.Date;

/**
 *
 * @author Excalibur
 */
public class  GeometricObject{
    public String color ;
    public  boolean filled ;
    public Date dateCreated ;
    
 GeometricObject(){
     
 }
 GeometricObject(String color , boolean filled , Date dateCreated){
     this.color=color ;
     this.filled=filled ;
     this.dateCreated=dateCreated ;
     
 }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
      this.filled = filled;
   }

    //public void setDateCreated(Date dateCreated) {
      //  this.dateCreated = dateCreated;
   // }
    public String getColor() {
        return color;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public boolean isFilled() {
        return filled;
   }
   public String toString(){
       return"created on" + dateCreated + "\ncolor :"+ color +"\nisfilled:"  + filled;
   }

 
    
            
    
    
}

