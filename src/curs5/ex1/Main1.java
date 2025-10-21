package curs5.ex1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //1. Even or Odd Checker
        //Write a Java program that takes an integer as input. If the number is even, print "Even".
        // If it's odd, print "Odd".

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }
}
