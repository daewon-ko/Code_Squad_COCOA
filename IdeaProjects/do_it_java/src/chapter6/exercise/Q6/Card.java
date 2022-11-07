package chapter6.exercise.Q6;

public class Card {
    private static int serialNum=1;


    int cardNum;
    Card(){
        serialNum++;
//        cardNum = serialNum;
    }

    public int getCardNum(){
        cardNum = serialNum;
        return cardNum;
    }
//  왜 위와 같이 작성하면 모든 인스턴스의 cardNum이 다 동일하게 나오지?
//  모든 참조변수들이 동일한 참조변수를 가르키나? 아니면,
//  => 바보인가?

//  createCar 메서드에서는 Card만 생성될 뿐 cardNum 관련해서는 변동 X
//  그냥 메서드 내 멤버변수로 존재하는 값에 serialNum을 대입하는 것일 뿐!
//
}
