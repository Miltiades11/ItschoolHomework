package curs2.ex6;

public class Main6 {

    //6. Write a Java program that takes two numbers from the user and uses relational operators
    // to display whether the first number is greater than, less than, or equal to the second number.

    public static void main(String[] args) {

        int a = 10;
        int b = 10;

        if(a > b){
            System.out.println("a este mai mare ca b");
        } else if(a < b){
            System.out.println("a este mai mic ca b");
        } else{
            System.out.println("a este egal cu b");
        }
    }
}
