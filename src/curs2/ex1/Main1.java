package curs2.ex1;

public class Main1 {

    //1. Write a Java program to take two numbers as input and display the result of addition,
// subtraction, multiplication, division, and modulus.
    //Hello maraciuca

        public static void main(String[] args) {

            int a = 10;
            int b = 15;

            int sum = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            double division =(double)a / b;
            int modulus = a % b;
            System.out.println(sum + " " + subtraction + " " + multiplication + " " + division + " " + modulus);
        }
    }