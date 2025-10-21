package curs5.ex11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        //11. Break Statement
        //Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
        // If the user enters 0, break out of the input loop and then print the average of the numbers
        // entered so far.

       Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        int counter = 0;
        do{
            number = scanner.nextInt();
            sum += number;
            if(number != 0){
                counter++;
            }
        }while(number != 0);
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(sum / counter);
    }
}
