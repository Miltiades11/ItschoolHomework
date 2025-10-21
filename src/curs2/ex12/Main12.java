package curs2.ex12;

public class Main12 {
    public static void main(String[] args) {
        //12. Create a program that takes an integer as input and then increments and decrements it by 1,
        // displaying the output at each stage.

        int num = 7;

        for(int i = 0; i < 1; i++){
            System.out.println(num);
            num++;
            System.out.println(num);
            num--;
            System.out.println(num);
        }
    }
}
