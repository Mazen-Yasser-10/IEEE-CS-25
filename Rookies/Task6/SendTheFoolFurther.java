import java.util.*;

public class SendTheFoolFurther {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int d = in.nextInt();

            graph.get(u).add(new int[]{v, d});
            graph.get(v).add(new int[]{u, d});
        }

        boolean[] visited = new boolean[n];

        int maxCost = dfs(0, graph, visited, 0);

        System.out.println(maxCost);
    }

    public static int dfs(int node, List<List<int[]>> graph, boolean[] visited, int cost) {
        int max = cost;
        visited[node] = true;

        for (int[] child : graph.get(node)) {
            int nextNode = child[0];
            cost += child[1];
            if (!visited[nextNode]) {
                max = Math.max(max, dfs(nextNode, graph, visited, cost));
            }
            cost -= child[1];
        }
        return max;
    }
}
