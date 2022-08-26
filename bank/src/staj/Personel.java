package staj;

import java.util.ArrayList;

/**
 *
 * @author Excalibur
 */
public class Personel implements Bank{
    ArrayList<Personel> PersonelFile = new ArrayList<>();
    private String name;
    private String surname;

    public Personel(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Personel" + " " + name + " " + surname;
    }
}


