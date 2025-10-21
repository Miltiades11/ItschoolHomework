package curs3and4.ex19;

public class Main19 {
    public static void main(String[] args) {
        //19. Write a Java program that takes an integer variable age as input. Use a ternary operator
        // to classify the person into one of the following categories: "Child" (age < 12), "Teenager"
        // (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above).
        // Print the resulting classification.

        int age  = 5;

        String categorie = (age < 12)? "Child" : (age < 18)? "Teenager" : (age >= 65)?
                "Senior" : "Adult";

        System.out.println(categorie);
    }
}
