package curs6.ex14_;

public class Main14 {
    public static void main(String[] args) {
        //14. Remove Comments from Code
        //Description: Create a Java program using StringBuilder that removes all single line (//)
        // and multi-line (/* */) comments from a provided piece of code.

        String initialCode = "public class Example {\n" +
                "    public static void main(String[] args) {\n" +
                "        int x = 5; // Inițializăm variabila x cu valoarea 5\n" +
                "\n" +
                "        /* Verificăm dacă x este mai mare decât 0\n" +
                "           și afișăm un mesaj corespunzător */\n" +
                "        if (x > 0) {\n" +
                "            System.out.println(\"x este pozitiv\");\n" +
                "        }\n" +
                "    }\n" +
                "}\n";
        StringBuilder updatedCode = new StringBuilder();
        String delimitator = "";
        for(int i = 0; i < initialCode.length(); i++){
            if(initialCode.substring(i).equals(initialCode.substring(initialCode.indexOf("//")))){
                
            }
        }
    }
}
