import java.util.AbstractList;
import java.util.List;

public class MyLinkedList extends AbstractList implements List {
    private static class Node {
        T element;
        Node prev, next;
        public Node(T e, Node p, Node n) { element = e; prev = p; next = n; }
    }

    private Node head, tail;
    private int size = 0;

    @Override
    public int size() { return size; }

    @Override
    public boolean add(T e) {
        Node newest = new Node<>(e, tail, null);
        if (size == 0) head = newest;
        else tail.next = newest;
        tail = newest;
        size++;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current.element;
    }
}