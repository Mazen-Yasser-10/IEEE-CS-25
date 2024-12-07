

import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1 ; i <= n ; i++)
        {
            if(isLucky(i))
            {
                if(n%i == 0)
                {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    private static boolean isLucky(int i) {
        while( i%10 == 4 || i%10 == 7)
        {
            i /= 10;
        }
        if(i == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
