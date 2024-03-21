package learn_graph;

import java.util.LinkedList;

public class Learn_adjacencyListRepresentation {

    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public Learn_adjacencyListRepresentation(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int i = 0; i < nodes; i++) {
            this.adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }

    public static void main(String[] args) {
        Learn_adjacencyListRepresentation graph = new Learn_adjacencyListRepresentation(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);

    }
}
