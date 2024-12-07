

import java.util.Arrays;
import java.util.Scanner;

public class BalancedTeam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int l = 0;
        int r = 1;
        int max = 1;
        while(r<n)
        {
            if(arr[r]-arr[l] <= 5 || l == r)
            {
                max = Math.max(max, r-l+1);
                r++;
            }
            else if(arr[r]-arr[l] > 5)
            {
                l++;
            }
        }
        System.out.println(max);
    }
}
