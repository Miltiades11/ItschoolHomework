package curs5.ex2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //2. Month Name Finder
        //Write a program that asks the user to enter a number between 1 and 12.
        // Print the name of the corresponding month or "Invalid Month" if out of range.

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch(month){
            default -> System.out.println("Invalid month");
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
