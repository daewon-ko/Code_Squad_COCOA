package d_221107;

import java.util.Scanner;

public class Baekjoon_10991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){

            for(int j=i+1; j<n; j++){
                System.out.printf(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.printf("*");
                System.out.printf(" ");
//                System.out.printf("*\n");
            }
            System.out.println();
        }

    }
}
