package UndirectedGraph;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int v = 3;
        int [][] edges = {{0,1},{0,2}};

        Graph graph = new Graph();
        ArrayList<ArrayList<Integer>> adjMat = graph.createGraph(v, edges);
        graph.printAdjMat(adjMat);
    }
}