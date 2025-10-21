package curs7.ex2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //2. Date Decomposition
        //Description: Write a method named displayDateComponents that accepts a date as an argument
        // and prints its year, month, and day components separately.
        //Input: A date in the format YYYY-MM-DD.
        //Expected Output:
        //makefile
        //Copy code
        //Year: YYYY
        //Month: MM
        //Day: DD

        Scanner scanner = new Scanner(System.in);
        String dateString = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateString);
        displayDateComponents(date);
    }

    public static void displayDateComponents(LocalDate date){
        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonthValue());
        System.out.println("Day: " + date.getDayOfMonth());
    }
}
