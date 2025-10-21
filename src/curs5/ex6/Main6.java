package curs5.ex6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //6. While Loop
        //Write a program that asks the user to enter numbers. The program should continue prompting
        // the user until they enter -1. After they enter -1, print the sum of all numbers entered
        // (excluding -1).

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int previousNumber = 0;
        while(previousNumber != -1){
           int number = scanner.nextInt();
            sum += previousNumber;
           previousNumber = number;
        }
        System.out.println(sum);
    }
}
