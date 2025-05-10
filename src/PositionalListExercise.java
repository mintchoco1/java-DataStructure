import java.util.Iterator;

public class PositionalListExercise {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        //PositionalList.printSignature();  // Part 2에서 추가 
    }

    public static void ex1() {
        System.out.println("========== ex1 ========");

        PositionalList<Integer> list = new LinkedPositionalList<>();
        list.addLast(8);
        System.out.println("After addLast(8): " + list);

        Position<Integer> p = list.first();
        System.out.println("First position (p): " + p.getElement());

        Position<Integer> q = list.addAfter(p, 5);
        System.out.println("After addAfter(p, 5): " + list);

        Position<Integer> r = list.before(q);
        System.out.println("r = before(q): " + r.getElement());

        list.addBefore(q, 3);
        System.out.println("After addBefore(q, 3): " + list);

        System.out.println("r.getElement(): " + r.getElement());

        Position<Integer> afterP = list.after(p);
        System.out.println("after(p): " + (afterP != null ? afterP.getElement() : "null"));

        Position<Integer> beforeP = list.before(p);
        System.out.println("before(p): " + (beforeP != null ? beforeP.getElement() : "null"));

        list.addFirst(9);
        System.out.println("After addFirst(9): " + list);

        list.remove(list.last());
        System.out.println("After remove(last()): " + list);

        list.set(p, 7);
        System.out.println("After set(p, 7): " + list);

        // 다음 두 줄을 주석 해제하고 실행 시 어떤 예외가 발생하는지 설명하시오.
        //list.remove(q);
        //System.out.println("After remove(q): " + list);

        System.out.println("Final state: " + list);
        System.out.println("");
    }

    public static PositionalList<Person> makeSamplePersonList() {
        PositionalList<Person> list = new LinkedPositionalList<>();
        list.addLast(new Person("Alice", 20));
        list.addLast(new Person("Bob", 25));
        list.addLast(new Person("Charlie", 22));
        list.addLast(new Person("Diana", 30));
        list.addLast(new Person("Eve", 28));
        list.addLast(new Person("Frank", 24));
        list.addLast(new Person("Grace", 27));
        list.addLast(new Person("Heidi", 23));
        list.addLast(new Person("Ivan", 29));
        list.addLast(new Person("Judy", 21));
        return list;
    }

    public static void ex2() {
        System.out.println("========== ex2 ========");
        PositionalList<Person> list = makeSamplePersonList();

        System.out.println("=== Using Position-based print ===");
        printList(list);  // TODO: 직접 구현

        System.out.println("\n=== Using Iterator ===");
        printListWithIterator(list);  // TODO: 직접 구현

        System.out.println("\n=== Using For-Each ===");
        printListWithForEach(list);  // TODO: 직접 구현
        System.out.println("");
    }

    // TODO: Position 기반 순회로 리스트 출력
    public static void printList(PositionalList<Person> list) {
        Position<Person> current = list.first();
        while (current != null) {
            System.out.println(current.getElement());
            current = list.after(current);
        }
    }

    // TODO: Iterator 객체로 리스트 출력
    public static void printListWithIterator(PositionalList<Person> list) {
        // ...
    }

    // TODO: for-each 구문으로 리스트 출력
    public static void printListWithForEach(PositionalList<Person> list) {
        // ...
    }

    public static void ex3() {
        System.out.println("========== ex3 ========");
        PositionalList<Person> list = new LinkedPositionalList<>();
        list.addLast(new Person("Alice", 20));
        list.addLast(new Person("Bob", 25));
        list.addLast(new Person("Alice", 30));
        list.addLast(new Person("Charlie", 22));
        list.addLast(new Person("Alice", 28));

        System.out.println("** Before removing Alice:");
        printList(list);

        removeAllByName(list, "Alice");  // TODO: 직접 구현

        System.out.println("** After removing Alice:");
        printList(list);
        System.out.println("");
    }

    // TODO: 이름이 name인 Person들을 모두 삭제
    public static void removeAllByName(PositionalList<Person> list, String name) {
        // ...
    }
}
