package Java;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();


        if (age >= 18){
            System.out.println("USer is Adult");
        } else{
            System.out.println("User is not Adult");
        }
    }
}
