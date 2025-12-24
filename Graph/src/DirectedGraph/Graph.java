package DirectedGraph;

import java.util.ArrayList;
import java.util.Collections;

public class Graph {
    ArrayList<ArrayList<Integer>> adjMat;
    int vertices;

    public Graph(int vertices) {
        this.adjMat = new ArrayList<>();
        this.vertices = vertices;
    }

    public ArrayList<ArrayList<Integer>> createGraph(int [][] edges){
        // initializing all the values to the zero
        for (int i = 0; i<vertices; i++){
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(vertices, 0));
            adjMat.add(row);
        }
        for (int[] edge : edges){
            // u --------> v
            int u = edge[0];
            int v = edge[1];

            adjMat.get(u).set(v, 1);
        }
        return adjMat;
    }
    public void printMatrix(){
        for (int i = 0; i<vertices; i++){
            for (int j = 0; j<vertices; j++){
                System.out.print(adjMat.get(i).get(j));
            }
            System.out.println();
        }
    }
}
