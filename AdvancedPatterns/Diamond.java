package Java.AdvancedPatterns;

public class Diamond {
    public static void main(String[] args) {
        int n=4;
        int counter=0;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i+counter; j++){
                System.out.print("*");
            }
            counter++;
            System.out.println();
        }

        counter--;

        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i+counter; j++){
                System.out.print("*");
            }
            counter--;
            System.out.println();
        }
    }
}
