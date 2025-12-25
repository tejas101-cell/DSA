package BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

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
    // implementing the bfs algorithm
    public ArrayList<Integer> bfs (ArrayList<ArrayList<Integer>> mat){
        // creating the list to store vertices while traversing
        ArrayList<Integer> res = new ArrayList<>();

        // by default all are false
        boolean [] visited  = new boolean[mat.size()];

        // queue which is used to traverse
        Queue <Integer> queue = new LinkedList<>();

        // initialize the que with source
        int src = 0;
        queue.add(src);
        visited[src] = true;

        // same above process you are gonna do it in the loop

        while (!queue.isEmpty()){
            int curr = queue.poll();
            res.add(curr);

            // going into the
            for (int vertex : mat.get(curr)){
                if (!visited[vertex]){
                    visited[vertex] = true;
                    queue.add(vertex);
                }
            }
        }
        return res;
    }
    public void addEdge(ArrayList<ArrayList<Integer>> mat, int u, int v){
        mat.get(u).add(v);
        mat.get(v).add(u);
    }
    public ArrayList<ArrayList<Integer>> createEdge(ArrayList<ArrayList<Integer>> mat, int V){
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < V; i++){
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i<V; i++){
            for (int j = 0; j<V; j++ ){
                if (mat.get(i).get(j) == 1){
                    edges.get(i).add(j);
                }
            }
        }
        return edges;
    }
}
