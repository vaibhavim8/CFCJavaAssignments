package CFC.Java.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q4_AntiClockWise {
    public static void main(String[] args) {
//        int[][] arrayInput=new int[4][4];
//        Scanner s=new Scanner(System.in);
//        for (int i = 0; i < arrayInput.length; i++) {
//            for (int j = 0; j < arrayInput.length; j++) {
//                arrayInput[i][j]=s.nextInt();
//            }
//        }
        int[][] arrayInput={{11 ,12, 13, 14},
                {21 ,22, 23, 24},
                {31 ,32 ,33, 34},
                {41, 42, 43, 44},
        };
        printAntiClockwise(arrayInput);
    }

    private static void printAntiClockwise(int[][] arrayInput) {

        for (int i = 0; i < arrayInput[0].length/2; i++) {
            int length=arrayInput.length-i-1;
            for (int j = i; j < length; j++) {
                System.out.print(arrayInput[j][i]+",");
            }
            for (int j = i; j <length ; j++) {
                System.out.print(arrayInput[length][j]+",");
            }
            for (int j = length; j>i; j--) {
                System.out.print(arrayInput[j][length]+",");
            }
            for (int j = length; j >i ; j--) {
                System.out.print(arrayInput[i][j]+",");
            }
        }
    }
}
