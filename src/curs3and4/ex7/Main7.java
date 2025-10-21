package curs3and4.ex7;

public class Main7 {
    public static void main(String[] args) {
        //7. Write a Java program that determines the type of a triangle based on its sides.
        // Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
        // Use the ternary operator to determine and print whether the triangle is "Equilateral",
        // "Isosceles", or "Scalene".

        int sideOne = 10;
        int sideTwo = 10;
        int sideThree = 10;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree)? "Equilateral" :
                (sideOne == sideTwo)? "Isosceles" : (sideThree == sideOne) ? "Isosceles" :
                (sideThree == sideTwo) ? "Isosceles" : "Scalene";

        System.out.println(triangleType);
    }
}
