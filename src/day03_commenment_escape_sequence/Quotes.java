package day03_commenment_escape_sequence;

public class Quotes {

    public static void main(String[] args) {

        /*
         Q: How can you output this:
         I like "java" programming
       */


        System.out.println("I like\" java \"programming");
        System.out.println("\"This is a quote\"");
        System.out.println("This is a quote");


        System.out.println("I love\"jesus\"so much");

        /*
         The First quote is before java printing the text
         The secound quote is to print the " Quotation mark in the console
         */

        // i want to print backslash
        System.out.println("abc\\def");

        /*
         The first backslash is for the syntax of escape characters
         The second backslash is for the backslash charactor to be putput
         */
        System.out.println("abc\\\\def");// this will print two backslash


        System.out.println("abc\\\"def");

        System.out.println("abc/def");


    }








}
