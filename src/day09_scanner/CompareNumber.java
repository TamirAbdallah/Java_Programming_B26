package day09_scanner;

import java.util.Scanner;
public class CompareNumber {
 /*
 Creat a scanner object
 ask the user to enter 2 numbers
 check if the number are equal to each other
  */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter number 1");
   int num1 = input.nextInt();

        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        System.out.println("the numbers are equal:" + (num1 == num2));
    }
}
