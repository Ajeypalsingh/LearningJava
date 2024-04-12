package Java.Arrays;

import java.util.Scanner;

public class MaxMinNumber {
    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int numbers[] = new int[size];

        for (int i=0; i<size; i++){
            numbers[i]= scanner.nextInt();
        }

        for (int i=0; i<size; i++){  
            if(numbers[i] > min) {
                min = numbers[i];
            }
            if(numbers[i] < max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number -> " + min);
        System.out.println("Minimum number -> " + max);
    }
}
