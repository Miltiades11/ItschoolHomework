package curs3and4.ex20;

public class Main20 {
    public static void main(String[] args) {
        //20. Write a Java program that takes three integer variables a, b, and c as input.
        // Use nested ternary operators to find and print the largest number among the three.

        int a = 31;
        int b = 7;
        int c = 10;

        int largestNumber = (a > b && a > c)? a : (a < b && b > c)?  b : c;

        System.out.println(largestNumber);
    }
}
