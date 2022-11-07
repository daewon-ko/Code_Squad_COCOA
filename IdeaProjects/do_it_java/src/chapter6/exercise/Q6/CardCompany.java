package chapter6.exercise.Q6;

public class CardCompany {
    private static CardCompany instace;
    private CardCompany(){
    }

    public static CardCompany getCardComapny(){
        instace = new CardCompany();
        return instace;
    }

    public Card createCard(){
        Card c = new Card();

        return c;
    }
}
