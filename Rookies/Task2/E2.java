
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int l = 0;
        int r = n;
        int min = n;
        while(l <= r)
        {
            int mid = l + (r - l)/2;
            int i = 0;
            int sum = 0;
            while((int)(mid/Math.pow(k,i)) != 0)
            {
                sum += (int) (mid/Math.pow(k,i));
                i++;

            }
            if(sum < n)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
                min = Math.min(min, mid);
            }
        }
        System.out.println(min);
    }
}
