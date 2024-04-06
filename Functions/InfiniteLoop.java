package Java.Functions;

public class InfiniteLoop {
    public static void infiniteLoopUsingDoWhile(){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        } while (true);
    }

    public static void main(String[] args) {
        infiniteLoopUsingDoWhile();
    }
}
