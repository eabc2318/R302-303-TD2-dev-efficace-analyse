public class DoublyListSentinel {
    private static class Node {
        Integer element;
        Node prev, next;
        public Node(Integer e, Node p, Node n) { element = e; prev = p; next = n; }
    }

    private Node header;
    private Node trailer;
    private int size = 0;

    public DoublyListSentinel() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
        header.next = trailer;
    }

    public void addLast(Integer e) {
        Node newest = new Node(e, trailer.prev, trailer);
        trailer.prev.next = newest;
        trailer.prev = newest;
        size++;
    }

    public Integer findMiddle() {
        if (header.next == trailer) return null;
        Node tortue = header.next;
        Node lievre = header.next;
        
        while (lievre != trailer && lievre.next != trailer) {
            tortue = tortue.next;
            lievre = lievre.next.next;
        }
        return tortue.element;
    }

    public static DoublyListSentinel concat(DoublyListSentinel L, DoublyListSentinel M) {
        DoublyListSentinel result = new DoublyListSentinel();
        
        Node current = L.header.next;
        while (current != L.trailer) {
            result.addLast(current.element);
            current = current.next;
        }
        
        current = M.header.next;
        while (current != M.trailer) {
            result.addLast(current.element);
            current = current.next;
        }
        return result;
    }
}