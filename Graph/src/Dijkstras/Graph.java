package Dijkstras;


import java.util.ArrayList;
import java.util.PriorityQueue;

public class Graph {
    // input : list of arrays and source
    public ArrayList<Integer> Dijkstra(ArrayList<ArrayList<int[]>> adj, int src){
        int V = adj.size();

        // using lambda to store check the distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
    }
}
