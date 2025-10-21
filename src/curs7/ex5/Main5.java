package curs7.ex5;

import java.time.LocalDate;

public class Main5 {
    public static void main(String[] args) {
        //5. Is Today a Specific Date?
        //Description: Write a method named isTodaySpecificDate that checks if today's date is
        // 10th December 2019.
        //Expected Output:
        //true if today's date is 2019-12-10.
        //false otherwise.

        System.out.println(isTodaySpecificDate(LocalDate.now()));
    }

    static boolean isTodaySpecificDate(LocalDate date){
        return (date == LocalDate.of(2019,12,10)) ? true : false;
    }
}
