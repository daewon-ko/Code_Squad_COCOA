package chapter7.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ObjectCopy3 {
    public static void main(String[] args) {
        Book [] BookArray1 = new Book[3];
        Book [] BookArray2 = new Book[3];

        BookArray1[0]= new Book("어떻게 살 것인가", "유시민");
        BookArray1[1]= new Book("어떻게 살 것인가", "고시민");
        BookArray1[2]= new Book("어떻게 살 것인가", "김시민");

        BookArray2[0] = new Book("","");
        BookArray2[1] = new Book("","");
        BookArray2[2] = new Book("","");

        for(int i = 0; i< BookArray1.length; i++){
            BookArray2[i].setTitle(BookArray1[i].getTitle());
            BookArray2[i].setAuthor(BookArray1[i].getAuthor());
        }

        for(int i =0; i<BookArray2.length; i++){
            BookArray2[i].showBookInfo();
        }


        BookArray2[0] = new Book("호호호호","소크라테스");
        BookArray2[1].setAuthor("박완서");
        BookArray2[1].setTitle("나목");

        for(int i =0; i<BookArray2.length; i++){
            BookArray2[i].showBookInfo();
        }

        // 향상된 for문을 통한 출력
        for(Book b :BookArray2){
            b.showBookInfo();
//            System.out.println(Arrays.toString(b.getAuthor()));
        }

        int [] nums = {1,2,3};
        System.out.println(Arrays.toString(nums));



    }
}
