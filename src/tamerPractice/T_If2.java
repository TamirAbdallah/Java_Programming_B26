package tamerPractice;
import java.util.Scanner;
public class T_If2 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
       /*
        int Mark ;
        System.out.println("Please Enter your Score: ");
        Mark =in.nextInt();
        if (Mark >= 90)
            System.out.println("Grad = A");
        else if(Mark >= 80)
            System.out.println("Grad = B");
        else if (Mark >= 70)
            System.out.println("Grad = C");
        else if (Mark >= 60)
            System.out.println("Grad = D");
        else
            System.out.println("Fail");
            ______________________________________________
        */
        System.out.println("Please Enter your Score: ");
        int Mark ;
        Mark =in.nextInt();
        if (Mark >= 90 && Mark <= 100)
            System.out.println("Grad = A");
        else if(Mark >= 80 && Mark < 90)
            System.out.println("Grad = B");
        else if (Mark >= 70 && Mark < 80)
            System.out.println("Grad = C");
        else if (Mark >= 60 && Mark < 70)
            System.out.println("Grad = D");
        else
            System.out.println("Please Enter a Valid Number");

    }
}
