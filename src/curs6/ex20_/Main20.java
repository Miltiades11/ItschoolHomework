package curs6.ex20_;

import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        //20. Balanced Parenthesis Checker
        //Description: Develop a program that checks if a string has balanced parentheses
        // ((, ), {, }, [, and ]) using StringBuilder. The program should return true if the parentheses
        // in the string are balanced and false otherwise.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your test String down:");
        String string = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(ch == ')'){
                if(stringBuilder.indexOf("(") == -1){
                    stringBuilder.append(ch);
                } else{
                    stringBuilder.deleteCharAt(stringBuilder.indexOf("("));
                }
            } else if(ch == ']'){
                if(stringBuilder.indexOf("[") == -1){
                    stringBuilder.append(ch);
                } else{
                    stringBuilder.deleteCharAt(stringBuilder.indexOf("["));
                }
            } else if(ch == '}'){
                if(stringBuilder.indexOf("{") == -1){
                    stringBuilder.append(ch);
                } else{
                    stringBuilder.deleteCharAt(stringBuilder.indexOf("{"));
                }
            }
        }
        System.out.println(stringBuilder);
    }
}
