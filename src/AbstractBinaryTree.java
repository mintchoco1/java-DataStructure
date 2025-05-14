import com.zybooks.dsaj.util.Position;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E>{

    @Override
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p); //부모 위치 구함
        if (parent == null) return null;//루트면 형제가 없음
        if (p == left(parent)){
            return right(parent);//p가 왼쪽 자식이면 형제는 오른쪽 자식
        }else{
            return left(parent);//p가 오른쪽 자식이면 형제는 왼쪽 자식
        }
    }

    //자식 수 구하기
    @Override
    public int numChildren(Position<E> p) {
        int count = 0;
        if(left(p) != null) count++;
        if(right(p) != null) count++;
        return count;
    }
}
