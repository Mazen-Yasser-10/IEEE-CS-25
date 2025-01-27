package IEEECS25.Rookies.Task1;

import java.util.Scanner;

public class LaunchOfCollider {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++ )
        {
            nums[i] = in.nextInt();
        }
        int min = -1;
        for(int i = 0 ; i < n-1 ; i++ )
        {
            if(s.charAt(i) == 'R' && s.charAt(i+1) == 'L')
            {
                int diff = (nums[i+1] - nums[i])/2;
                if(diff < min || min == -1)
                {
                    min = diff;
                }
            }
        }
        System.out.println(min);
    }
}
