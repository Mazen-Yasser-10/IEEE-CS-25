import java.util.Scanner;

public class WeridAlgorithm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        rec(n);
    }
    public static void rec(long n) {
        System.out.print(n +" ");
        if( n == 1 )
        {
            return;
        }
        if( n%2 == 0 )
        {
            rec(n/2);
        }
        else
        {
            rec(3*n+1);
        }
    }
}