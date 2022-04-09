package day22_loops;

public class Letters {
    public static void main(String[] args) {
        // a-z lowercase
        char lowerCaseUp = 'a';
        while (lowerCaseUp <= 'z') {
            System.out.print(lowerCaseUp + " ");
            lowerCaseUp++;
        }
            System.out.println();

        // Z-A UPPERCASE

        char uppercaseBack = 'Z';                      // int i = 122
        while (uppercaseBack >= 'A') {                 // i >=97
            System.out.print(uppercaseBack + " ");     // (char)i
            uppercaseBack--;


        }


    }}

