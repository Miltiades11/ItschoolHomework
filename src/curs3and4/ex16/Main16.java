package curs3and4.ex16;

public class Main16 {
    public static void main(String[] args) {
        //16. Write a Java program where you use unary operators to perform a series of transformations
        // on an integer variable number initialized to 50. First, negate number, then take the absolute
        // value, and finally increment it by 1. Print the result at each step.

        int number = 50;
        System.out.println(number);
        int nagateNumber = -number;
        System.out.println(nagateNumber);
        int absValue = Math.abs(nagateNumber);
        System.out.println(absValue);
        absValue++;
        System.out.println(absValue);
    }
}
