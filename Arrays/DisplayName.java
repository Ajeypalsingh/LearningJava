package Java.Arrays;

import java.util.Scanner;

public class DisplayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();

        String names[] = new String[size];

        for(int i=0; i<size; i++){
            names[i] = scanner.next();
        }

        for(int i=0; i<size; i++){
            System.out.print(names[i]);
        }
    }
}
