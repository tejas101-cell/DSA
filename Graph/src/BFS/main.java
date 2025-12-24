package BFS;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        int [][] edges = {{1,0},{1,2},{2,0},{2,3},{2,4}};
        // creating graph and getting it's adjacency matrix
        ArrayList<ArrayList<Integer>> mat = graph.createGraph(5, edges);
        graph.printAdjMat(mat);

        // passing adj matrix to the createEdge
        // which will give actual corresponding vertices
        ArrayList<ArrayList<Integer>> edgeMat = graph.createEdge(mat, 5);
        System.out.println("*************************************\nPrinting all the vertices and their corresponding vertices");
        int i = 0;
        for (ArrayList<Integer> arr : edgeMat){
            System.out.print(i+"->");
            for (int arr2 : arr){
                System.out.print(arr2);
            }
            System.out.println();
            i++;
        }
        // passing all those corresponding vertices
        ArrayList<Integer> vertices = graph.bfs(edgeMat);

        // printing all the vertices
        for (int vertex : vertices){
            System.out.print("->"+vertex);
        }
    }
}
