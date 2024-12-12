package Programs;

import java.util.*;

public class BFS 
{
    public static void main(String[] args) 
    {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list (you can modify this as needed)
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (example graph: 0 -> 1, 0 -> 2, 1 -> 3, 2 -> 4)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        BFS solution = new BFS();
        ArrayList<Integer> bfsResult = solution.bfsOfGraph(V, adj);

        System.out.println("BFS traversal:");
        for (int node : bfsResult) {
            System.out.print(node + " ");
        }
    }    
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] arr = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!arr[curr]) {
                res.add(curr);
                arr[curr] = true;
                for (int i = 0; i < adj.get(curr).size(); i++) {
                    int e = adj.get(curr).get(i);
                    if (!arr[e])
                        q.add(e);
                }
            }
        }
        return res;
    }
}

// Time Complexity: O(V+E), where V is the number of nodes and E is the number of edges.
// Auxiliary Space: O(V)