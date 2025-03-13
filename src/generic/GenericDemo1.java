package generic;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){
        this.grade = grade;
    }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){
        this.rank = rank;
    }
}
class Person{
    public Object info;
    public Person(Object info){
        this.info = info;
    }
}
//StudentPerson과 EmployeePerson 은 사실상 똑같은 메커니즘을 가짐
//이럴때 공통 클래스를 만들면 중복을 제거할 수 있음
public class GenericDemo1 {
    public static void main(String[] args) {
        Person p1 = new Person("부장");
        EmployeeInfo ei = (EmployeeInfo) p1.info;
        System.out.println(ei.rank);
    }
}
