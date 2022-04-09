package tamerPractice;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your Score");
        int score = input.nextInt();
        input.nextLine();

        System.out.println("Enter you full name ");
        String fullName = input.nextLine();

        System.out.println(" Score = " + score);
        System.out.println( "Full Name : "+ fullName );




    }
}
