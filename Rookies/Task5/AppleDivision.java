
import java.util.*;

public class AppleDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] apples = new long[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            apples[i] = in.nextLong();
            total += apples[i];
        }
        System.out.println(solve(0, 0, total, apples));
    }
    public static long solve(int i, long sum, long total, long[] apples) {
        if (i == apples.length) {
            return Math.abs(total - 2 * sum);
        }
        return Math.min(solve(i + 1, sum + apples[i], total, apples), solve(i + 1, sum, total, apples));
    }
}