package curs11.ex4;

public class Main4 {
    public static void main(String[] args) {
        //4. Given an array of 10 integers, count how many of them are even numbers and how many are odd.
        // Print out both counts.

        Integer[] ints = {1,2,3,4,5,6,7,8,9,10};

        int oddCounter = 0;
        int evenCounter = 0;

        for(int number : ints){
            if(number % 2 == 0){
                System.out.println(number + " is even");
                evenCounter++;
            } else{
                System.out.println(number + " is odd");
                oddCounter++;
            }
        }
        System.out.println("Odd counter = " + oddCounter);
        System.out.println("Even counter = " + evenCounter);
    }
}
