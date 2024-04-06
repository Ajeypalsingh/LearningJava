package Java.Functions;

import java.util.Scanner;

public class NumbersCounter {

    public static int numberCounter(int n){

        if (n > 0){
            return -1;
        } else if(n == 0){
            return 0;
        } else{
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Press 1111 to stop entring number");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        int negetives = 0; 
        int zeroes = 0; 
        int positives = 0; 

        while(input != 1111){
            
            if(numberCounter(input) == -1){
                negetives++;
                input = scanner.nextInt();
            };
            if(numberCounter(input) == 0){
                zeroes++;
                input = scanner.nextInt();
            };
            if(numberCounter(input) == 1){
                positives++;
                input = scanner.nextInt();
            };
        }

        System.out.println("Positives -> " + positives );
        System.out.println("Negatives -> " + negetives );
        System.out.println("Zeroes -> " + zeroes );
    }
    
}
