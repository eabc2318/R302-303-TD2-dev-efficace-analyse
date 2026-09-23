public class CircularList {
    private static class Node {
        Integer element;
        Node next;
        public Node(Integer e, Node n) { element = e; next = n; }
    }
    
    private Node tail = null;
    private int size = 0;

    public void addFirst(Integer e) {
        if (size == 0) {
            tail = new Node(e, null);
            tail.next = tail;
        } else {
            Node newest = new Node(e, tail.next);
            tail.next = newest;
        }
        size++;
    }

    public int countNodes() {
        if (tail == null) return 0;
        int count = 1;
        Node current = tail.next;
        while (current != tail) {
            count++;
            current = current.next;
        }
        return count;
    }



    public void splitList(CircularList list1, CircularList list2) {
        if (size == 0) return;
        int mid = size / 2;
        Node current = tail.next;
        
        for (int i = 0; i < mid; i++) {
            list1.addFirst(current.element);
            current = current.next;
        }
        for (int i = mid; i < size; i++) {
            list2.addFirst(current.element);
            current = current.next;
        }
    }
    
}