package lesson7.home_work;

import lesson7.Graph;

import java.util.LinkedList;

public class Depth extends Path {

    public Depth(Graph g, int source) {
        super (g, source);
    }

    @Override
    protected void fs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                fs(g, w);
            }
        }
    }
}
