import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        // 배열로 만들어서 배열의 요소를 하나의 값으로 비교하면 안되나?
//        int [] com_num = {((int)Math.random() * 10 + 1), ((int) Math.random() * 9 + 1), ((int) Math.random() * 9 + 1)};
//        // 컴퓨터가 생성하는 무작위 세자리 숫자를 배열로 생성
////        String com_num2 = new String(String.valueOf(com_num));
//          String com_num2 = Arrays.toString(com_num).replaceAll("[^0-9]","");
//        System.out.println(com_num2);

        int num1 = (int) (Math.random() * 9 + 1);
        int num2 = (int) (Math.random() * 9 + 1);
        int num3 = (int) (Math.random() * 9 + 1);

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        List<Integer> list = new ArrayList<Integer>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        String str = list.toString().replaceAll("[^0-9]", "");
        System.out.println(str); // 123
        while (true) {
            System.out.printf("숫자를 입력해주세요 ex)123");
            Scanner sc = new Scanner(System.in);
            int chooseNum = sc.nextInt();
            if (str.equals(chooseNum)) {
                // 컴퓨터가 생성한 숫자를 문자열로 변경. 문자열로 변경한 것을 auto_boxing에 의해 비교
                System.out.println("3개의 숫자를 맞히셨습니다! 게임 종료");
                break;
            } else if ()

        }


    }

}


