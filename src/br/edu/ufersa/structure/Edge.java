package br.edu.ufersa.structure;

public class Edge {

    private int capacity;
    private int flow;
    private Node directed_incidence;

    public Edge(int capacity, int flow, Node directed_incidence) {
        this.setCapacity(capacity);
        this.setFlow(flow);
        this.setDirectedIncidence(directed_incidence);
    }

    public void setCapacity(int capacity) {
        if (capacity >= 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }
    }

    public void setFlow(int flow) {
        if (flow <= this.capacity) {
            this.flow = flow;
        } else {
            this.flow = 0;
        }
    }

    public void setDirectedIncidence(Node directed_incidence) {
        if (directed_incidence != null) {
            this.directed_incidence = directed_incidence;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFlow() {
        return flow;
    }

    public Node getDirectedincidence() {
        return directed_incidence;
    }

    

    

    

    
}
