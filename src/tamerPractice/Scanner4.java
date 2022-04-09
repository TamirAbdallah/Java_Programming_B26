package tamerPractice;

import java.util.Scanner;

public class Scanner4 {
   /*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter a salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
     */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println(" Enter aSalary ");
       double salary = input.nextDouble();
       System.out.println("how many hours did you works in a week");
       int hourInWeek = input.nextInt();

       double hourlyRate = salary/(hourInWeek*52);
       System.out.println("Hourly Rate " + hourlyRate);

     System.out.println( "With the Salay $" + " \" salary \" + \" and working for \" + hoursInWeek + \" hours, your hourly rate is: $\" + hourlyRate);\n");




    }}
