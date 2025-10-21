package curs5.ex13_;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        //13. Pathfinding in a Maze
        //Consider a simple maze represented by a 2D grid. The maze consists of open cells, walls, a start,
        // and an end. You have to find a path from the start to the end, moving only up, down, left,
        // or right. You can't move diagonally. If a path exists, print it; otherwise, inform the user
        // that there's no solution.
        //
        //The maze will be represented by a 2D array where:
        //0 represents an open cell.
        //1 represents a wall.
        //S represents the start.
        //E represents the end.
        //
        //Example:
        //S 1 0 1
        //0 1 0 1
        //0 1 0 1
        //1 0 0 E
        //
        //Problem Tasks:
        //Read the maze layout from a file or hard-code it into your program.
        //Implement a pathfinding algorithm to navigate from the start to the end.
        //If a path is found, print the maze with the path. You can represent the path with a *.
        //If no path exists, print "No solution found."
        Scanner scanner = new Scanner(System.in);
        char[][] maze = {
                {'S', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'0', '1', '0', '1'},
                {'1', '0', '0', 'E'}
        };

        int i = 0;
        int j = 0;
        int prevI = i;
        int prevJ = j;
        char position =  maze[i][j];

        while(position != 'E'){
            System.out.println("What is your next move?");
            i = scanner.nextInt();
            j = scanner.nextInt();

            if(((i == prevI + 1 && j == prevJ + 1) || (i == prevI -1 && j == prevJ - 1) ||
                    (i == prevI - 1 && j == prevJ + 1) || (i == prevI + 1 && j == prevJ - 1))
                     && position != '1'){

            }
        }
    }
}
