package lesson7.home_work;

import lesson7.Graph;

import java.util.LinkedList;

public abstract class Path {
    protected boolean[] marked;
    protected int[] edgeTo;
    private int source;

    public Path(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
        fs (g, source);
    }

    protected abstract void fs(Graph g, int source);


    public boolean hasPathTo(int dist) {
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist) {
        if (!hasPathTo(dist)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while (vertex != source) {
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }

}
