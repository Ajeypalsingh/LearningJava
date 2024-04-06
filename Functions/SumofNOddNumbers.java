package Java.Functions;

import java.util.Scanner;

public class SumofNOddNumbers {

    public static void GetSumOfOddNumbers(int n){
        int counter = 0;
        for (int i=1; i<=n; i++){
            if (i%2!=0){
                counter += i;
            }
        }
        System.out.println("Sum of first " + n + " numbers is " + counter );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        GetSumOfOddNumbers(n);
    }
}
