package Java.Functions;

public class GreatestCommonDivisor {
    public static void commonDivisor(int a, int b){
        if (a>b){
            int divisor = 1;
            for (int i=1; i<=b; i++){
                if( a%i==0 && b%i==0){
                    divisor = i;
                }
            }
            System.out.println(divisor);
        } else{
            int divisor = 1;
            for (int i=1; i<=a; i++){
                if( a%i==0 && b%i==0){
                    divisor = i;
                }
            }
            System.out.println(divisor);
        }
    }

    public static void main(String[] args) {
        int a = 200;
        int b = 300;

        commonDivisor(a, b);
    }
}
