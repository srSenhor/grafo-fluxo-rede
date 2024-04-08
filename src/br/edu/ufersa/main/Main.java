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
        

        s.add(new Edge(3, 0, v1));
        s.add(new Edge(4, 2, v2));
        s.add(new Edge(2, 2, v3));

        v1.add(new Edge(3, 1, v3));

        v2.add(new Edge(2, 2, v3));
        v2.add(new Edge(3, 3, t));

        v3.add(new Edge(1, 1, v2));
        v3.add(new Edge(4, 4, v4));

        v4.add(new Edge(3, 1, v1));
        v4.add(new Edge(5, 3, t));
        
        g.addNode(s);
        g.addNode(v1);
        g.addNode(v2);
        g.addNode(v3);
        g.addNode(v4);
        g.addNode(t);
        
        g.print();
        
    }
}
