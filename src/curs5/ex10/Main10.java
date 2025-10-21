package curs5.ex10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        //10. Jump Statements
        //Create a menu-driven program where the user is presented with options:
        //
        //Print "Hello World"
        //Print the user's name.
        //Exit.
        //Based on the user's input, perform the necessary action. Once an action is completed,
        // show the menu again, unless the user chooses the Exit option. Use jump statements to control
        // the flow of the program.

        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            System.out.println("1. Print 'Hello World'");
            System.out.println("2. Print the user's name");
            System.out.println("3. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 -> System.out.println("Hello world!");
                case 2 -> {
                    System.out.println("Enter your username: ");
                    String username = scanner.nextLine();
                    System.out.println("Username: " + username);
                }
                case 3 -> System.out.println("Goodbye!");
                default -> System.out.println("Something went wrong! Try again:");
            }
        } while(choice != 3);
    }
}
