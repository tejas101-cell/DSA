package DirectedGraph;

public class main {
    public static void main(String[] args) {
        Graph graph = new Graph(3);

        int [][] edges = {{0,1},{1,2},{2,0}};
        graph.createGraph(edges);
        graph.printMatrix();
    }
}
