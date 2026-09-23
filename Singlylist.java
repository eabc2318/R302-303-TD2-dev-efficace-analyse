public class SinglyList {
    private static class Node {
        private Integer element;
        private Node next;
        public Node(Integer e, Node n) { element = e; next = n; }
        public Integer getElement() { return element; }
        public Node getNext() { return next; }
        public void setNext(Node n) { next = n; }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public SinglyList() {}

    
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    
    public Integer first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
    
    public Integer last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }
    
    public void addFirst(Integer e) {
        head = new Node(e, head);
        if (size == 0) tail = head;
        size++;
    }
    
    public void addLast(Integer e) {
        Node newest = new Node(e, null);
        if (isEmpty()) head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }
    
    public Integer removeFirst() {
        if (isEmpty()) return null;
        Integer answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) tail = null;
        return answer;
    }

    
    
    
    public Integer getSecondToLast() {
        if (size < 2) return null;
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        return current.getElement();
    }

    
    public void reverse() {
        if (size <= 1) return;
        Node prev = null;
        Node current = head;
        Node next = null;
        tail = head; 
        
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev; 
    }
}