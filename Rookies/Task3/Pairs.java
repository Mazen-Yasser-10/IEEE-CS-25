package IEEECS25.Rookies.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int l = 0;
        int r = 1;
        int max = 0;
        while(r<n)
        {
            if(arr[r]-arr[l] == k )
            {
                max++;
                r++;
                l++;
            }
            else if(arr[r]-arr[l] > k)
            {
                l++;
            }
            else
            {
                r++;
            }
        }
        System.out.println(max);
    }
}
