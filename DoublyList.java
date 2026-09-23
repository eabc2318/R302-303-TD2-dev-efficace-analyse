public class DoublyList {
    private static class Node {
        private Integer element;
        private Node prev;
        private Node next;
        public Node(Integer e, Node p, Node n) { element = e; prev = p; next = n; }
        public Integer getElement() { return element; }
        public Node getPrev() { return prev; }
        public Node getNext() { return next; }
        public void setPrev(Node p) { prev = p; }
        public void setNext(Node n) { next = n; }
    }

    private Node head = null;
    private Node tail = null;
    private int size = 0;

    public void addLast(Integer e) {
        Node newest = new Node(e, tail, null);
        if (size == 0) head = newest;
        else tail.setNext(newest);
        tail = newest;
        size++;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof DoublyList)) return false;
        DoublyList other = (DoublyList) o;
        if (this.size != other.size) return false;
        
        Node walkA = this.head;
        Node walkB = other.head;
        while (walkA != null) {
            if (!walkA.getElement().equals(walkB.getElement())) return false;
            walkA = walkA.getNext();
            walkB = walkB.getNext();
        }
        return true;
    }
}