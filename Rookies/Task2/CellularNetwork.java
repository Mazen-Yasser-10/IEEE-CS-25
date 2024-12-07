import java.util.Scanner;

public class CellularNetwork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] nums = new int[n];
        int[] towers = new int[d];
        int max = 0;

        for(int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        for(int i = 0; i < d; i++) {
            towers[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int l = 0;
            int r = d - 1;
            while (l < r) {
                int mid = l + (r-l)/ 2;
                if (nums[i] <= towers[mid]) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            int toUpper = Math.abs(nums[i] - towers[l]);
            int toLower = toUpper;
            if(l != 0)
            {
                toLower = Math.abs(nums[i] - towers[l-1]);
            }
            max = Math.max(max, Math.min(toUpper, toLower));
        }

        System.out.println(max);
    }
}
