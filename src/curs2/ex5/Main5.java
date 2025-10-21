package curs2.ex5;

public class Main5 {
    public static void main(String[] args) {
    //5. Create a Java program that demonstrates the use of each compound assignment operator
    // with integers.

    int a = 10;
    int b = 3;

        System.out.println("Initial values: a = " + a + ", b = " + b);

    a += b;
        System.out.println("After a += b: a = " + a);

    a -= b;
        System.out.println("After a -= b: a = " + a);

    a *= b;  // a = a * b
        System.out.println("After a *= b: a = " + a);

    a /= b;
        System.out.println("After a /= b: a = " + a);

    a %= b;
        System.out.println("After a %= b: a = " + a);
    }
}
