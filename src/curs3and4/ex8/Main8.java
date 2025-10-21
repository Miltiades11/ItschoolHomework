package curs3and4.ex8;

public class Main8 {
    public static void main(String[] args) {
        //8. Write a Java program to calculate the factorial of a number using a for loop.
        // Declare an integer variable number and assign a value to it.
        // Then calculate and print the factorial of number.

        int number = 5;
        int factorialNumber = 1;

        for(int i = 1; i <= number; i++){
            factorialNumber *= i;
        }
        System.out.println(factorialNumber);
    }
}
