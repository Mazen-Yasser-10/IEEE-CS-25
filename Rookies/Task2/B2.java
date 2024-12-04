import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] nums = new int[n];
        long c = 0;
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = in.nextInt();
        }
        int j = 0;
        for(int i = 0 ; i < n ; i++)
        {
            while( j <= n-1 && (nums[j] - nums[i]) <= d )
            {
                j++;
            }
            if(j-i-1 >= 2)
            {
                c += ((long) (j - i - 1)) * (j - i - 2) / 2;
            }
        }
        System.out.println(c);
    }
}
