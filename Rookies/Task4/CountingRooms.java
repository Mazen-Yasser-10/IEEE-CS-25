

import java.util.*;

public class CountingRooms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        char[][] arr = new char[n][k];
        in.nextLine();
        int[][] moves = {{1, 0},{0,1},{-1,0},{0,-1}};
        for (int i = 0; i < n; i++)
        {
            String s = in.nextLine();
            arr[i] = s.toCharArray();
        }
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][k];
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < k ; j++)
            {
                if(arr[i][j] == '.' && !visited[i][j])
                {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    while(!q.isEmpty())
                    {
                        int[] current = q.poll();
                        int x = current[0];
                        int y = current[1];
                        for(int[] move : moves)
                        {
                            int dx = x + move[0];
                            int dy = y + move[1];
                            if(dx >= 0
                                    && dx < n
                                    && dy >= 0
                                    && dy < k
                                    && arr[dx][dy] == '.'
                                    && !visited[dx][dy])
                            {
                                q.add(new int[]{dx, dy});
                                visited[dx][dy] = true;
                            }
                        }
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
