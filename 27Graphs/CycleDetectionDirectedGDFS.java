package Graphs;

import java.util.ArrayList;

public class CycleDetectionDirectedGDFS {

    // Class to represent an edge in the graph
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    // Method to create the directed graph
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
    }

    // Method to check if the directed graph contains a cycle
    public static boolean isCycle(ArrayList<Edge>[] graph) {
        // Array to keep track of visited nodes
        boolean vis[] = new boolean[graph.length];
        // Array to keep track of nodes in the current stack of traversal
        boolean stack[] = new boolean[graph.length];

        // Loop through all nodes in the graph
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                // If a cycle is detected in any component, return true
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        // No cycle found
        return false;
    }

    // Recursive utility method to perform DFS and check for cycles
    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
        // Mark the current node as visited and push it to the stack
        vis[curr] = true;
        stack[curr] = true;

        // Loop through all adjacent vertices
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // If the destination vertex is already in the stack, a cycle is found
            if (stack[e.dest]) {
                // cycle
                return true;
            }

            // If the destination vertex is not visited, recursively check for cycle
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        // Pop the current node from the stack after traversal
        stack[curr] = false;
        return false;
    }

    // Main method to test the cycle detection algorithm
    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }

}
