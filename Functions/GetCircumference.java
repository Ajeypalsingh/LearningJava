package Java.Functions;

import java.util.Scanner;

public class GetCircumference {
    public static void getCircumference(int radius){
        double circumference = 2 * (22.0 / 7) * radius;

        System.out.println(circumference);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();

        getCircumference(inputOne);
    }
}
