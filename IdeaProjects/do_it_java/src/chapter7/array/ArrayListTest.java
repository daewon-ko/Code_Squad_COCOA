package chapter7.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();

        list.add(new Book("개밥바라기별","황석영"));
        list.add(new Book("사람은 무엇으로 사는가","소크라테스"));
        list.add(new Book("철인론","플라톤"));

        for(int i=0; i<list.size(); i++){
            Book b = list.get(i);
            b.showBookInfo();
        }

    }
}
