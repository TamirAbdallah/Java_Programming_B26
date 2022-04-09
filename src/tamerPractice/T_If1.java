package tamerPractice;

import java.util.Scanner;

public class T_If1 {
    public static void main(String[] args) {
/*
       int num = 10;
       //  if(num > 10)
       //    System.out.println("Positive Number");  // will print   --> Positive Number
                         -------------------------------------
        int num = -10;
        if(num > 0)
         System.out.println("Positive Number"); //will print--> will not print (because it's wrong condition)
----------------------------------------------------------------------------------------------
       int num = 5;
        if (num == 5)
            System.out.println("Number = 5");      //will print
        System.out.println("A");                   //will print
        System.out.println("B");                   //will print
        System.out.println("c");}                  //will print

                           ------------------------------------------
 int num = 5;
        if (num ==4 )
            System.out.println("Number = 5");      // will not print
        System.out.println("A");                   // will print
        System.out.println("B");                   //will print
        System.out.println("c");}                  //will print
                      -------------------------------------------

 */
        Scanner in = new Scanner(System.in);
     /* int num = 0;
        System.out.println("Enter integer Number");
      num = in.nextInt();
       if (num == 4)
         System.out.println("number = 4");
      System.out.println("Thanks");
                  --------------------------------------
         int num = 0;
         System.out.println("Enter integer Number");
        num = in . nextInt();
        if (num > 0)
            System.out.println("Positive");
        else
        System.out.println("Negative");
                   ----------------------------------------------

        int num = 0;
        System.out.println("Enter integer Number");
        num = in.nextInt();
        if (num % 2 == 0)  // 11 % 2 = 1
            System.out.println("Even");
        else{
            System.out.println("Odd");
            -----------------------------------------
        int num = 0;
        System.out.println("Enter integer Number");
        num = in.nextInt();
        if (num % 2 == 0) {  // 11 % 2 = 1
            if (num > 10)
                System.out.println("Even");
    }
        else{
            System.out.println("Odd");
                ---------------------------------------------
        int num = 0;
        System.out.println("Enter integer Number");
        num = in.nextInt();  // 15
        if (num % 2 == 0)
            if (num > 10) {
                System.out.println("Even");
                System.out.println("and grater than 10");
            } else {
                System.out.println("Even");
                System.out.println("and grater than 10");
            } else{

        System.out.println("Odd");
                    _______________________
                */
            int num = 0;
            System.out.println("Enter integer Number");
            num = in.nextInt();  // 20

           if(num > 10)
               System.out.println("and grater than 10");
           else if (num == 10)
               System.out.println("Equal 10");
           else if (num <10)
               System.out.println("less than 10");

        }}



