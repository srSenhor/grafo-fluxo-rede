package br.edu.ufersa.structure;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String label;
    private List<Edge> edges;

    public Node(String label) {
        this.edges = new ArrayList<>();
        this.setLabel(label);
    }

    public String getLabel() {
        return label;
    }

    private void setLabel(String label) {
        if (!label.isBlank() && label != null) {
            this.label = label;
        }
    }

    public void add(Edge e) {
        if (e != null) {
            edges.add(e);
        }
    }

    public void printNext() {
        for (Edge edge : edges) {
            System.out.println("|-- "   + edge.getCapacity() + "(" + edge.getFlow() + ") --> Node " 
                                        + edge.getDirectedincidence().getLabel()); 
        }

        System.out.println();
    }
    
}
