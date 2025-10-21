package curs5.ex4;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //4. String Reverser
        //Ask the user to enter a string. Print the reversed version of this string.

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();

        for(int i = myString.length()-1; i >= 0; i--){
            System.out.print(myString.charAt(i));
        }
    }
}
