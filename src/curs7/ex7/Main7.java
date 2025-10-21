package curs7.ex7;

import java.time.LocalDate;

public class Main7 {
    public static void main(String[] args) {
        //7. Date Arithmetic
        //Description: Write a method named addWeeksToToday that accepts an integer as its argument.
        // This integer denotes the number of weeks. The method should add this number of weeks to
        // today's date and return the resultant date.
        //Input: An integer n (e.g., 4).
        //Expected Output: A date object that is n weeks from today.

        LocalDate date = LocalDate.now();
        System.out.println(date);
        date = addWeeksToToday(date,3);
        System.out.println(date);
    }

    static LocalDate addWeeksToToday(LocalDate date, int numberOfWeeks){
        return date.plusWeeks(numberOfWeeks);
    }
}
