package curs3and4.ex10;

import java.util.ArrayList;
import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        //10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
        // Add some elements to listOne and assign listOne to listTwo.
        // Now modify listOne by adding a new element. Print both lists and observe the output.

        ArrayList<String> listS = new ArrayList<>(Arrays.asList("Tom", "Andrei", "Vali", "Matei"));
        ArrayList<Integer> listI = new ArrayList<>(Arrays.asList(1,2,3,4));

        System.out.println(listS);
        System.out.println(listI);

        listS.add("Cornel");
        listI.add(11);

        System.out.println(listS);
        System.out.println(listI);
    }
}
