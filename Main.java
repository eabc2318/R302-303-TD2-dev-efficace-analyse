public class Main {
    public static void main(String[] args) {
        SinglyList list = new SinglyList();
        list.addLast(1); 
        list.addLast(2); 
        list.addLast(3);
        System.out.println(list.getSecondToLast());
        list.reverse();
        System.out.println(list.first());

        //double
        DoublyList dList1 = new DoublyList();
        dList1.addLast(10);
        DoublyList dList2 = new DoublyList();
        dList2.addLast(10);
        System.out.println(dList1.equals(dList2));

        //linked
        MyLinkedList highScores = new MyLinkedList<>();
        highScores.add("joueur1 - 1000");
        highScores.add("joueur2 - 800");
        System.out.println(highScores.get(0));

        //générique
        MyLinkedList highScores = new MyLinkedList<>();
        highScores.add("joueur1 - 1000");
        highScores.add("joueur2 - 800");
        System.out.println("minkedlist : " + highScores.get(0));

        //circulaire
        CircularList cList = new CircularList();
        cList.addFirst(5);
        cList.addFirst(10);
        System.out.println("circularlist  : " + cList.countNodes());

        //sentinelles
        DoublyListSentinel dls = new DoublyListSentinel();
        dls.addLast(10); 
        dls.addLast(20); 
        dls.addLast(30);
        System.out.println("doublylistsentine : " + dls.findMiddle());
    }
}