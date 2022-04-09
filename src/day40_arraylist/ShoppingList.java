package day40_arraylist;
import day37_wrapper_arraylist.ArrayListExample;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String>shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty()? "Shopping List Empty" : "you have some items");
        String keepAsking;

        do {
            System.out.println("Enter the item ");
            input.nextLine();

            shoppingList.add(input.nextLine());
            System.out.println("Do you want to continue y/n");
            keepAsking = input.nextLine();
        }while (keepAsking.equals("yes") || keepAsking.equals("y"));
        System.out.println("Shopping List: ");
        for (String item : shoppingList){
            System.out.println(" *\t" + item);
        }
        System.out.println("------------------------------");

        System.out.println(shoppingList.contains("water") ? "water on list " : "No water on the list" );

        System.out.println("Do you want to remove any item?");
        if (input.nextLine().equals("yes")){
            System.out.println("What item do you want to remove");
            String removeItem = input.nextLine();  // this will either be an item name or the item number

            if (Character.isDigit(removeItem.charAt(0))) { // checks the first character of remove item,
                int number = Integer.parseInt(removeItem);
                shoppingList.remove(number - 1); // converts the number to an index. if the user wants to remove the first item they would give 1 , so to remove the first index 1 - 1 = 0
            } else{
                shoppingList.remove(removeItem);
            }}
            System.out.println("Final List: " + shoppingList);
        }
    }



