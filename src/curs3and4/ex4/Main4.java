package curs3and4.ex4;

public class Main4 {
    public static void main(String[] args) {
        //4. Write a Java program where you declare two integer variables heightOne and heightTwo
        // with any values. Use a ternary operator to determine the greater height and assign it
        // to a variable maximumHeight. Print the result.

        int heightOne = 2;
        int heightTwo = 5;

        int maximumHeight = (heightOne > heightTwo)? heightOne : heightTwo;
        System.out.println(maximumHeight);
    }
}
