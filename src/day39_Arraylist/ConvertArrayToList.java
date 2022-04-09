package day39_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer [] arr = {1, 2, 3,};   //  we made an Integer array becauce ArrayList does not accept primitive types
        Arrays.asList(arr); // converts the array to acollection typs (ArrayList)

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr)); // creating an ArrayList With value from a collection type
        System.out.println(nums);

        // Creating an ArrayList with some initial values

        ArrayList<Integer>other = new ArrayList<>( Arrays.asList(4, 5, 6, 7));
        System.out.println(other);



    }




}
