package chapter7.array;

import java.util.Arrays;

public class ObjectCopy {
    public static void main(String[] args) {
        Book [] books = new Book[5];
        books[0] = new Book("aaa", "김대현");
        books[1] = new Book("bbb", "김기현");
        books[2] = new Book("ccc", "김나현");
        books[3] = new Book("ddd", "고어현");
        books[4] = new Book("eee", "권기현");

        Book [] books2 = new Book[10];

        System.arraycopy(books,0,books2,0,5);

        for(int i=0; i<books2.length; i++){
            books2[i].showBookInfo();
        }
    }
}
