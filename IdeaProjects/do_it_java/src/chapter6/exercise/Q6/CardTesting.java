package chapter6.exercise.Q6;

public class CardTesting {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getCardComapny();
        Card c1 = cardCompany.createCard();
        Card c2 = cardCompany.createCard();
        Card c3 = cardCompany.createCard();
        // static 변수인 serialNum은 Card가 생성될 때마다 늘어난다.
        // 즉, Card를 3개 생성했으므로 +3 늘어나서 4가되고 모든 참조변수들이
        // 이 값을 CardNum과 매개하므로 모든 값이 동일하게 나오는 것이다 !



        System.out.println(c1.getCardNum());
        System.out.println(c2.getCardNum());
        System.out.println(c3.getCardNum());

    }
}
