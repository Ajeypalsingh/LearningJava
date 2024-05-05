package Java.Strings;

import java.util.Scanner;

public class CominedLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String strings[] = new String[size];
        int combinedLength = 0;

        for(int i=0; i<size; i++){
            strings[i] = sc.nextLine();
            combinedLength += strings[i].length();
        }  
        
        System.out.println(combinedLength);
    }
}
