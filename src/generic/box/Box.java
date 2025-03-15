package generic.box;
//box 클래스는 제네릭 타입 T를 사용한다
//이렇게 정의함으로써 box 클래스는 다양한 타입의 객체를 저장하고 반환할 수 있다
public class Box<T> {

    private T t;

    public void set(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}
