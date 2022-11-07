package chapter6.selfCoding;

public class CarFactory {
    private static int carNum = 1000;
    private static CarFactory instance;
    private CarFactory() {
    }
//    클래스 내부에서 static 변수 생성(자기 자신) => getInstance를 통해 인스턴스 생성 및 리턴
//
    public static CarFactory getInstance(){
        if(instance ==null){
            instance = new CarFactory();
        }
        return instance;
    }
    public Car createCar(){
//      메서드 내에서 타 객체를 생성하려는 것 굿
        Car c = new Car();
        carNum++;
        return c;
    }

}

/*
고민해볼 지점은 객체를 나누고 객체 내에서 메서드와 변수를 설정할 때,
1. createCar은 car 하위가 아닌 CarFactory 하위에 있다는 것이고
2. createCar를 할 때마다 타 클래스(Car 클래스)의 인스턴스가 생성이 된다는 것
3. getCarNum의 경우 Car 클래스의 참조변수를 통해서 호출되므로 해당 기능메서드가
   해당 메서드 내부에 존재해야한다는 것이고 따라서 클래스 내부 지역변수들을 통해 변수 관계망이
   조율되야한다는 점

소 뒷걸음 치다 쥐 잡은 겪으로 맞췄지만 맞은게 아니다!
 */
