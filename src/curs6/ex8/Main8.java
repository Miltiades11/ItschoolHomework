package curs6.ex8;

public class Main8 {
    public static void main(String[] args) {
        //8. Inserting at Index
        //Description: Write a Java program that inserts a given string into another string at a
        // specified index using the StringBuilder class.

        String string1 = "Mirel";
        String string2 = "Vali";

        StringBuilder sb = new StringBuilder();
        sb.append(string1);
        sb.insert(1,string2);
        System.out.println(sb);
    }
}
