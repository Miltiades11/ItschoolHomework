package curs6.ex6;

public class Main6 {
    public static void main(String[] args) {
        //6. String Replacement
        //Description: Use the StringBuilder class to replace every occurrence of a substring within
        // a given string with another substring. For instance, replace "cat" with "dog" in the string
        // "The cat sat on the mat."

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The cat sat on the mat.");
        System.out.println(stringBuilder);
        stringBuilder.replace(stringBuilder.indexOf("cat"), stringBuilder.indexOf("cat") + ("cat".length()),
                "dog");
        System.out.println(stringBuilder);


    }
}
