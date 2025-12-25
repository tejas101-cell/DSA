package DFS;

import java.util.ArrayList;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        int [][] edges = {{0,1},{0,2},{1,2},{3,2},{1,2}};
        ArrayList<ArrayList<Integer>> mat = graph.createGraph(edges, 4);
        graph.printAdjMatrix();
        ArrayList<ArrayList<Integer>> edgeMat = graph.creatEdges(mat, 4);

        // printing the vertices with their corresponding vertices
        int i = 0;
        for (ArrayList<Integer> edge : edgeMat){
            System.out.print(i+"->");
            for (int element : edge){
                System.out.print(element);
            }
            System.out.println();
            i++;
        }

        ArrayList<Integer> vertices = graph.DFS(edgeMat);
        System.out.println(vertices);
    }

}
