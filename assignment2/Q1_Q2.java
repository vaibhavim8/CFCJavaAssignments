package CFC.Java.assignment2;

import java.util.Scanner;

public class Q1_Q2 {
    public static void main(String[] args) {
        //int num=453;
        //System.out.println(dectooct(num));
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        char ch=s.next().charAt(0);
        mathresult(num1,num2,ch);
    }

    private static void mathresult(int num1, int num2, char ch) {
        switch (ch){
            case '*':
                System.out.println(num1*num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
            case '/':
                System.out.println(num1/num1);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("wrong character entered");
        }
    }

    private static int dectooct(int num) {
        int res=0;
        int place=1;
        while(num>7){
            int remainder=num%8;
            num=num/8;
            res=place*remainder+res;
            place=place*10;
        }
        if(num>0){
            res=place*num+res;
        }
        return res;

    }
}
