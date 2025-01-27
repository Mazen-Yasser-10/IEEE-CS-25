package IEEECS25.Rookies.Task4;

import java.util.*;







/*
not completed yet 24/28 correct 🥲
        WRONG ANSWER
*/
public class Monsters {
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
        Queue<int[]> ends = new LinkedList<>();
        boolean found = false;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < k ; j++)
            {
                if(arr[i][j] == 'A')
                {
                    if(i == n-1 || j == k-1 || i == 0 || j == 0)
                    {
                        System.out.println("YES");
                        System.out.println(0);
                        System.out.println();
                        return;
                    }
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty())
        {
            int[] current = q.poll();
            for(int[] move : moves)
            {
                int dx = current[0] + move[0];
                int dy = current[1] + move[1];
                if(dx >= 0 && dx < n && dy >= 0 && dy < k && arr[dx][dy] == '.' && !visited[dx][dy])
                {
                    directions[dx][dy] = (char)move[2];
                    q.add(new int[]{dx, dy});
                    visited[dx][dy] = true;
                    if (dx == n-1 || dy == k-1 || dx == 0 || dy == 0) {
                        ends.add(new int[]{dx, dy});
                        directions[dx][dy] = (char)move[2];
                    }
                }
            }
        }
        top:
        while(!ends.isEmpty()) {
            int[] end = ends.poll();
            int x = end[0];
            int y = end[1];
            q.add(new int[]{x, y});
            visited = new boolean[n][k];
            visited[x][y] = true;
            while (!q.isEmpty()) {
                int[] current = q.poll();
                for (int[] move : moves) {
                    int dx = current[0] + move[0];
                    int dy = current[1] + move[1];
                    if (dx >= 0 && dx < n && dy >= 0 && dy < k && !visited[dx][dy]) {
                        if (arr[dx][dy] == 'A') {
                            System.out.println("YES");
                            while (arr[x][y] != 'A') {
                                sb.append(directions[x][y]);
                                if (directions[x][y] == 'D') {
                                    x--;
                                } else if (directions[x][y] == 'U') {
                                    x++;
                                } else if (directions[x][y] == 'L') {
                                    y++;
                                } else {
                                    y--;
                                }
                            }
                            System.out.println(sb.length());
                            System.out.println(sb.reverse());
                            return;
                        } else if (arr[dx][dy] == 'M') {
                            q.clear();
                            break top;
                        } else if (arr[dx][dy] == '.') {
                            q.add(new int[]{dx, dy});
                            visited[dx][dy] = true;
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}