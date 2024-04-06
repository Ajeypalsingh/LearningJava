package Java.Functions;

import java.util.Scanner;

public class FindXRaiseToPowerN {
    public static void calculateExponents(int x, int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result*x;
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int n = scanner.nextInt();

        calculateExponents(x, n);
    }
}
