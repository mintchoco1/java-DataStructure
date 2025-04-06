package doublelinkedlist.dll;

public class DLLMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        System.out.println("Is the list empty? " + list.isEmpty());

        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);

        // 리스트의 요소 출력
        System.out.println("First element: " + list.first()); // 5
        System.out.println("Last element: " + list.last());  // 25

        // 리스트의 크기 출력
        System.out.println("List size: " + list.size()); // 4

        // 첫 번째와 마지막 요소 제거
        System.out.println("Removed first element: " + list.removeFirst()); // 5
        System.out.println("Removed last element: " + list.removeLast());   // 25

        // 변경 후 리스트의 요소 다시 출력
        System.out.println("New first element: " + list.first()); // 10
        System.out.println("New last element: " + list.last());  // 20

        // 최종 리스트의 크기 출력
        System.out.println("List size: " + list.size()); // 2

        // 리스트가 비어 있는지 확인
        System.out.println("Is the list empty? " + list.isEmpty()); // false);
    }
}
