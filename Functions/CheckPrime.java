package Java.Functions;

public class CheckPrime {

    public static void primeOrNot(int num){
        if (num <= 1){
            System.out.println("Invalid number");
        }
        if(num <= 3){
            System.out.println("Prime number");
        }

        for (int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                System.out.println("Not prime number");
                return;
            } else{
                System.out.println("Prime number");
                return;
            }
        }
    }
    public static void main(String[] args) {
        int number = 6;

        primeOrNot(number);
    }
}
