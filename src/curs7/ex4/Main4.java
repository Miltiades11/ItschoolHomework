package curs7.ex4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //4. Comparing User-Entered Dates
        //Description: Write a method named areDatesEqual that reads two dates from the console and
        // returns true if they are equal, and false otherwise.
        //Input: Two dates entered by the user in the format YYYY-MM-DD.
        //Expected Output:
        //true if both dates are equal.
        //false if they are different.

        Scanner scanner = new Scanner(System.in);
        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();

        String compar = (LocalDate.parse(date1).compareTo(LocalDate.parse(date2)) == 0) ?
                            "Is the same date!" : "Isn't the same date!";
        System.out.println(compar);
    }
}
