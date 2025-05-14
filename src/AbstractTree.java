import com.zybooks.dsaj.util.Position;

//추상 클래스는 작접 객체로 만들 수 없고 상속해서 사용해야함
//tree를 implement를 한다는 것은 tree 인터페이에 있는 메서드들을 일부 또는 모두 구현하겠다는 뜻
public abstract class AbstractTree<E> implements Tree<E> {
    public boolean isInternal(Position<E> p){
        return numChildren(p) > 0; //p 위치의 노드가 자식 하나 이상있으면 내부 노드이다.자식 수를 세는 함수는 아직 구현 x
    }
    public boolean isExternal(Position<E> p){
        return numChildren(p) == 0; //p 위치의 노드가 자식이 없으면 외부 노드
    }
    public boolean isRoot(Position<E> p){
        return p == root(); //p 가 트리의 루트 노드라면 true. root()는 트리의 루트 위치를 반환
    }
    public boolean isEmpty(){
        return size() == 0;
    }
}
