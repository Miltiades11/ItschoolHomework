package curs5.ex7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //7. Do-While Loop
        //Create a program where the user is prompted to guess a predefined number.
        // After each guess, the program should inform the user if the guess is too high or too low.
        // The program should keep prompting the user until they guess correctly. Using a do-while loop,
        // ensure the user is always asked at least once.

        Scanner scanner = new Scanner(System.in);
        int answer = 9;
        int guess;
        do {
            System.out.println("Take a guess: ");
            guess = scanner.nextInt();
            if (guess < answer) {
                System.out.println("You are lower then you should be!");
            } else if(guess > answer) {
                System.out.println("You are higher then you should be!");
            }
        } while (guess != answer);

        System.out.println("Congratulations, the answer was truly " + answer);
    }
}
