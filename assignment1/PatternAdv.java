package CFC.Java.assignment1;

import java.util.Scanner;

public class PatternAdv {
    public static void diamond(int n)
    {
        int rowmirr=0;
        int row=0;
        while(rowmirr<2*n-1)
        {
            int colmirr=0;
            int col=0;
            while(colmirr<2*n-1)
            {
                if(col<n-row-1) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
                if(colmirr<n-1){
                    col++;
                }
                else {
                    col--;
                }
                colmirr++;
            }
            System.out.println();
            if(rowmirr<n-1) {
                row++;
            }else{
                row--;
            }
            rowmirr++;
        }
    }
    public static void trianglemirror(int val) {
        int rowmirr = 0;
        int row = 0;
        while (rowmirr < 2 * val - 1) {
            int colmirr = 0;
            int col = 0;
            while (colmirr < 2 * val) {
                if (col <= row) {
                    System.out.print("*   ");
                }
                else{
                    System.out.print("    ");
                }
                if (colmirr < val - 1) {
                    col++;
                } else {
                        if (colmirr == val-1) {

                        }
                        else {
                        col--;
                        }
                }
                colmirr++;

            }
            System.out.println();
            if (rowmirr < val - 1) {
                row++;
            } else {
                row--;
            }
            rowmirr++;

        }
    }

    public static void emptydiamond(int n){
        int rowmirr=0;
        int row=0;
        while(rowmirr<2*n-1){
            int colmirr=0;
            int col=0;
            while(colmirr<2*n-1){
                if(col<n-row)
                {
                    System.out.print("*   ");
                }else{
                    System.out.print("    ");
                }
                if(colmirr<n-1){
                    col++;
                }else{
                    col--;
                }
                colmirr++;
            }
            System.out.println();
            if(rowmirr<n-1)
            {
                row++;
            }
            else
            {
                row--;
            }
            rowmirr++;
        }
    }
    public static void numberpatt(int n){
        int rowmirr=0;
        int row=0;
        while(rowmirr<2*n-1){
            int colmirr=0;
            int col=0;
            while(colmirr<2*n-1){
                if(col>=row){
                    System.out.print(n-row+"  ");
                }
                else{
                    System.out.print(n-col+"  ");
                }
                if(colmirr<n-1){
                    col++;
                }
                else{
                    col--;
                }
                colmirr++;
            }
            if(rowmirr<n-1){
                row++;
            }
            else{
                row--;
            }
            System.out.println();
            rowmirr++;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int val=s.nextInt();
        numberpatt(val);
    }
}
