package UndirectedGraph;

import java.util.ArrayList;
import java.util.Collections;

// implementation from the gfg
public class Graph {
    // V -> number of vertices

    public ArrayList<ArrayList<Integer>> createGraph(int V, int [][]edges){
        ArrayList<ArrayList<Integer>> adjMat = new ArrayList<>();
        int vert = V;
        // initialize the matrix with 0
        for (int i = 0; i<V; i++){
                // nCopies gives the List
                // number of elements will be V
                // value of elements 0
                ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V, 0));

                adjMat.add(row);
        }
        // adding edges into the adjecency matrix
        for (int [] arr : edges){
            int u = arr[0];
            int v = arr[1];

            // getting the row index and then setting it's respective value as 1 (where it is applicable)
            adjMat.get(u).set(v,1);
            // same thing just if edge is undirected
            adjMat.get(v).set(u,1);
        }



        return adjMat;
    }
    public void printAdjMat(ArrayList<ArrayList<Integer>> adjMat){
        for (int i = 0; i<adjMat.size(); i++){
            for(int j = 0; j<adjMat.size(); j++){
                System.out.print(adjMat.get(i).get(j));
            }
            System.out.println();
        }
    }
}
