/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;

/**
 *
 * @author Excalibur
 */
public class Media {
    public String title ;
    public int length ;
    public int curPosition ;

    public Media(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public int getCurPosition() {
        return curPosition;
    }
    public void play() {
        System.out.println("Play of Medıa");
        
    }
    public void pause (){
        System.out.println("Pouse of Medıa");
        
    }
    public void stop(){
        System.out.println("Stop of Medıa");
        
    }
    public void backward(){
        System.out.println("Backward of Medıa");
        
    }
    public void fastForward(int speed){
        System.out.println("Fast Forwardof Medıa");
    }

    @Override
    public boolean equals(Object o) {
        if ( o instanceof Media)
           Media m = (Media)o{
            if(this.title.equals(m.title)&&this.length==m.length)
                return true;
        }
    

        return false;
    }
    


}
