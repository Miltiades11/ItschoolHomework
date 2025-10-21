package curs7.ex9;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        //9. Interval Between Dates
        //Description: Design a method titled daysBetween that reads two dates from the console and
        // computes the total number of days between them.
        //Input: Two dates given by the user in the format YYYY-MM-DD.
        //Expected Output: An integer showcasing the difference in days between the two dates.

        Scanner scanner = new Scanner(System.in);
        String stringDate1 = scanner.nextLine();
        String stringDate2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1 = LocalDate.parse(LocalDate.parse(stringDate1).format(formatter));
        LocalDate date2 = LocalDate.parse(LocalDate.parse(stringDate2).format(formatter));

        System.out.println(daysBetween(date1,date2));
    }

    static long daysBetween(LocalDate date1, LocalDate date2){
        Duration diff = Duration.between(date1,date2);
        return diff.toDays();
    }
}
