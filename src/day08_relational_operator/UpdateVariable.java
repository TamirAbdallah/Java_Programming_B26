package day08_relational_operator;

public class UpdateVariable {

    public static void main(String[] args) {

        // adding 1 to a variable
        int a = 10;
        a = 11;
        a++;  //12
        ++a;  //13
        a = a + 1; //14
        System.out.println("a = " + a);

        // add 10 to the variable

        int b = 4;
        // 10 times I write b++;
        b = 14;
        b = b + 10; //    24   reads the value of b, adds 10 to it, then the result is store back into b by reassigning
        b += 10; //    24 +10 = 34  this code is the same as --> b = b + 10;
        System.out.println("b = " + b);

        int count = 0;
        count += 5; // 0+5 = 5    count = count + 5;
        System.out.println(count);
        count -= 10; // 5-10 = -5    count = count - 10;
        System.out.println(count);
        count *= 2; // -5 * 2 = -10
        System.out.println(count);

    }



}
