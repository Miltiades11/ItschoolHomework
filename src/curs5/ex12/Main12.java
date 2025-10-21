package curs5.ex12;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        //12. Continue Statement
        //Create a program that asks the user for 10 numbers. Print the sum of all numbers that are
        // greater than 5. If the user enters a number less than or equal to 5, use the continue statement
        // to skip the addition for that number.

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int number = scanner.nextInt();
            if(number <= 5){
                continue;
            } else{
                sum += number;
            }
        }
        System.out.println(sum);
    }
}
