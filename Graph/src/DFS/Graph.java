package DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Graph {
    ArrayList<ArrayList<Integer>> mat;
    public ArrayList<ArrayList<Integer>> createGraph(int [][] edges, int V){
        // creating new list
        mat= new ArrayList<>();
        // creating the empty matrix initializing it with 0
        for (int i = 0; i<V; i++){
            mat.add(new ArrayList<>(Collections.nCopies(V, 0)));
        }
        // creating the adj matrix
        for (int[] val : edges){
            int u = val[0];
            int v = val[1];

            mat.get(u).set(v, 1);
            mat.get(v).set(u, 1);
        }
        return mat;
    }
    public void printAdjMatrix(){
        for (ArrayList<Integer> row : mat){
            for (int element : row){
                System.out.print(element);
            }
            System.out.println();
        }
    }
    public ArrayList<ArrayList<Integer>> creatEdges(ArrayList<ArrayList<Integer>> mat, int V){
        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i = 0; i<V; i++){
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i<V; i++){
            for (int j = 0; j<V; j++){
                if(mat.get(i).get(j) == 1) {
                    edges.get(i).add(j);
                }
            }
        }
        return edges;
    }
    public ArrayList<Integer> DFS(ArrayList<ArrayList<Integer>> mat){
        ArrayList<Integer> res = new ArrayList<>();
        boolean [] visited = new boolean[mat.size()];
        Stack<Integer> stack = new Stack<>();

        int src = 0;
        visited[src] = true;
        stack.add(src);

        while (!stack.isEmpty()){
            int curr = stack.pop();
            res.add(curr);

            for (int vertex : mat.get(curr)){
                if (!visited[vertex]){
                    visited[vertex] = true;
                    stack.add(vertex);
                }
            }
        }
    return res;
    }

}
