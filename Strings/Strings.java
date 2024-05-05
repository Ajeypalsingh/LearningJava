package Java.Strings;

import java.util.Scanner;

public class Strings {
    // string is non primitive data type - length can be define as needed 
    // It can be used to store word, sentences or any set of character

    // String Declaration - String str = "Ajeypal";  

    
    public static void main(String[] args) {
        // Having string as an iput from user

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // System.out.println("Your name is " + name);

        // Concatenation

        String firstName = "Tony";
        String lastName = "Stark";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // Getting length of string using lenth() function
        System.out.println(fullName.length());

        // Printing character using index - charAt()
        System.out.println(fullName.charAt(0));

        // comparing string using compateTo() function
        if(firstName.compareTo(fullName) == 0){
            System.out.println("Same");
        }else{
            System.out.println("not same");
        }

        // Getting the part of string using substring

        String part = fullName.substring(0, 9);
        System.out.println(part);
    }
}
