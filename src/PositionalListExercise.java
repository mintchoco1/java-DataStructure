import java.util.Iterator;

public class PositionalListExercise {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
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
        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p);
        }
    }

    // TODO: for-each 구문으로 리스트 출력
    public static void printListWithForEach(PositionalList<Person> list) {
        for (Person person : list){
            System.out.println(person);
        }
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
        Position<Person> current = list.first();
        while (current != null) {
            Position<Person> next = list.after(current); //다음 위치 먼저 저장
            Person person = current.getElement();
            if (current.getElement().getName().equals(name)) {
                list.remove(current);//현재 위치 삭제
            }
            current = next;//다음으로 이동
        }
    }

    //============================추가 구현 test=============================//
    public static class ExamScore {
        private String subjectName;
        private int period;
        private int score;
        private int myScore;

        public ExamScore(String subjectName, int period, int score, int myScore) {
            this.subjectName = subjectName;
            this.period = period;
            this.score = score;
            this.myScore = myScore;
        }
        public String getSubjectName() {
            return subjectName;
        }
        public int getPeriod() {
            return period;
        }
        public int getScore() {
            return score;
        }
        public int getMyScore() {
            return myScore;
        }
        public String toString() {
            return "[과목: " + subjectName + ", " + period + "교시, 만점: " + score + ", 내 점수: " + myScore + "]";
        }
    }
    public static void ex4(){
        System.out.println("========== ex4 ========");
        PositionalList<ExamScore> examscores = new LinkedPositionalList<>();
        examscores.addLast(new ExamScore("국어", 1, 100, 88));
        examscores.addLast(new ExamScore("수학", 2, 100, 92));
        examscores.addLast(new ExamScore("영어", 3, 100, 95));
        examscores.addLast(new ExamScore("한국사", 4, 50, 50));
        examscores.addLast(new ExamScore("탐구", 5, 50, 45));
        examscores.addLast(new ExamScore("수학", 2, 100, 100));

        System.out.println("== 삭제 전 점수 목록 ==");
        for (ExamScore s : examscores) {
            System.out.println(s);
        }

        removeAllBySubject(examscores, "수학");

        System.out.println("\n== '수학' 삭제 후 점수 목록 ==");
        for (ExamScore s : examscores) {
            System.out.println(s);
        }
    }
    public static void removeAllBySubject(PositionalList<ExamScore> list2, String name){
        Position<ExamScore> current = list2.first();
        while (current != null){
            Position<ExamScore> next = list2.after(current);
            ExamScore subject = current.getElement();
            if(subject.getSubjectName().equals(name)){
                list2.remove(current);
            }
            current = next;
        }
    }
    //============================추가 구현 test=============================//
}
