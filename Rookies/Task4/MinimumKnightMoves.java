
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MinimumKnightMoves {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[][] moves = new int[][]{{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        for(int i = 0 ; i < n ; i++)
        {
            String start = in.next();
            String end = in.next();
            Queue<String> queue = new LinkedList<>();
            HashSet<String> visited = new HashSet<>();
            queue.add(start);
            visited.add(start);
            int count = 0;
            while(!queue.isEmpty())
            {
                int size = queue.size();
                for (int j = 0; j < size; j++)
                {
                    String current = queue.poll();
                    if (current.equals(end)) {
                        System.out.println(count);
                        queue.clear();
                        break;
                    }
                    for (int[] move : moves) {
                        String next = (char) (current.charAt(0) + move[0]) + "" + (char) (current.charAt(1) + move[1]);

                        if (next.charAt(0) >= 'a'
                                && next.charAt(0) <= 'h'
                                && next.charAt(1) >= '1'
                                && next.charAt(1) <= '8'
                                && !visited.contains(next)
                        )
                        {
                            queue.add(next);
                            visited.add(next);
                        }
                    }
                }
                count++;
            }
        }
    }
}
