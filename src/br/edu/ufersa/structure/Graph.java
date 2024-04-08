package br.edu.ufersa.structure;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();        
    }

    public Graph(List<Node> nodes) {
        this.setNodes(nodes);
    }

    public void addNode(Node n) {
        if (n != null) {
            nodes.add(n);
        }
    }

    private void setNodes(List<Node> nodes) {
        if (nodes != null) {
            this.nodes = nodes;
        }
    }

    public void print() {
        System.out.println("Printando grafo");

        for (Node node : nodes) {
            System.out.println("Node " + node.getLabel());
            node.printNext();
        }
    }
}
