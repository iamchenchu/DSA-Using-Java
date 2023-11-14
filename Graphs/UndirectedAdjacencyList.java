package Graphs;

import java.util.LinkedList;

public class UndirectedAdjacencyList {

    private LinkedList<Integer>[] adj; // array of linkedlist
    private int V; // number of vertices
    private int E; // number of edges

    public UndirectedAdjacencyList(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int start, int dest) {
        adj[start].add(dest);
        adj[dest].add(start);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + "Vertices, " + E + "Edges" + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        UndirectedAdjacencyList g = new UndirectedAdjacencyList(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);

        System.out.println(g);
    }

}

// output
// 4Vertices, 4Edges
// 0: 1 3
// 1: 0 2
// 2: 1 3
// 3: 2 0
