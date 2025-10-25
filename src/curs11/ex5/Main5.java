package curs11.ex5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        //5. Create an ArrayList that stores city names. Add at least five city names initially.
        // Then, prompt the user to add a city name. If the city name is already in the list, display
        // a message saying it's a duplicate; otherwise, add it to the list.

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Madrid");
        cities.add("Bucharest");
        cities.add("Iasi");
        cities.add("Shanghai");
        cities.add("Tokio");

        Scanner scanner = new Scanner(System.in);
        String userCity = scanner.nextLine();

        if(cities.indexOf(userCity) == -1){
            cities.add(userCity);
            System.out.println(cities);
        } else{
            System.out.println("Your city is a duplicate");
        }
    }
}
