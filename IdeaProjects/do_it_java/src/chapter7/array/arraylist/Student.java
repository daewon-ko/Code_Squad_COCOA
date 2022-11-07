package chapter7.array.arraylist;

public class Student {
    private String name;
    private int serialNum;
    private int studentID;
    Subject subject;

    Student(String name){
        this.name = name;
        serialNum++;
        studentID = serialNum;
        subject = new Subject(1, 2);
    }

//    public String showAllInfo(Student student){
////        String result ="학생 "+student.name+""+"의 "+subject.kor;/
////        result = String.format(result,)
////        return  result;
//    }
}
