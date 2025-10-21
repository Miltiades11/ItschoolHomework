package curs6.ex18_;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        //18. Pattern Recognition
        //Description: Design a Java program using StringBuilder that checks if a given pattern repeats
        // in a string. For instance, given the string "ababab", the repeating pattern is "ab".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your string:");
        String string  = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i< string.length(); i++){
            char ch = string.charAt(i);
            for(int j = i; j < string.length(); j++){

            }
        }
    }
}
