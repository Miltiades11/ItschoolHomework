package curs6.ex12;

public class Main12 {
    public static void main(String[] args) {
        //12. CamelCase to Snake_case Converter
        //Description: Write a program using StringBuilder to convert a given CamelCase string to
        // snake_case. For instance, "thisIsCamelCase" would become "this_is_camel_case".

        String camelCase = "thisIsCamelCase";
        System.out.println(camelCase);
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < camelCase.length(); i++){
            if(camelCase.charAt(i) == camelCase.toUpperCase().charAt(i)){
                stringBuilder.append("_").append(camelCase.toLowerCase().charAt(i));
            } else{
                stringBuilder.append(camelCase.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
