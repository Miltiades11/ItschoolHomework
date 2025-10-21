package curs3and4.ex2;

public class Main2 {
    public static void main(String[] args) {
        //2.  Write a Java program to declare two integer variables firstNumber and secondNumber with
        // any values. Use an equality operator to compare these two numbers and print the result.
        // Do the same for two String objects firstString and secondString with the same value,
        // but use the equals() method for comparison. Print the result.

        int firstNumber = 5;
        int secondNumber = 7;

        String intDecision = (firstNumber == secondNumber)? "True" : "Fales";
        System.out.println(intDecision);

        String firstString = "Tom";
        String secondString = "Tom";

        String stringDecision = (firstString.equals(secondString))? "True" : "False";
        System.out.println(stringDecision);
    }
}
