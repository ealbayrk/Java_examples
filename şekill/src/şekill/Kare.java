/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package şekill;

/**
 *
 * @author Excalibur
 */
    
public class Kare extends Sekil{
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
        
    }

    @Override
    public  void alanHesapla() {

        System.out.println(getIsim() + " in alanı : " + (kenar * kenar));
        
    }
    
    
}
