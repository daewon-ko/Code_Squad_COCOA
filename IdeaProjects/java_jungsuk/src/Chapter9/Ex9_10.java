package Chapter9;

public class Ex9_10 {
    public static void main(String args[] ){
        int ival = 100;
        String strVal = String.valueOf(ival);


        double dVal = 200.0;
        String strVal2 = dVal +"";

        double sum = Integer.parseInt("+"+strVal)
                    + Double.parseDouble(strVal2);

        double sum2 = Integer.valueOf(strVal)+Double.parseDouble(strVal2);

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);

    }

}
