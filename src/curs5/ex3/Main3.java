package curs5.ex3;

public class Main3 {
    public static void main(String[] args) {
        //Counting Negative Numbers
        //Given an array of integers, write a program to count and print the number of negative integers
        // in the array.

        Integer[] myArray = {0,-1,2,3,-4,5,6,7};

        int counter = 0;
        for(int i = 0; i < myArray.length; i++){
            if(myArray[i] < 0 ){
                System.out.println(myArray[i]);
                counter ++;
            }
        }
        System.out.println("Counter: " + counter);
    }
}
