package br.edu.ufersa.main;

import br.edu.ufersa.structure.Graph;

public class Main {
    public static void main(String[] args) {

        int [][] adj_matrix0 = {
            {0, 16, 13, 0, 0, 0},
            {0, 0, 10, 12, 0, 0},
            {0, 4, 0, 0, 14, 0},
            {0, 0, 9, 0, 0, 20},
            {0, 0, 0, 7, 0, 4},
            {0, 0, 0, 0, 0, 0}
        };

        int [][] adj_matrix1 = {
            {0, 3, 2, 0},
            {0, 0, 5, 2},
            {0, 0, 0, 3},
            {0, 0, 0, 0}
        };

        int [][] adj_matrix2 = {
            {0, 10, 0, 10, 0, 0},
            {0, 0, 4, 2, 8, 0},
            {0, 0, 0, 0, 0, 10},
            {0, 0, 0, 0, 9, 0},
            {0, 0, 6, 0, 0, 10},
            {0, 0, 0, 0, 0, 0}
        };


        // Graph g = new Graph(adj_matrix0);
        // g.print();

        // System.out.println("Max flow for the G is " + g.fordFulkerson(0, 5)); // Expected: 23
        
        // Graph g = new Graph(adj_matrix1);
        // g.print();

        // System.out.println("Max flow for the G is " + g.fordFulkerson(0, 3)); // Expected: 5

        Graph g = new Graph(adj_matrix2);
        g.print();

        System.out.println("Max flow for the G is " + g.fordFulkerson(0, 5)); // Expected: 19
        
    }
}
