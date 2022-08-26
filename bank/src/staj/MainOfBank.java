/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainOfBank {

    public static void main(String[] args) throws IOException, InterruptedException {

        ArrayList<Musteri> MusteriFile = new ArrayList<>();
        ArrayList<Personel> PersonelFile = new ArrayList<>();
        FileReader MusteriFile1 = new FileReader("C:\\Users\\Excalibur\\Documents\\NetBeansProjects\\bank\\src\\staj\\MusteriFile.txt");
        FileReader PersonelFile1 = new FileReader("C:\\Users\\Excalibur\\Documents\\NetBeansProjects\\bank\\src\\staj\\PersonelFile.txt");
        BufferedReader musteri = new BufferedReader(MusteriFile1);
        BufferedReader personel = new BufferedReader(PersonelFile1);
        Scanner scn = new Scanner(System.in);
        String entry = musteri.readLine();
        while (entry != null) {
            String[] token = entry.split(", ");
            Musteri m = new Musteri(token[0], Integer.parseInt(token[1]), Integer.parseInt(token[2]));// neden budgeti burada yazan olarak almıyor ??

            MusteriFile.add(m);
            entry = musteri.readLine();
        }

        String entry_ = personel.readLine();
        while (entry_ != null) {
            String[] token = entry_.split(" ");
            Personel p = new Personel(token[0], token[1]);
            PersonelFile.add(p);
            entry_ = personel.readLine();
        }
        String menu = "0.Quit\n"
                + "1.Customer\n"
                + "2.Banker";
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println(menu);
            System.out.println("---------------------------------------------");
            System.out.println("Please choose (0-2)...");
            String choice = scn.nextLine();

            if (choice.equals("0")) {
                System.out.println("Quit...");
                break;
            } else if (choice.equals("1")) {

                String a = "1.To deposit money \n" + "2.withdraw money";

                while (true) {
                    System.out.println(a);
                    String option = scn.nextLine();
                    //int b = scn.nextInt();

                    if (option.equals("1")) {

                        for (Musteri m : MusteriFile) {

                            System.out.print("how much money will be deposit ? ");
                            int money = scn.nextInt();
                            m.addmoney(money);
                            break;
                        }

                    } else if (option.equals("2")) {
                        for (Musteri m : MusteriFile) {
                            System.out.println("   how much money will be withdraw?");
                            int money = scn.nextInt();
                            try {
                                m.withdraw(money);
                            } catch (HasNotEnougMoneyException e) {
                                System.out.println(e.getMessage());
                                break;
                            }

                        }
                    }
                }
            } else if (choice.equals("2")) {
                System.out.println("Loading employee information...");
                for (Personel p : PersonelFile) {
                    System.out.println(p);
                }
                for( Musteri m : MusteriFile){
                    System.out.println("Loading customer information...");
                    System.out.println(m);



                    break;
                }
            } else {
                System.out.println("Invalid action ... Select the action you want to perform in the menu.(0-3)");
            }
        }
    }
}
