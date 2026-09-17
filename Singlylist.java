package singlyListPkg;

public class SinglyListClass {
    private Node header;

    public SinglyListClass(Node header) {
        this.header = header;
    }

    public void addLast(Integer element) {
        Node newNode = new Node(element);
        Node tmpHeader = header;
        if (header == null) {
            header = newNode;
            return;
        }
        if (tmpHeader.getNext() == null) { // si tmpHeader est null alors on est sur le dernier element
            // alors on positionne tmpHeader
            tmpHeader.setNext(newNode);
        }
    }

    private static class Node {
        private Integer element;
        private Node next;

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
