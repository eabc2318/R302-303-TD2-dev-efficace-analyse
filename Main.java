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
    }
}