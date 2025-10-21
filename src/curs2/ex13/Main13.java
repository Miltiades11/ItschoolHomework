package curs2.ex13;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        //13. Write a program to calculate the price after discount.
        // Take the original price and discount percentage as input.
        // Use compound assignment operator to perform the calculation.

        Scanner scanner = new Scanner(System.in);

        double originalPrice = 100;
        int discountPercentege = scanner.nextInt();

        double priceAfterDiscount =originalPrice - (originalPrice * ((double)discountPercentege/100));
        System.out.println("Original price: " + originalPrice);
        System.out.println("Price after discount: " + priceAfterDiscount);
    }
}
