package curs3and4.ex21;

public class Main21 {
    public static void main(String[] args) {
        //21. Write a Java program that takes a double variable score representing a student’s score
        // on a test. Use a ternary operator to classify the score into letter grades A, B, C, D, or F
        // according to the following scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59
//        Print the resulting letter grade.

        double score = 20;

        char grade = (score >= 90 && score <= 100)? 'A' : (score >= 80 && score <= 89)? 'B':
                (score >= 70 && score <=79)? 'C': (score >= 60 && score <= 69)? 'D': 'F';

        System.out.println(grade);
    }
}
