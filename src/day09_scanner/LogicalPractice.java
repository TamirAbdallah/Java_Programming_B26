package day09_scanner;

public class LogicalPractice {
    public static void main(String[] args) {

       int n = 6;

        System.out.println(n > 5);            // true
        System.out.println(n < 10);           // false
        System.out.println(n > 5 && n < 10);  // true && false

        System.out.println(4 > 3 || false); // not false -> true
        System.out.println(3 > 4 || false); //  not true -> false
        System.out.println();
    }
}
