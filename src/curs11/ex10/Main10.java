package curs11.ex10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        //10. Write a program that manages a personal diary using an ArrayList. Each entry in the diary
        // is a string that contains a date in the format "YYYY-MM-DD" followed by a colon and the diary
        // entry for that day. Your program should allow the user to:
        //Add a new entry (but ensure there's no duplicate date).
        //Edit an existing entry based on the date.
        //Delete an entry by date.
        //Display all entries in reverse chronological order (latest first).
        //Ensure that all these operations are efficient, especially the addition of new entries, which should keep the list sorted without resorting it every time.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> diary = new ArrayList<>();

        diary.add("2025-01-12: Started learning Java, feeling motivated!");
        diary.add("2025-02-05: Wrote my first class and method.");
        diary.add("2025-03-18: Had a tough day debugging code.");
        diary.add("2025-04-10: Learned about ArrayLists and Collections.");
        diary.add("2025-06-01: Built a small console project.");
        diary.add("2025-07-20: Started exploring LinkedLists and Maps.");
        diary.add("2025-09-15: Practiced sorting algorithms manually.");
        diary.add("2025-10-05: Created my first GitHub repository!");
        diary.add("2025-10-18: Completed an exercise about comparators.");
        diary.add("2025-10-22: Writing code for the diary manager project.");

        System.out.println("Write your note in the diary");
        String addOnDiary = scanner.nextLine();
        boolean already = false;
        for (String n : diary) {
            if (n.substring(0, 10).equals(addOnDiary.substring(0, 10))) {
                already = true;
                break;
            }
        }
        if(already){
            System.out.println("This entry is already in your diary!");
        } else{
            diary.add(addOnDiary);
        }
//       Collections.sort(diary);
        sort(diary);
//        System.out.println(diary);
        edit("2025-10-22", diary);
        System.out.println(diary);
        delete("2025-10-22", diary);
        System.out.println(diary);
    }

    static void sort(ArrayList<String> diary){
        for(int i = 0; i < diary.size() - 1; i++){
            LocalDate date1 = LocalDate.parse(diary.get(i).substring(0, 10));

            for(int j = i+1; j < diary.size(); j++){
                LocalDate date2 = LocalDate.parse(diary.get(j).substring(0, 10));
                if(date1.isBefore(date2)){
                    String memory = diary.get(i);
                    diary.set(i, diary.get(j));
                    diary.set(j, memory);
                }
            }
        }
        System.out.println(diary);
    }


    static void edit(String date, ArrayList<String> diary){
        int index = 0;
        boolean found = false;
        for(String n : diary){
            String d = n.substring(0,10);
            if(d.equals(date)){
                index = diary.indexOf(n);
                found = true;
            }
        }
        if(found){
            Scanner sc = new Scanner(System.in);
            diary.set(index, date +": " + sc.nextLine());
        } else{
            System.out.println("Did not find date in diary.");
        }
    }

    static void delete(String date, ArrayList<String> diary){
        boolean found = false;
        for(String n : diary){
            String d = n.substring(0,10);
            if(d.equals(date)){
                diary.remove(n);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Couldn't find date in your diary.");
        }
    }
}

