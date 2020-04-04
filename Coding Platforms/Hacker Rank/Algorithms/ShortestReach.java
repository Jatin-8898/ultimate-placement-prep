import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShortestReach {
    
    public static class Graph {
    
        private final int V;
        private LinkedList<Integer>[] adj;

        public Graph(int size) {
            this.V = size;

            adj = (LinkedList<Integer>[]) new LinkedList[size];
            for (int i = 0; i < V; ++i) {
                adj[i] = new LinkedList<Integer>();
            }
        }

        public void addEdge(int first, int second) {
            adj[first].add(second);
            adj[second].add(first);
        }

        public int[] shortestReach(int s) {     // 0 indexed
            // bfs starting from startID
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(s);
            
            int[] distances = new int[V];
            Arrays.fill(distances, -1);
            distances[s] = 0;

            int v = -1;
            while (!q.isEmpty()) {
                v = q.poll();

                LinkedList<Integer> neighbors = adj[v];
                for (Integer nei : neighbors) {
                    if (distances[nei] == -1) {
                        distances[nei] = distances[v] + 6;
                        q.add(nei);
                    }
                }
            }

            return distances;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int queries = scanner.nextInt();

        for (int t = 0; t < queries; t++) {

            // Create a graph of size n where each edge weight is 6:
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();

            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;

                // add each edge to the graph
                graph.addEdge(u, v);
            }

            // Find shortest reach from node s
            int startId = scanner.nextInt() - 1;
            int[] distances = graph.shortestReach(startId);

            for (int i = 0; i < distances.length; i++) {
                if (i != startId) {
                    System.out.print(distances[i]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
