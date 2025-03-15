package generic.box;

public class TestBox {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        Integer someInteger = integerBox.get();
        System.out.println("Integer Value: " + someInteger);

        Box<String> stringBox = new Box<>();
        stringBox.set("test");
        String someString = stringBox.get();
        System.out.println("String Value: " + someString);
    }
}
