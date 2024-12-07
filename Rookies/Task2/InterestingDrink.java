import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        int q = in.nextInt();
        for(int i = 0 ; i < q ; i++)
        {
            int x = in.nextInt();
            int l = 0;
            int r = nums.length-1;
            while (l <= r) {
                int mid = (l+r)/ 2;
                if (nums[mid] <= x) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(l);
        }
    }
}