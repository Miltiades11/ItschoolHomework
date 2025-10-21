package curs7.ex6;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main6 {
    public static void main(String[] args) {
        //6. Getting Current Time
        //Description: Write a method named displayCurrentTime that prints the current time to the console.
        //Expected Output: The current time in the format HH:MM:SS.

        displayCurrentTime();
    }

    static void displayCurrentTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(LocalTime.now().format(formatter));
    }
}
