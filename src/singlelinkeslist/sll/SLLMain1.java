package singlelinkeslist.sll;

public class SLLMain1 {

    public static void main(String[] args) {
        //singleLinkedList 인스턴스 생성
        SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();

        //리스트가 비어있는지 확인
        System.out.println("Is the  list empty? " + list.isEmpty());

        //리스트의 처음과 끝에 요소 추가
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);

        //리스트의 첫 번째 요소와 마지막 요소 출력
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());

        //리스트의 요소 제거 후 상태 확인
        System.out.println("Element removed: " + list.removeFirst());//1 제거
        System.out.println("New first element: " + list.first());//2 출력

        //private으로 선언된 size 출력
        System.out.println("size of the list: " + list.size());
    }
}

