package Java.Arrays;

import java.util.Scanner;

public class TwoDArray {
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

        // showing output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
