package br.edu.ufersa.main;

import br.edu.ufersa.structure.Graph;

public class Main {
    public static void main(String[] args) {

        int [][] rede1 = {
            {0, 17, 0, 12, 0, 0},
            {0, 0, 16, 0, 0, 0},
            {0, 0, 0, 5, 0, 10},
            {0, 9, 0, 0, 19, 0},
            {0, 0, 0, 0, 0, 19},
            {0, 0, 0, 0, 0, 0}
        };

        int [][] rede2 = {
            {0, 17, 0, 12, 0, 0},
            {0, 0, 16, 0, 5, 0},
            {0, 0, 0, 0, 6, 10},
            {0, 9, 0, 0, 19, 0},
            {0, 0, 0, 0, 0, 19},
            {0, 0, 0, 0, 0, 0}
        };


        Graph gr1 = new Graph(rede1);
        gr1.print();
        System.out.println("Fluxo máximo da rede 1 " + gr1.fordFulkerson(0, 5)); 
        
        Graph gr2 = new Graph(rede2);
        gr2.print();
        System.out.println("Fluxo máximo da rede 2 " + gr2.fordFulkerson(0, 5)); 

        
        
    }
}
