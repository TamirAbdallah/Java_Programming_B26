package ExtraPractice;

public class KgToPounds {
    public static void main(String[] args) {


    /*
    create a class called KgTopounds, and write a program that can convert Kg
to pound and print the result
Ex:
kg = 10;
output:
10 kg equal to 22.0462 pounds
kg = 20
output:
20 kg equal to 44.0924 pounds
....
Hint: 1kg = 2.20462 pounds
*/

    double kgToPound = 2.20462;
    double kg1 = 10;
    double kg2 = 20;

        System.out.println("10 kg Equal to " + kg1 * kgToPound);
        System.out.println("20 Kg Equal to " + kg2 * kgToPound);


    }
}