package curs6.ex2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //2. Palindrome Checker
        //Description: Write a program that checks whether a given string is a palindrome using the
        // StringBuilder class. A palindrome is a word, phrase, number, or other sequences of characters
        // that reads the same forward and backward.

        Scanner scanner = new Scanner(System.in);
        StringBuilder myStringBuilder = new StringBuilder(scanner.nextLine());
        String isPalindrom = (myStringBuilder.toString().equalsIgnoreCase(myStringBuilder.reverse().toString())) ? "Este palindrom!" :
                                "Nu este palindrom!";
        System.out.println(isPalindrom);
    }
}
