package curs7.ex8;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main8 {
    public static void main(String[] args) {
        //8. Weekday Identifier
        //Description: Construct a method named findDayOfWeek that takes in a date and returns the
        // specific day of the week (e.g., Monday, Tuesday, etc.) for that date.
        //Input: A date in the format YYYY-MM-DD.
        //Expected Output: The day of the week in string format (e.g., "Wednesday").

        System.out.println(findDayOfWeek(LocalDate.now()));
    }

    static String findDayOfWeek(LocalDate date){
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}
