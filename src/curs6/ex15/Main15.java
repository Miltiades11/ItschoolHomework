package curs6.ex15;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        //15. Anagram Checker
        //Description: Develop a program that checks if two provided strings are anagrams of each other
        // using the StringBuilder class. Anagrams are words or phrases made up of the same characters.

        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];

        for(int i = 0; i < string1.length(); i++){
            char ch = string1.charAt(i);
            arr1[ch]++;
        }
        for(int i = 0; i < string2.length(); i++){
            char ch = string2.charAt(i);
            arr2[ch]++;
        }
        boolean result = false;
        for(int i = 0; i < arr1.length && i < arr2.length; i++){
            if(arr1[i] == arr2[i]){
                result = true;
            } else{
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
