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
public class Movie extends Media{
    public String subTitle;
    public String director;
    public int year;

    public Movie(String title, int length,String subTitle , String director , int year) {
        super(title, length);
        this.director=director;
        this.subTitle=subTitle;
        this.year=year;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void fastForward(int speed) {
        System.out.println("FastForward ");
    }

    @Override
    public void Stop() {
        System.out.println("Stop the movie...");
    }

    @Override
    public void backward() {
        System.out.println("Backward the movie...");
    }

    @Override
    public void pause() {
        System.out.println("Pause the movie ...");
    }

    @Override
    public void play() {
        System.out.println("Play the movie...");
       
    }
    
    public boolean equal(Object o){
        if(o instanceof Movie){
            Movie m = (Movie)o;
        if(this.director.equals(m.director)&&this.subTitle.equals(m.subTitle)&&this.year==m.year)
        return true;
    }
        return false;
    }

    
    
}
