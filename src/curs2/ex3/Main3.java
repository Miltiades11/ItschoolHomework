package curs2.ex3;

public class Main3 {
    //3. Write a program to check if a number is positive or negative using logical complement operator.

    public static void main(String[] args) {
        int a = -10;
        if(!(a < 0)){
            System.out.println("Numarul este mai mare decat 0");
        } else{
            System.out.println("Numarul este mai mic decat 0");
        }
    }
}
