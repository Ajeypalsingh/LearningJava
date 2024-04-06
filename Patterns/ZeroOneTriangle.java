package Java.Patterns;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int n = 5;

        /*
         int odd = 1;
        int even = 0;
        
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                 if (i%2!=0){
                    System.out.print(odd);
                    if (odd == 1){
                        odd = 0;
                    } else{
                        odd = 1;
                    }
                 } else{
                    System.out.print(even);
                    if (even == 0){
                        even = 1;
                    } else{
                        even = 0;
                    }
                 }
            }
            odd = 1;
            even = 0;
            System.out.println();
        }
        */
        for (int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                if((i+j) % 2 == 0){
                    System.out.print("1"+" ");
                }else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
}
