package Chapter10;

import java.text.DecimalFormat;

public class Ex10_6 {
    public static void main(String [] args){
        double number = 1234567.89;

        DecimalFormat df = new DecimalFormat("####E0");
        System.out.println(df.format(number));

    }
}
