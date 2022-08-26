/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.util.Date;

/**
 *
 * @author Excalibur
 */
public class Shape {
    private Date dateCr;
    private String color ;
    private boolean filled ;

    public Shape(Date dateCr, String color, boolean filled) {
        this.dateCr = dateCr;
        this.color = color;
        this.filled = filled;
    }

    public Date getDateCr() {
        return dateCr;
    }

    public String getColor() {
        return color;
    }
    public boolean  isFilled(){
        return filled;
    }
    
    
    
    
}
