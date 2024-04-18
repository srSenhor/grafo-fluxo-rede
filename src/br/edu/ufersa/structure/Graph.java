package br.edu.ufersa.structure;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private int [][] adj_matrix;
    private final int NODES;
    
    public Graph(int [][] adj_matrix) {
        this.setAdjacenceMatrix(adj_matrix);
        NODES = adj_matrix.length;
    }

    private boolean bfs(int [][] residual_graph, int source, int sink, int [] path) {

        boolean [] checked = new boolean[NODES];
        for (int i = 0; i < NODES; i++)
            checked[i] = false;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        checked[source] = true;
        path[source] = -1;

        while (queue.size() != 0) {
            int u = queue.poll();

            for (int v = 0; v < NODES; v++) {
                if (checked[v] == false && residual_graph[u][v] > 0) {
                    if (v == sink) {
                        path[v] = u;
                        return true;
                    }
                    queue.add(v);
                    path[v] = u;
                    checked[v] = true;
                }
            }
        }

        return false;

    }
    // Implementação do Geeksforgeeks
    public int fordFulkerson(int source, int sink) {

        int u, v;

        int [][] residual_graph = new int[NODES][NODES];

        for (u = 0; u < NODES; u++) 
            for (v = 0; v < NODES; v++) 
                residual_graph[u][v] = adj_matrix[u][v];

        int [] path = new int[NODES];
        int max_flow = 0;

        while (bfs(residual_graph, source, sink, path)) {
            int path_flow = Integer.MAX_VALUE;

            for (v = sink; v != source; v = path[v]) {
                u = path[v];
                path_flow = Math.min(path_flow, residual_graph[u][v]);
            }

            for (v = sink; v != source; v = path[v]) {
                u = path[v];
                residual_graph[u][v] -= path_flow;
                residual_graph[v][u] += path_flow;
            }

            max_flow += path_flow;
        }
        
        return max_flow;
        
    }

    public void print() {

        System.out.println("Nodes: " + NODES);
        System.out.println("Printing adjacence matrix...");
        
        for (int i = 0; i < adj_matrix.length; i++) {
            for (int j = 0; j < adj_matrix[i].length; j++) {
                System.out.print(adj_matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();
    }

    public void setAdjacenceMatrix(int[][] adj_matrix) {
        if (adj_matrix != null) {
            this.adj_matrix = adj_matrix;
        } else {
            throw new RuntimeException("Cannot continue because adjacence matrix is null");
        }
    }

}