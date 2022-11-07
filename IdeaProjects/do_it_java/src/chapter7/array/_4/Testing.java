package chapter7.array._4;

public class Testing {
    public static void main(String[] args) {
        Student s1 = new Student("김길동");
        Student s2 = new Student("홍길동");

        s1.putSubject("국어",100);
        s1.putSubject("수학",100);
        s2.putSubject("국어",90);
        s2.putSubject("수학",90);
        s2.putSubject("영어",80);
//
////      왜 null값이 나오지?...
//        putSubjectName 메서드에서 멤버변수를 null로 정의되었기에!
//        String 자료형에서 null + "abc" => "nullabc";로 출력
        s1.showStudentInfo();
        System.out.println("===================");
        s2.showStudentInfo();
        String a = null;
        String b = "abc";
        System.out.println(a+b);

    }
}
