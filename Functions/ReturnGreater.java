package Java.Functions;

import java.util.Scanner;

public class ReturnGreater {
    public static void returnGreater(int a, int b){
        if(a>b){
            System.out.println(a);
        } else if(a==b){
            System.out.println("Both are equal");
        } else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();
        int inputTwo = scanner.nextInt();

        returnGreater(inputOne, inputTwo);
    }
}
