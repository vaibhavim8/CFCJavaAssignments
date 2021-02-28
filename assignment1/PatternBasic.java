package CFC.Java.assignment1;

import java.util.Scanner;

public class PatternBasic
{
    public static void patterna(int val)
    {
        int row=0;
        while(row<val)
        {
            int col = 0;
            while (col <= row)
            {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void patternb(int val)
    {
        int row=0;
        while(row<val)
        {
            int col=0;
            while(col<=row)
            {
                System.out.print(col+1+" ");
                col++;
            }
            System.out.println();
            row++;


        }
    }
    public static void patternstarc(int val)
    {

        int row=0;
        while(row<val)
        {
            int colmirr=0;
            int col=0;
            while(colmirr<((2*val)-1))
            {
                if((row+col)<val-1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(" *");
                }
                if(colmirr<val-1)
                {
                    col++;
                }
                else{
                    col--;
                }
                colmirr++;
            }
            System.out.println();
            row++;
        }
    }
    public static void patternnumberc(int val)
    {
        int row=0;
        while(row<val)
        {
            int colmirr=0;
            int col=0;
            while(colmirr<2*val-1)
            {
                if(row+col<val-1){
                    System.out.print("  ");
                }
                else{
                    System.out.print(row+col-(val-2)+" ");
                }
                if(colmirr<val-1)
                {
                    col++;
                }
                else {
                    col--;
                }
                colmirr++;
            }
            System.out.println();
            row++;
        }
    }
    public static void patternd(int val)
    {
        int row=0;
        while(row<val)
        {
            int colmirr=0;
            int inc=1;
            int col=0;
            while(colmirr<2*val-1)
            {

                if(row+col<val-1){
                    System.out.print("  ");
                }
                else{
                    System.out.print(row+inc+" ");
                    if(colmirr<val-1)
                    {
                        inc++;
                    }
                    else{
                        inc--;
                    }
                }
                if(colmirr<val-1)
                {
                    col++;
                }
                else {
                    col--;
                }
                colmirr++;
            }
            System.out.println();
            row++;
        }
    }
    public static void patterne(int val)
    {
        int row=0;
        while(row<val)
        {
            int col = 0;
            while (col <= row)
            {
                int n=fact(row)/(fact(col)*fact(row-col));
                System.out.print(n+" ");
                col++;
            }
            System.out.println();
            row++;

        }
    }
    public static int fact(int val){
        int factorial=1;
        for (int i = val; i >0 ; i--) {
            factorial=i*factorial;
        }
        return factorial;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        int value=s.nextInt();
        patterne(value);
    }
}
