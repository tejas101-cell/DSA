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
        int V = mat.size();
        // System.out.println(V);
        boolean[]visited = new boolean[V];

        ArrayList<Integer> res = new ArrayList<>();

        // giving a source
        int src = 0;

        // we are making queue to store all the elements while traversing
        Queue<Integer> q = new LinkedList<>();

        // initializint the boolean array with first source node
        // giving true to it
        visited[src] = true;

        q.add(src);

        // checking if q is empty or not
        // but we have already initialized it
        while (!q.isEmpty()){
            // giving us the top element
            // it removes the element fron the queue
            int curr = q.poll();

            // add it into the res
            res.add(curr);

            for (int x : mat.get(curr)){
                if(!visited[x]){
                    visited[x] = true;
                    q.add(x);
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
