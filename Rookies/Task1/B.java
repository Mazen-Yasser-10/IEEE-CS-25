

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int unTreatedCrimes = 0;
        int sum = 0;
        for(int i = 0 ; i < n ; i++ )
        {
            sum += in.nextInt();
            unTreatedCrimes = Math.min(sum,unTreatedCrimes);
        }
        System.out.println(-unTreatedCrimes);
    }
}
