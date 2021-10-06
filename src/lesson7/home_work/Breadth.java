package lesson7.home_work;

import lesson7.Graph;

import java.util.LinkedList;

public class Breadth extends Path {

    public Breadth(Graph g, int source) {
        super (g, source);
    }

    @Override
    protected void fs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(source);
        marked[source] = true;

        while (!queue.isEmpty()) {
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addLast(w);
                }
            }
        }
    }
}
