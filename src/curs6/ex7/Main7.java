package curs6.ex7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        //7. Duplicate Character Remover
        //Description: Design a program using StringBuilder that removes duplicate characters from a string.
        // For example, "balloon" should become "balon".

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder update = new StringBuilder();
        System.out.println(string);
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(update.indexOf(String.valueOf(ch)) == -1){
                update.append(ch);
            }
        }
        System.out.println(update);
    }
}
