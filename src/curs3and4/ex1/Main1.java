package curs3and4.ex1;

public class Main1 {
    public static void main(String[] args) {
        //1. Write a Java program where you create two String objects named stringOne and stringTwo
        // with the same value "OpenAI". Check and print whether they refer to the same object.

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        String decision = (stringTwo == stringOne)? "True" : "False";

        System.out.println(decision);
    }
}
