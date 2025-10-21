package curs6.ex11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        //11. Encode and Decode using Caesar Cipher
        //Description: Implement a Caesar Cipher encoder and decoder using the StringBuilder class.
        // The Caesar Cipher involves rotating letters a certain number of steps down or up the alphabet.
        // For example, with a shift of 1, 'A' would be replaced by 'B', 'B' would become 'C', and so on.

        Scanner scanner = new Scanner(System.in);
        char ch = 'A';
        String code = "ACB";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ch);

        while(!(stringBuilder.toString().equals(code))){
            System.out.println("How many times do you want to shift?");
            int shift = scanner.nextInt();
            ch += (char) shift;
            stringBuilder.append(ch);
            System.out.println(stringBuilder + " Success!");
        }

    }
}
