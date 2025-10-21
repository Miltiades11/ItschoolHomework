package curs6.ex1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //1. Reverse a String
        //Description: Use the StringBuilder class to write a program that reverses an input string.
        // For example, the input "hello" should return "olleh".

        Scanner scanner = new Scanner(System.in);

        StringBuilder myStringBuilder = new StringBuilder(scanner.nextLine());
        System.out.println(myStringBuilder);
        System.out.println("Reversed: " + myStringBuilder.reverse());
    }
}
