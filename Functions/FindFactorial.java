package Java.Functions;

import java.util.Scanner;

public class FindFactorial {

    public static void calculateFactorial(int num){

        if (num < 0){
            System.out.println("Invalid number");
            return;
        } 
        
        int n=1;
        for (int i=num; i>=1; i--){
            n = n*i;
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        calculateFactorial(number);
    }
}
