package CFC.Java.assignment3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Q6_ArraySum {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] n1=new int[n];
//        for (int i = 0; i < n ; i++) {
//            n1[i]=s.nextInt();
//        }
//        int m=s.nextInt();
//        int[] m1=new int[m];
//        for (int i = 0; i < n ; i++) {
//            m1[i]=s.nextInt();
//        }
        int[] n1={3,5,0,7};
        int[] m1={9,0,2,8};
        ArrayList<Integer> res=arraysSum(n1,m1);
        System.out.println(res);

    }

    private static ArrayList<Integer> arraysSum(int[] n1, int[] m1) {
        int number1=0;
        int number2=0;
        for (int i = 0; i<n1.length; i++) {
            number1= (int) (number1+n1[i]*Math.pow(10,(n1.length-1-i)));
        }
        for (int i = 0; i<m1.length; i++) {
            number2= (int) (number2+m1[i]*Math.pow(10,(m1.length-1-i)));
        }
        int sum=0;
        sum=number1+number2;
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(sum>0){
            int n=sum%10;
            res.add(0,n);
            sum=sum/10;
        }
        return res;
    }
}
