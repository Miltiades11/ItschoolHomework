package curs5.ex5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //5. Fibonacci Series Generator
        //Write a program that generates and prints the first n numbers of the Fibonacci series,
        // where n is provided by the user.

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int a = 0;
        int b = 1;

        for(int counter = 0; counter < number; counter++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
