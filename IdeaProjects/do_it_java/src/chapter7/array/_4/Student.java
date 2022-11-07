package chapter7.array._4;

import java.util.ArrayList;

public class Student {
    private String name;
    private static int serialNum;

    private int studentID;
    ArrayList<Subject> subjectList;


    public Student(String name) {
        this.name = name;
        serialNum++;
        this.studentID = serialNum;
        subjectList = new ArrayList<Subject>();

    }
    // putSubject(Subject 클래스에서 과목과 점수를 입력하는 것을 왜 student 클래스에서 진행해야할까?)
    // 아... Student 내부에서 참조변수가 과목이 다르기 때문에!...
    // 즉 Student s1, s2의 수강 과목이 다르기 때문... 이것이 메서드를 설정하는 이유겠지?
    public void putSubject(String subjectName, int score){
        Subject subject = new Subject();
        subject.putSubjectName(subjectName);
        subject.putScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        for(Subject s : subjectList){
            System.out.println("학생 "+name+"의 학번은 "+studentID+"이고, "+
                    s.getSubjectName()+"의 성적은 "+s.getScorePoint()+"이다.");
            total+=s.getScorePoint();
        }
        System.out.println("총점은 "+total);
    }
}
