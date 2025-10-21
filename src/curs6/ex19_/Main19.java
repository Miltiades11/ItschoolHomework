package curs6.ex19_;

public class Main19 {
    public static void main(String[] args) {
        //19. Encode Strings with Run-Length Encoding (RLE)
        //Description: Using StringBuilder, write a program that implements the Run-Length Encoding
        // algorithm. For instance, the string "AAABBBCCDAA" would be encoded as "3A3B2C1D2A".

        String string = "AAABBBCCDAA";
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            int counter = 1;
            char next = string.charAt(i + 1);
            if(next == ch){
                counter++;
            } else{
                stringBuilder.append(counter);
                stringBuilder.append(string.charAt(i));
                counter = 1;
            }
        }
        System.out.println(stringBuilder);
    }
}
