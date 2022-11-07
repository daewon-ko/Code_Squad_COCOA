package chapter7.array.arraylist;

public class Subject {
    private int kor;
    private int eng;
    private int math;
    private int total;
    Subject subejct;


    public Subject(int kor, int math){
        this.kor = kor;
        this.math = math;
    }

    public Subject(int kor, int math, int eng){
        // 생성자를 어떻게 또 재활용할 수 있지?
        this.kor =kor;
        this.math =math;
        this.eng = eng;
    }



//    public String showScore(Subject subject){
//        String result ="";
//
//
//    }    public String showScore(Subject subject){
//        String result ="";
//
//
//    }



}
