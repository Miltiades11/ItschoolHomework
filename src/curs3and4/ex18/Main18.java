package curs3and4.ex18;

import java.util.Arrays;

public class Main18 {
    public static void main(String[] args) {
        //18. Write a Java program where you declare an integer array with 5 elements.
        // Use a for loop to initialize the array such that each element is equal to its index incremented by 1.
        // Then use another for loop to decrement each element by 1.
        // Print the array before and after the decrement operation using a for-each loop.

        int[] myArray = new int[5];

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray));

        for(int i = 0; i < myArray.length; i++){
            myArray[i] = myArray[i] - 1;
        }
        System.out.println(Arrays.toString(myArray));
    }
}
