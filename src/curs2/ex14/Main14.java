package curs2.ex14;

public class Main14 {
    public static void main(String[] args) {
        //14. Create a program that checks if a user entered number is within a specific range
        // (e.g., 1-100). Use relational operators for the checks.

        int num = 85;

        if(num >= 1 && num <= 100){
            System.out.println("The number is in range");
        } else{
            System.out.println("The number is out of range");
        }
    }
}
