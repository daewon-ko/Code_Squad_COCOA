package chapter7.array._4;

public class Subject {
    String subjectName= "";
    int scorePoint;

    Subject(){}

    public String getSubjectName() {
        return subjectName;
    }

    public int getScorePoint() {
        return scorePoint;
    }
    // setter가 아닌 put메서드를 이용하여
    // 객체 내에서 멤버변수와 메서드로 최대한 해결하고자 노력해봄
    public String putSubjectName(String subjectName){
        this.subjectName+=subjectName;
        return this.subjectName;
    }

    public int putScorePoint(int scorePoint){
        this.scorePoint +=scorePoint;
        return this.scorePoint;
    }
}
