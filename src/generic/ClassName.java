package generic;

public class ClassName<E> {

    private E element;

    void set(E element) {
        this.element = element;
    }

    E get(){
        return element;
    }
}
class Main{

    public static void main(String[] args) {

        ClassName<String> className1 = new ClassName<>();
        ClassName<Integer> className2 = new ClassName<>();

        className1.set("a");
        className2.set(1);

        System.out.println("className1 data: " + className1.get());
        System.out.println("className1 E Type: " + className1.get().getClass().getName());
        //getclass() 메서드는 객체의 런타임 클래스를 나타내는 클래스를 반환
        //getNaeme() 메서드는 해당 클래스의 완전한 이름을 문자열로 반환. 클래스의 패키지 이름을 포함한 전체 이름이 출려됨

        System.out.println("className2 data: " + className2.get());
        System.out.println("className2 E Type: " + className2.get().getClass().getName());
    }
}
