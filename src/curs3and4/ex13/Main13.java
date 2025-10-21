package curs3and4.ex13;

public class Main13 {
    public static void main(String[] args) {
        //13. Write a Java program where you declare two boolean variables isRaining and isSunny
        // with values of true and false, respectively. Use the logical complement operator to negate
        // the values of both variables and print the new values.

        boolean isRaining = true;
        boolean isSunny = false;

        System.out.println("Is raining: " + !isRaining);
        System.out.println("Is sunny: " + !isSunny);
    }
}
