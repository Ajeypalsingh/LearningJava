package Java.Strings;

import java.util.Scanner;

public class CreateUsername {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Email to create username - ");

        String input = sc.next();
        int index = 0;

        for (int i=0; i<input.length(); i++){
            if(input.charAt(i) == '@'){
                index = i;
                break;
            }
        }

        String output = input.substring(0, index);

        System.out.println("Username - " + output);
    }
}
