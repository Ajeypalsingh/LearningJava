package Java.Functions;

import java.util.Scanner;

public class GetAverage {

    public static void calculateAverage(int one, int two, int three){
        int average = (one + two + three)/3;

        System.out.println(average);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();
        int inputThree = scanner.nextInt();

        calculateAverage(inputOne, inputTwo, inputThree);
        
    }
}
