package curs6.ex3;

public class Main3 {
    public static void main(String[] args) {
        //3. Concatenate Multiple Strings
        //Description: Given a list of strings, use StringBuilder to concatenate them into a single
        // string efficiently.

        String one = "Mirel";
        String two = "Ana";
        String three = "Vali";

        StringBuilder myStringBuilder = new StringBuilder();
        myStringBuilder.append(one);
        myStringBuilder.append(two);
        myStringBuilder.append(three);

        System.out.println(myStringBuilder);
    }
}
