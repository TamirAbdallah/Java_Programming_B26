package day05_variables;

public class RecapVirables {

    public static void main(String[] args) {

        // Declare variables

        byte numberOfC0ffeeCups;
        double totalPriceOfCoffee;
        int totalstudentInClass;

        // We can't print the variables becauce they don't have a value

        // System.out.println(numberOfC0ffeeCups);
        // System.out.println(totalPriceOfCoffee);
        // System.out.println(totalstudentInClass);

        // Assigning to variable

         numberOfC0ffeeCups = 2;
         totalPriceOfCoffee = 10.25;
         totalstudentInClass = 432;

        System.out.println(numberOfC0ffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(numberOfC0ffeeCups + " * " + totalstudentInClass);


        System.out.println( numberOfC0ffeeCups+ " # " + totalstudentInClass);
        // we use concatenation to print the value of two variables at the time

        // Declare and assign

        double temperature = 20;
        int javaDays =  5;

        System.out.println("This is my temperature: " + temperature);
        System.out.println("This is day " + javaDays + " in java class");

    }







}
