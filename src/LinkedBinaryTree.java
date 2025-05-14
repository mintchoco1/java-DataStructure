import com.zybooks.dsaj.util.Position;

public abstract class LinkedBinaryTree<E> extends AbstractBinaryTree<E>{

    protected static class Node<E> implements Position<E>{
        private E element;
        private Node<E> left;
        private Node<E> right;
        private Node<E> parent;

        public Node(E e, Node<E> above, Node<E> leftChild, Node<E> rightChild){
            element = e;
            parent = above;
            left = leftChild;
            right = rightChild;
        }

        public E getElement() {
            return element;
        }
        public Node<E> getLeft() {
            return left;
        }
        public Node<E> getRight() {
            return right;
        }
        public Node<E> getParent() {
            return parent;
        }
        public void setElement(E e) {
            element = e;
        }
        public void setLeft(Node<E> leftChild) {
            left = leftChild;
        }
        public void setRight(Node<E> rightChild) {
            right = rightChild;
        }
        public void setParent(Node<E> parentNode) {
            parent = parentNode;
        }
    }

    protected Node<E> createNode(E e, Node<E> parent, Node<E> left, Node<E> right){
        return new Node<>(e, parent, left, right);
    }

    //linkedbinarytree instance variables
    protected Node<E> root = null;
    private int size = 0;

    //생성자
    public LinkedBinaryTree(){
    }

    //사용자가 넘긴 위치 p 가 이 tree에서 사용 가능한지 확인
    //p가 올바른 내부 노드 객체인가
    //p가 이미 삭제된 노드가 아닌지
    //position 타입 입력을 노드 타입으로 바꿔 리턴
    protected Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid position type");
        Node<E> node = (Node<E>) p;
        if (node.getParent() == node) throw new IllegalArgumentException("p is no longer in the tree");

        return node;
    }

    //리스트에 저장된 노드의 개수를 반환
    public int size(){
        return size;
    }
    public Position<E> root(){
        return root;
    }
}
