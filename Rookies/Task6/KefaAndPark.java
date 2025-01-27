import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KefaAndPark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            c[i] = in.nextInt();
        }
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            graph.get(u-1).add(v);
            graph.get(v-1).add(u);
        }
        boolean[] visited = new boolean[n];
        System.out.println(dfs(0, graph, visited, c, m,0));
    }
    public static int dfs(int node, List<List<Integer>> graph, boolean[] visited,int[] c,int m,int count) {
        int i = 0;
        visited[node] = true;
        if(c[node] == 1) {
            count++;
        }
        else {
            count = 0;
        }
        if(count > m) {
            return 0;
        }

        else if(graph.get(node).size() == 1 && node != 0) {
            return 1;
        }
        for (int child : graph.get(node)) {
            if (!visited[child-1]) {
                i += dfs(child-1, graph, visited, c, m, count);
            }
        }
        return i;
    }
}