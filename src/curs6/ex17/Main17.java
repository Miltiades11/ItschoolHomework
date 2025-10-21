package curs6.ex17;

import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        //17. String Interleaver
        //Description: Write a program using StringBuilder that interleaves two strings.
        // For instance, given "abc" and "123", the result should be "a1b2c3".

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your strings:");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        int stringLength = (string1.length() > string2.length())? string1.length() : string2.length();
        for(int i = 0; i < stringLength; i++){
            if(i < string1.length()){
                stringBuilder.append(string1.charAt(i));
            }
            if(i < string2.length()){
                stringBuilder.append(string2.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
