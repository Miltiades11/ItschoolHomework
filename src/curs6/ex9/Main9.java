package curs6.ex9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        //9. Frequency Counter
        //Description: Using StringBuilder, write a program that counts the frequency of each
        // character in a string.

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string);
        int[] freq = new int[128];
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.toLowerCase().charAt(i);
            freq[ch]++;
        }

        for(int j = 0; j < freq.length; j++){
            if(freq[j] > 0){
                stringBuilder.append((char) j).append(freq[j]).append("\n");
            }
        }
        System.out.println(stringBuilder);
    }
}
