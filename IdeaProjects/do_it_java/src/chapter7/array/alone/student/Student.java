package chapter7.array.alone.student;

public class Student {
    private String name;
    private static int serialNum =1000;
    private int studentID;

    Student(String name){
        this.name =name;
        serialNum++;
        studentID = serialNum;
    }

    public void showStudentInfo(){
        System.out.println(name+", "+studentID);
    }
}
