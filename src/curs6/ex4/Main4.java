package curs6.ex4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //4. Removing Vowels
        //Description: Create a Java program that uses the StringBuilder class to remove all the
        // vowels from an input string.

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string);
        string = string.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u'){
                stringBuilder.append(ch);
            } else{
                continue;
            }
        }
        System.out.println(stringBuilder);
    }
}
