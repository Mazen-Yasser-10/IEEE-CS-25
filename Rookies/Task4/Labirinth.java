

import java.util.*;

public class Labirinth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        char[][] arr = new char[n][k];
        in.nextLine();
        int[][] moves = {{1, 0,'D'},{0,1,'R'},{-1,0,'U'},{0,-1,'L'}};
        for (int i = 0; i < n; i++)
        {
            String s = in.nextLine();
            arr[i] = s.toCharArray();
        }
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][k];
        char[][] directions = new char[n][k];
        StringBuilder sb = new StringBuilder();
        int x = 0;
        int y = 0;
        boolean found = false;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < k ; j++)
            {
                if(arr[i][j] == 'A')
                {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    while(!q.isEmpty())
                    {
                        int[] current = q.poll();
                        for(int[] move : moves)
                        {
                            int dx = current[0] + move[0];
                            int dy = current[1] + move[1];
                            if(dx >= 0 && dx < n && dy >= 0 && dy < k)
                            {
                                if (arr[dx][dy] == 'B') {
                                    System.out.println("YES");
                                    x = dx;
                                    y = dy;
                                    directions[dx][dy] = (char)move[2];
                                    found = true;
                                    q.clear();
                                    break;
                                }
                                else if (arr[dx][dy] == '.' && !visited[dx][dy]) {
                                    directions[dx][dy] = (char)move[2];
                                    q.add(new int[]{dx, dy});
                                    visited[dx][dy] = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(found)
        {
            while(arr[x][y] != 'A')
            {
                sb.append(directions[x][y]);
                if(directions[x][y] == 'D') {x--;}
                else if(directions[x][y] == 'U') {x++;}
                else if(directions[x][y] == 'L') {y++;}
                else if(directions[x][y] == 'R') {y--;}
            }
            System.out.println(sb.length());
            System.out.println(sb.reverse());
        }
        else
        {
            System.out.println("NO");
        }
    }
}
