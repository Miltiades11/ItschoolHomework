package curs5.ex8;

public class Main8 {
    public static void main(String[] args) {
        //8. For Loop
        //Write a program that prints the first 10 numbers in the Fibonacci series.
        // Use a for loop to accomplish this.
        int a = 0;
        int b = 1;

        for(int counter = 0; counter < 10; counter++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
