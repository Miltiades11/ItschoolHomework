package curs6.ex13;

public class Main13 {
    public static void main(String[] args) {
        //13. Expand Compressed Strings
        //Description: Given a compressed string like "a3b2c4", expand it to "aaabbc", making use of
        // the StringBuilder class.

        String string = "a3b2c4";
        System.out.println(string);
        StringBuilder stringBuilder= new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            char ch = string.charAt(i);
            if(Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
                char previous = string.charAt(i - 1);
                for(int j = 0; j < digit; ++j){
                    stringBuilder.append(previous);
                }
            } else{
                stringBuilder.append(ch);
            }
        }
        System.out.println(stringBuilder);
    }
}
