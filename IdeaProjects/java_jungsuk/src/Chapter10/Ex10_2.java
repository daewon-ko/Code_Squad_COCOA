package Chapter10;

import java.util.Calendar;

public class Ex10_2 {
    public static void main(String args[]){
        final String [] DAY_OF_WEEK = {"","월", "화","수","목","금","토","일"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2019,3,30);

        System.out.println("date1 :"+toString(date1)+DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+"요일 입니다.");
        System.out.println("date2 :"+toString(date2)+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");

        long diffrence = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
        System.out.println(diffrence);
        System.out.println("일: "+diffrence/(24*60*60));



    }
    public static String toString(Calendar date){
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+
                date.get(Calendar.DATE)+"일";
    }
}
