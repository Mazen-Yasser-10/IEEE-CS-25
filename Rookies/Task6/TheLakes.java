import java.util.Scanner;
import java.util.Stack;

public class TheLakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
            int[][] a = new int[n][m];
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    a[j][k] = in.nextInt();
                }
            }
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < m; k++) {
                    if(a[j][k] !=0 ) {
                        int x = dfs(a, j, k );
                        max = Math.max(max, x);
                    }
                }
            }
            System.out.println(max);
        }
    }
    static int dfs(int[][] a, int i,int j) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{i, j});
        int sum = 0;

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int x = current[0];
            int y = current[1];

            if (x < 0 || x >= a.length || y < 0 || y >= a[0].length || a[x][y] == 0) {
                continue;
            }
            sum += a[x][y];
            a[x][y] = 0;


            stack.push(new int[]{x + 1, y});
            stack.push(new int[]{x - 1, y});
            stack.push(new int[]{x, y + 1});
            stack.push(new int[]{x, y - 1});
        }

        return sum;
    }
}