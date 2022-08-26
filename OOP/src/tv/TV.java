/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tv ;


public class TV { 
    int channel = 5 ;
    int volumeLevel = 2 ;
    boolean on = false ;
 
TV(){ 
  
}   

public void turnOn(){
  if (!on) 
      on =true ;             
 }
 public void turnOff(){
     if (on)
         on = false ;                               
 }
 public void setChannel ( int chNo){
     if (on && chNo>=0 && chNo<=9 )
         channel = chNo ;
     
 }
 public void setvolume (int vol){
     if (on && vol >=0 && vol <= 3  )
         volumeLevel = vol ;
 }
      public void volumeUp(){
        volumeLevel++;
    }
    
    public void volumeDown(){
        volumeLevel--;
    }
    
    public void channelUp(){
        channel++;
    }
    
    public void channelDown(){
        channel--;
    }
    
}
