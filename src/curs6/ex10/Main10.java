package curs6.ex10;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        //10. Morse Code Converter
        //Description: Create a program that takes in a string and converts it to Morse code using the
        // StringBuilder class. For simplicity, you can assume the input string only contains alphabets
        // and numbers.

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(string);
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            String morse =" ";
            switch (Character.toLowerCase(ch)){
                case 'a' -> morse = " ._ ";
                case 'b' -> morse = " _... ";
                case 'c' -> morse = " _._. ";
                case 'd' -> morse = " _.. ";
                case 'e' -> morse = " . ";
                case 'f' -> morse = " .._. ";
                case 'g' -> morse = " __.. ";
                case 'h' -> morse = " .... ";
                case 'i' -> morse = " .. ";
                case 'j' -> morse = " .___ ";
                case 'k' -> morse = " _._ ";
                case 'l' -> morse = " ._.. ";
                case 'm' -> morse = " __ ";
                case 'n' -> morse = " _. ";
                case 'o' -> morse = " ___ ";
                case 'p' -> morse = " .__. ";
                case 'q' -> morse = " __._ ";
                case 'r' -> morse = " ._. ";
                case 's' -> morse = " ... ";
                case 't' -> morse = " _ ";
                case 'u' -> morse = " .._ ";
                case 'v' -> morse = " ..._ ";
                case 'w' -> morse = " .__ ";
                case 'x' -> morse = " _.._ ";
                case 'y' -> morse = " _.__ ";
                case 'z' -> morse = " __.. ";
                default -> morse = " ";
            }
            stringBuilder.append(morse);
        }
        System.out.println(stringBuilder);
    }
}
