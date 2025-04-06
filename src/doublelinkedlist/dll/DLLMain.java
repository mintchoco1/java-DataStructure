package doublelinkedlist.dll;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.println("Is the list empty? " + list.isEmpty());

        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
    }
}
