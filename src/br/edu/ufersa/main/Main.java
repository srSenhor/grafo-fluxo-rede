package br.edu.ufersa.main;

import br.edu.ufersa.structure.Edge;
import br.edu.ufersa.structure.Graph;
import br.edu.ufersa.structure.Node;

public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();

        Node s = new Node("s");
        Node v1 = new Node("v1");
        Node v2 = new Node("v2");
        Node v3 = new Node("v3");
        Node v4 = new Node("v4");
        Node t = new Node("t");
        
        // TODO: Arrumar a exibição, tá mostrando mais de uma vez o mesmo nó

        g.addNode(s);
        g.addEdge(s, new Edge(3, 0, v1));
        g.addEdge(s, new Edge(4, 2, v2));
        g.addEdge(s, new Edge(2, 2, v3));

        g.addNode(v1);
        g.addEdge(v1, new Edge(3, 1, v3));
        
        g.addNode(v2);
        g.addEdge(v2, new Edge(2, 2, v3));
        g.addEdge(v2, new Edge(3, 3, t));
        
        g.addNode(v3);
        g.addEdge(v3, new Edge(1, 1, v2));
        g.addEdge(v3, new Edge(4, 4, v4));
        
        g.addNode(v4);
        g.addEdge(v4, new Edge(3, 1, v1));
        g.addEdge(v4, new Edge(5, 3, t));
        
        g.addNode(t);
        
        g.print();
        
    }
}
