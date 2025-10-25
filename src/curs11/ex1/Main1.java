package curs11.ex1;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        //1. Create a shopping list with array and print the values

        String[] shoppingList = new String[5];
        shoppingList[0] = "Milk";
        shoppingList[1] = "Bread";
        shoppingList[2] = "Beef";
        shoppingList[3] = "Chicken";
        shoppingList[4] = "Butter";

        System.out.println(Arrays.toString(shoppingList));
    }
}
