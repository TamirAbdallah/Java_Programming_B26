package question;

import java.util.Arrays;

public class Assessment2_Q5 {
    public static void main(String[] args) {


        int[] b = {1, 2, 3};
        for (int j = 0; j < b.length; j++) {
            b[j] = (b[j] * 2);
        }

        System.out.print(Arrays.toString(b));
    }}