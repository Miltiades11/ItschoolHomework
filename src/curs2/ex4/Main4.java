package curs2.ex4;

public class Main4 {

    //4. Write a Java program that uses both the increment (++)
    // and decrement (--) operators in a loop to count up to 10 and then back down to 1.

    public static void main(String[] args) {

        int a = 1;

        for(int i = 0; i < 10; i++){
            System.out.println(a);
            a++;
        }

        for(int i = 0; i < 10; i++){
            a--;
            System.out.println(a);
        }
    }
}
