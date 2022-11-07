package chapter6.selfCoding;

public class Car {
    public static int carNum=10000;

    public int getCarNum(){
        carNum++;
        return  carNum;
    }

}
/*
1. serialNum을 static int로 설정한 후
   생성자 내에서 ++; 시킨 후 getCarNum 내에서 carNum = serialNum 이런 식으로 해줬어야 했는데 빼먹음
 */