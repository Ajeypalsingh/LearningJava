package Java.Arrays;

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of rows :");
        int rows = sc.nextInt();

        System.out.println("Number of Columns :");
        int cols = sc.nextInt();

        int numbers[][] = new int[rows][cols];

        // Taking input 2D array
        for(int i=0; i<rows; i++) {
            //columns
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
 
        System.out.println();

        int numberToSearch = sc.nextInt();

        // Searching element
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if (numbers[i][j]==numberToSearch){
                    System.out.println("Number found at " + i +"," + j);
                }
            }
        }
    }
}
