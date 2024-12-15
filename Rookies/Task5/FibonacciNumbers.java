import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(feb(n));
    }
    public static long feb(long n) {
        if(n==0 || n==1) {
            return n;
        } else {
            return feb(n-1) + feb(n-2);
        }
    }
}