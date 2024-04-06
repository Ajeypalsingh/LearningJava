package Java.Functions;

public class FibonacciSeries {

    public static void fSeries(){
        int firstTerm = 0;
        int secondTerm = 1;

        for (int i=0; i<=10 ; i++){
            System.err.print(firstTerm+", ");

            int next = firstTerm + secondTerm ;

            secondTerm = firstTerm;
            firstTerm = next;

        }
    }

    public static void main(String[] args) {
        fSeries();
    }
}
