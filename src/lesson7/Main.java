package lesson7;

import lesson7.home_work.Breadth;
import lesson7.home_work.Depth;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Graph gr = new Graph(10);//задается граф из 10 вершин
        gr.setRandomEdges ();//задаются ребра
        System.out.println (gr.toString ());//toString - посмотреть список смежности

        Random random = new Random ();
        System.out.println ("Кратчайший путь:");
        for (int i = 0; i < gr.getVertexCount (); i++) {
            Breadth breadth = new Breadth (gr,i);
            int vertexDist = random.nextInt (gr.getVertexCount ());//рандомный выбор вершины назначения
            if (breadth.hasPathTo (vertexDist) && i != vertexDist){
                System.out.println ("От " + i + " до " +  vertexDist + " = " + breadth.pathTo (vertexDist));
            }
        }
    }
}
