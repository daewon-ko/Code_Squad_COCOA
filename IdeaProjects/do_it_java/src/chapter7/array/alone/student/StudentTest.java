package chapter7.array.alone.student;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        // new 연산자 뒤의 generic?에는 객체가 안들어가도 상관이 없나?

        list.add(new Student("김길동"));
        list.add(new Student("고길동"));
        list.add(new Student("홍길동"));

        for(int i =0; i<list.size(); i++){
            Student student = list.get(i);
            student.showStudentInfo();
        }
        System.out.println("=====향상된 for문 이용====");
        for(Student s : list){
            s.showStudentInfo();
        }
    }

}
