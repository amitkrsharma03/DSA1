package Programs;

import java.util.PriorityQueue;
import java.util.*;
/*Calculates the shortest distances from vertex 0 to all 
  other vertices in the graph
  Used in google along with Heuristic algorithm
*/
public class Graph {
    private final int vertices;
    private final List<List<Edge>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacencyList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }

    public void dijkstra(int startVertex) {
        int[] distances = new int[vertices];
        boolean[] visited = new boolean[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(new Edge(startVertex, startVertex, 0));
        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();
            int currentVertex = currentEdge.getDestination();
            if (visited[currentVertex]) {
                continue;
            }
            visited[currentVertex] = true;
            for (Edge neighborEdge : adjacencyList.get(currentVertex)) {
                int neighborVertex = neighborEdge.getDestination();
                int weight = neighborEdge.getWeight();
                if (!visited[neighborVertex]) {
                    int distance = distances[currentVertex] + weight;
                    if (distance < distances[neighborVertex]) {
                        distances[neighborVertex] = distance;
                        priorityQueue.offer(new Edge(currentVertex, neighborVertex, distance));
                    }
                }
            }
        }
        System.out.println("Vertex\tDistance");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + "\t" + distances[i]);
        }
    }

    private static class Edge implements Comparable<Edge> {
        private final int source;
        private final int destination;
        private final int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        public int getSource() {
            return source;
        }

        public int getDestination() {
            return destination;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 6);
        graph.addEdge(4, 5, 1);
        graph.dijkstra(0);
    }
}
