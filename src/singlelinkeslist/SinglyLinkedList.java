package singlelinkeslist;

public class SinglyLinkedList<E> {
    //neseted node class
    private static class Node<E>{
        private E element;    //노드가 저장하는 데이터
        private Node<E> next; //다음 노드를 가리키는 참조

        public Node(E e, Node<E> n){
            element = e;   //노드가 저장할 데이터
            next = n;      //노드가 가리킬 다음 노드
        }
        public E getElement(){
            return element;//노드에 저장된 데이터를 반환
        }
        public Node<E> getNext(){
            return next;//현재 노드가 가리키는 다음 노드를 반환
        }
        public void setNext(Node<E> n){
            next = n;//현재 노드가 가리키는 다음 노드를 새롭게 설정
        }
    }//end of nested Node class

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList(){}
    public boolean isEmpty(){
        return size == 0;
    }
    /*
    첫 번째 요소 가져오기
    리스트가 비어있으면 null 반환
    비어있지 않다면 head 노드의 데이터를 반환
     */
    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }
    /*
    마지막 요소 가져오기
    리스트가 비어있으면 null 반환
    그렇지 않다면 tail 노드의 요소를 반환
     */
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    /*
    리스트의 첫 부분에 요소 추가
    새노드를 생성. 새 노드는 데이터 e를 저장하고 기존의 head를 next로 참조
    리스트가 비어있다면 tail 과 head가 동일한 노드를 가리킴
    리스트의 사이즈 추가 1
    */
    public void addFirst(E e){
        head = new Node<E>(e,head);
        if(size == 0){
            tail = head;
        }
        size++;
    }
    /*
    리스트의 마지막에 요소 추가
    새 노드를 생성하고 데이터 e 저장하고 next는 null로 저장(마지막 노드이므로)
    */
    public void addLast(E e){
        Node<E> newest = new Node<E>(e,null);
        if(isEmpty()){
            head = newest;
        }else {
            tail.setNext(newest);
        }
        size++;
    }
    /*
    리스트의 첫 번째 요소 제거
    현재 head의 데이터를 임시 변수에 저장
    head를 다음 노드로 이동시킨다
    */
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return answer;
    }
}
