package curs6.ex5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //5. Word Capitalizer
        //Description: Write a program that capitalizes the first letter of every word in a sentence
        // using the StringBuilder class.

        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());
        System.out.println(stringBuilder);
        char firstChar = Character.toUpperCase(stringBuilder.charAt(0));
        stringBuilder.replace(0,1,String.valueOf(firstChar));
        for (int i = 0; i < stringBuilder.length(); i++) {
            char ch = stringBuilder.charAt(i);
            if (ch == ' ') {
                stringBuilder.setCharAt(i + 1, Character.toUpperCase(stringBuilder.charAt(i + 1)));
            } else {
                continue;
            }
        }
        System.out.println(stringBuilder);
    }
}
