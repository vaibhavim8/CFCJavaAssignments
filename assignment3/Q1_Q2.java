package CFC.Java.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_Q2 {
    public static void main(String[] args) {
        int[][] arrayInput=new int[4][4];
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < arrayInput.length; i++) {
            for (int j = 0; j < arrayInput.length; j++) {
                arrayInput[i][j]=s.nextInt();
            }
        }
 //       printAsVertical(arrayInput);
        printAsHorizontal(arrayInput);
    }

    private static void printAsHorizontal(int[][] arrayInput) {
        int row=0;
        int col=0;
        int len=arrayInput.length;
        while(row<len){
            while (col>=0 && col<len){
                System.out.print(arrayInput[row][col]+",");
                if(row%2==0){
                    col++;
                }
                else {
                    col--;
                }
            }
            row++;
            if(row%2==0){
                col++;
            }
            else {
                col--;
            }

        }
    }

    private static void printAsVertical(int[][] arrayInput) {
        int row=0;
        int col=0;
        int len=arrayInput.length;
        while(col<len){
            while(row>=0 && row<len){
                System.out.print(arrayInput[row][col]+",");
                if(col%2==0){
                    row++;
                }
                else{
                    row--;
                }
            }
            col++;
            if(col%2==0){
                row++;
            }
            else{
                row--;
            }

        }

       //System.out.println(Arrays.deepToString(arrayInput));


    }
}
