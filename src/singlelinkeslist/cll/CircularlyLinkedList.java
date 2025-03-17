package singlelinkeslist.cll;

public class CircularlyLinkedList<E> {
    private static class Node<E> {
        private E element;
        private CircularlyLinkedList.Node<E> next; //다음 노드를 가리키는 참조

        public Node(E e, CircularlyLinkedList.Node<E> n) {
            element = e;   //노드가 저장할 데이터
            next = n;      //노드가 가리킬 다음 노드
        }
        public E getElement() {
            return element;//노드에 저장된 데이터를 반환
        }
        public CircularlyLinkedList.Node<E> getNext() {
            return next;//현재 노드가 가리키는 다음 노드를 반환
        }
        public void setNext(CircularlyLinkedList.Node<E> n) {
            next = n;//현재 노드가 가리키는 다음 노드를 새롭게 설정
        }
    }
    //원형 리스트에서는 tail.getNext()가 항상 head를 참조
    private Node<E> tail = null;
    private int size = 0;
    public CircularlyLinkedList() {}
    //리스트에 저장된 노드의 개수를 반환
    public int size(){
        return size;
    }
    //리스트가 비어있는지 확인
    public boolean isEmpty(){
        return size == 0;
    }
    //tail.getNext()를 통해서 head에 접근하고 getElement()로 첫 번째 요소를 반환
    public E first(){
        if(isEmpty()){
            return null;
        }
        return tail.getNext().getElement();
    }
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    public void rotate(){
        if(tail != null){
            tail = tail.getNext();
        }
    }
    public void addFirst(E e){
        if(size == 0){
            tail = new Node<>(e,null);
            tail.setNext(tail);
        }else {
            Node<E> newest = new Node<>(e,tail.getNext());
            tail.setNext(newest);
        }
        size++;
    }
    public void addLast(E e){
        addFirst(e);
        tail = tail.getNext();
    }
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        Node<E> head = tail.getNext();
        if(head == tail) {
            tail = null;
        }else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }
}