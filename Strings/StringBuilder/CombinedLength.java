package Java.Strings.StringBuilder;

import java.util.Scanner;

public class CombinedLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<size; i++){
            String input=sc.next();
            sb.append(input);
        }

        int totalLength = sb.length();
        System.out.println("Total Length -> " + totalLength);

    } 
}