package Java.Strings;
import java.util.Scanner;

import Java.*;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to replace i with e - ");

        String input = sc.next();
        String output = "";

        for(int i=0; i<input.length(); i++){
            if (input.charAt(i) == 'i'){
                output += 'e';
            } else{
                output += input.charAt(i);
            }
        }

        System.out.println("New string - " + output);
    }
}
