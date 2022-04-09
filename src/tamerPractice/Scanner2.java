package tamerPractice;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your first sentence");
        String firstSentence =input.next();


        System.out.println(" Enter your Second sentence");
        String secondSentence = input.next();

        System.out.println(" Enter your first sentence: " + firstSentence);
        System.out.println(" Enter your Second sentence: " + secondSentence);

    }
}
