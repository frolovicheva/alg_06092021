package lesson4;

public class LinkedQueue<T> {
    private MyLinkedList<T> list;

    public LinkedQueue() {
        list = new MyLinkedList<>();
    }

    public void insert(T item) {
        list.insertLast (item);
    }

    public T remove() {
        return list.removeFirst ();
    }
    public T peekFirst() {
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public String toString(){ return list.toString ();}
}
