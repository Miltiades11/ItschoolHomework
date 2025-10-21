package curs7.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main1 {
    public static void main(String[] args) {
        //1. Displaying Today's Date
        //Description: Write a method named displayTodaysDate that, when called, prints the current
        // date to the console.
        //Expected Output: Today's date in the format YYYY-MM-DD.
        displayTodaysDate();

    }

    static void displayTodaysDate(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(format));
    }
}
