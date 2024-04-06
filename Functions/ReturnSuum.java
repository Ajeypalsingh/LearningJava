package Java.Functions;

import java.util.Scanner;

public class ReturnSuum {

   public static int sumOfTwoNumbers(int one, int two){
    int sum = one + two;
    return sum;
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        System.out.println(sumOfTwoNumbers(firstNumber, secondNumber));
    }
}
