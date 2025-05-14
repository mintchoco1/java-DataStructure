import com.zybooks.dsaj.util.Position;

public interface BinaryTree<E> extends Tree<E>{
    Position<E> left(Position<E> p) throws IllegalArgumentException;
    Position<E> right(Position<E> p) throws IllegalArgumentException;
    Position<E> sibling(Position<E> p) throws IllegalArgumentException;
    //size() root() 같은 메서드도 자동으로 포함
    //Position<E> 타입을 통해 왼쪽, 오른쪽, 형제 노드를 접근할 수 있게 정의만 함. 아직 구현 x
}
