package Java.Functions;

import java.util.Scanner;

public class RightToVote {
    public static void canVoteOrNot(int age){
        if(age >= 18){
            System.out.println("Eligible for vote");
        } else{
            System.out.println("Not Eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();

        canVoteOrNot(inputOne);
    }
}
