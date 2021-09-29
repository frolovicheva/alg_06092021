package lesson7;

import lesson4.MyLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Graph {
    private int vertexCount;
    private int edgeCount;
    private LinkedList<Integer>[] adjList;

    public Graph(int vertexCount) {
        if (vertexCount <= 0) {
            throw new IllegalArgumentException("vertexCount " + vertexCount);
        }
        this.vertexCount = vertexCount;
        adjList = new LinkedList[vertexCount];
        for (int i = 0; i < adjList.length; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public int getEdgeCount() {
        return edgeCount;
    }

    public LinkedList<Integer> getAdjList(int vertex) {
        return (LinkedList<Integer>) adjList[vertex].clone();
    }

    public void addEdge(int v1, int v2) {
        if (v1 < 0 || v2 < 0 || v1 >= vertexCount || v2 >= vertexCount) {
            throw new IllegalArgumentException();
        }
        if(!adjList[v1].contains (v2)){ //Проверка на существование такого элемента в списке
            adjList[v1].add(v2);
        }

        if (v1 != v2 && !adjList[v2].contains (v1)) {
            adjList[v2].add(v1);
        }
        edgeCount++;
    }

   public void setRandomEdges(){
       Random random = new Random();
       for (int i = 0; i < vertexCount; i++) {
           int v1 = random.nextInt (vertexCount);
           int v2 = random.nextInt (vertexCount);
           addEdge (v1,v2);
       }
   }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Список смежности: " + "\n");
        for (int i = 0; i < adjList.length; i++) {
            sb.append (i).append ("-").append (getAdjList (i)).append ("\n");
        }
        return sb.toString();
    }
}
