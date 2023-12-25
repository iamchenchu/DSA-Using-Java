package Graphs;

public class UndirectedGraphCreation {
        private int[][] adjMatrix;
        private int V;  // number of vertices in the graph
        private int E; // number of edges in the graph

        public UndirectedGraphCreation(int nodes)
        {
            this.V = nodes;
            this.E = 0;
            this.adjMatrix = new int [nodes][nodes];
        }
    

    public void addEdge(int source, int dest)
    {
        this.adjMatrix[source][dest]=1;
        this.adjMatrix[dest][source]=1;   // because it is an undirected graph
        E++;
    }
    public String toString()              // this method is to give a string representation of the graph 
    {
        StringBuilder sb = new StringBuilder();
        sb.append(V + "vertices," + E + "edges"+"\n");
        for(int v =0; v<V;v++)
        {
            sb.append(v + ": ");
            for(int w: adjMatrix[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    } 


    public static void main(String[] args)
    {
        UndirectedGraphCreation g = new UndirectedGraphCreation(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);

        System.out.println(g);

    }
    
}
