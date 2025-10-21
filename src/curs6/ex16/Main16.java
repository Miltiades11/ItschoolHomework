package curs6.ex16;

import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        //16. Toggling Case
        //Description: Design a program using StringBuilder that toggles the case of every character
        // in a given string. For example, "HelLo" should become "hELlO".

        Scanner scanner = new  Scanner(System.in);
        System.out.println("Put your string:");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(Character.isUpperCase(ch)){
                stringBuilder.append(Character.toLowerCase(ch));
            } else{
                stringBuilder.append(Character.toUpperCase(ch));
            }
        }
        System.out.println(stringBuilder);
    }
}
