package generic;
/*
class StudentInfo{
    public int grade;
    StudentInfo(int grade){
        this.grade = grade;
    }
}
class StudentPerson{
    public StudentInfo info;
    StudentPerson(StudentInfo info){
        this.info = info;
    }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){
        this.rank = rank;
    }
}
class EmployeePerson{
    public EmployeeInfo info;
    public EmployeePerson(EmployeeInfo info){
        this.info = info;
    }
}
//StudentPerson과 EmployeePerson 은 사실상 똑같은 메커니즘을 가짐
//이럴때 공통 클래스를 만들면 중복을 제거할 수 있음
public class GenericDemo {
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo(2);
        //방금 생성한 si 객체를 사용하여 StudentPerson 객체를 생성
        //sp 객체의 info 필드는 si 객체에 대한 참조를 저장
        //참조를 저장한다는 뜻은 객체의 위치를 가리키는 참조 또는 포인터라고 한다
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade);
        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);
    }
}
