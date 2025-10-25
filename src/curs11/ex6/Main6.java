package curs11.ex6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        //6. Given a LinkedList storing student names, write a program that checks if a particular
        // student name exists in the list. If it does, remove that name from the list.

        LinkedList<String> students = new LinkedList<>();
        students.add("Mircea");
        students.add("Ionut");
        students.add("Cristi");
        students.add("Antonia");
        students.add("Monica");

        Scanner scanner = new Scanner(System.in);
        String particularStudent = scanner.nextLine();

        if(students.contains(particularStudent)){
            students.remove(particularStudent);
            System.out.println("We removed " + particularStudent + " from the list!");
            System.out.println(students);
        } else{
            System.out.println("That particular name is not on the list!");
        }
    }
}
