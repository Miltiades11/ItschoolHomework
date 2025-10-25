package curs11.ex7;

import java.util.ArrayList;

public class Main7 {
    public static void main(String[] args) {
        //7. Create an ArrayList containing names of fruits. Implement a custom sorting mechanism
        // to arrange them in descending order based on their length. If two fruits have the same length,
        // sort them in alphabetical order.

        ArrayList<String> fruitNames = new ArrayList<>();
        fruitNames.add("Apple");
        fruitNames.add("Pear");
        fruitNames.add("Pineapple");
        fruitNames.add("Mango");
        fruitNames.add("Banana");

        for(int i = 0; i < fruitNames.size() - 1; i++){
            for(int j = i + 1; j < fruitNames.size(); j++){
                String f1 = fruitNames.get(i);
                String f2 = fruitNames.get(j);

                if(f1.length() < f2.length()){
                    fruitNames.set(i, f2);
                    fruitNames.set(j, f1);
                } else if(f1.length() == f2.length() && f1.compareToIgnoreCase(f2) > 0){
                    fruitNames.set(i, f2);
                    fruitNames.set(j, f1);
                }
            }
        }
        System.out.println(fruitNames);
    }
}
