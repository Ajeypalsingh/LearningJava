package Java.Arrays;

public class OrderCheck {
    public static void main(String[] args) {
        int numbers[] = {5,8,9};
        boolean isAscending = true;

        for (int i=0; i<numbers.length-1; i++){
            if (numbers[i] > numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
