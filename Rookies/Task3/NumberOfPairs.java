

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfPairs {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t; i++){
            int n = in.nextInt();
            int min = in.nextInt();
            int max = in.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++){
                arr[j] = in.nextInt();
            }
            Arrays.sort(arr);
            long c = 0;
            int l = 0;
            while(l<n-1)
            {
                int l1 = l+1;
                int r1 = n-1;
                while (l1<=r1)
                {
                    int mid = l1+(r1-l1)/2;
                    if(arr[l]+arr[mid]>=min)
                    {
                        r1 = mid-1;
                    }
                    else
                    {
                        l1 = mid+1;
                    }
                }
                int l2 = l+1;
                int r2 = n-1;
                while (l2<=r2)
                {
                    int mid = l2+(r2-l2)/2;
                    if(arr[l]+arr[mid]<=max)
                    {
                        l2 = mid + 1;
                    }
                    else
                    {
                        r2 = mid - 1;
                    }
                }
                c += r2-l1+1;
                l++;
            }
            System.out.println(c);
        }
    }
}