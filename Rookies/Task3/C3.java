

import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int l = 0;
        int r = n-1;
        int timeA = 0;
        int timeB = 0;
        while(l <= r)
        {
            if(timeA <= timeB)
            {
                timeA += arr[l];
                l++;
            }
            else
            {
                timeB += arr[r];
                r--;
            }
        }
        System.out.println( (l) + " " + (n-l) );
    }
}
