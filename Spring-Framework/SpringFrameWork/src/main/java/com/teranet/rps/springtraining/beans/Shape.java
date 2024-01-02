package com.teranet.rps.springtraining.beans;

public class Shape {
    private String name;
    private int numberOfFaces;
    private int numberOfEdges;
    private int numberOfVertex;

    public Shape() {
    }

    public Shape(String name, int numberOfFaces, int numberOfEdges, int numberOfVertex) {
        System.out.println("Shape Bean Autowired.");
        this.name = name;
        this.numberOfFaces = numberOfFaces;
        this.numberOfEdges = numberOfEdges;
        this.numberOfVertex = numberOfVertex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfFaces() {
        return numberOfFaces;
    }

    public void setNumberOfFaces(int numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }

    public int getNumberOfVertex() {
        return numberOfVertex;
    }

    public void setNumberOfVertex(int numberOfVertex) {
        this.numberOfVertex = numberOfVertex;
    }
}
