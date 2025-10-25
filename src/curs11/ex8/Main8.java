package curs11.ex8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        //8. In an array of strings representing movie titles, implement a linear search method to
        // find whether a given movie title exists. If it does, print out its position in the array.

        String[] movies = {"Star Wars", "Scarface", "Creed", "Titanic", "Godfather"};
        System.out.println("Please enter the name of the movie you are searching for: ");
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        boolean onStock = false;

        for(int i = 0; i < movies.length; i++){
            String movie = movies[i];
            if(movie.equalsIgnoreCase(search)){
                System.out.println(search + " is on shelf number " + i + ".");
                onStock = true;
                break;
            }
        }
        if(!onStock){
            System.out.println("We don't have that movie here.");
        }
    }
}
