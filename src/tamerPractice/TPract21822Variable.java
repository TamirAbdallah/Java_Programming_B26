package tamerPractice;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class TPract21822Variable {
    public static void main(String[] args) {
        byte age = 60;
        System.out.println("age");
        System.out.println(age);
        // byte age2 = 128;
        short year;
        year = 2022;
        System.out.println("year");
        System.out.println(year);
        int addressNumber = 2444400;
        System.out.println(addressNumber);
        System.out.println("addressNumber");

        long bigNumber = 194818889959L;
        System.out.println (bigNumber);
        System.out.println ("bigNumber");

        System.out.println("\n\n");

        int apples = 50;
        int grapes = 100;
        int bananas = 150 ;

        System.out.println("this is how many apple:" + apples);
        System.out.println("Grapes: " + grapes);
        System.out.println("Bananas:" + bananas);
        System.out.println("sold some apples");
        apples = 25;
        int Price = 15;
        System.out.println("Apples after selling: " + apples);
        System.out.println("The Price of My "  +  apples + " apples is $"+ Price );
        System.out.println("\n\n");
        //-----------------------------------------------
        int Month = 9;
        int Day = 15;
        int Year = 1978;
        System.out.println("Month+Day+Year");
        System.out.println(Month+"/"+Day+"/"+Year);
        System.out.println("Month/Day/Year");
        System.out.println(Month+"-"+Day+"-"+Year);
        System.out.println("\n\n");
        //-----------------------------------------

        int years;
        System.out.println(" The Olympics will be in these Locations for the Coming Years ");

        Year = 2022;
        System.out.println("Look forward to the year "+year+" for the Olympic to be in China");

        Year = 2024;
        System.out.println("Look forward to the year "+year+" for the Olympic to be in Italy");

        Year = 2026;
        System.out.println("Look forward to the year "+year+" for the Olympic to be in France");



    }
}