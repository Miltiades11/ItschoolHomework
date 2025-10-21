package curs5.ex9;

public class Main9 {
    public static void main(String[] args) {
        //9. For-Each Loop
        //Given an array of integers, write a program that prints each number in the array followed by
        // "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this
        // task.

        Integer[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int oddCounter = 0;
        int evenCounter = 0;
        for(int n : myArray){
            System.out.println(n);
            if(n % 2 == 0){
                System.out.println("This element is even");
                evenCounter++;
            } else{
                System.out.println("This element is odd");
                oddCounter++;
            }
        }
        System.out.println("Odd: " + oddCounter);
        System.out.println("Even: " + evenCounter);
    }
}
