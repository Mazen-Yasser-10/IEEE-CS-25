
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = in.nextInt();
        }
        int max = 0;
        int l = 0;
        int r = 0;
        int sum = 0;
        while(r<n)
        {
            if((sum+nums[r]) <= t)
            {
                sum += nums[r];
                max = Math.max(max, r-l+1);
                r++;
            }
            else
            {
                sum -= nums[l];
                l++;
            }
        }
        System.out.println(max);
    }
}
