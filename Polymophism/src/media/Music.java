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
public class Music extends Media {
    public String singer;
    public String albumeName;

    public Music(String title, int length , String singer , String albumeName) {
        super(title, length);
        this.albumeName=albumeName;
        this.singer=singer;
    }

    public String getSinger() {
        return singer;
    }

    public String getAlbumeName() {
        return albumeName;
    }
public void next(){
    System.out.println("next the musiccc");
}
public boolean equal(Object o){
    if(o instanceof Music ){
        Music m =(Music)o;
        if(this.singer.equals(m.singer)&&this.albumeName.equals(m.albumeName));
        return true;
    }
    return false;
}
}
