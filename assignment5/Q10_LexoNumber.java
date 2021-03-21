package CFC.Java.assignment5;

import java.util.ArrayList;

public class Q10_LexoNumber {
    public static void main(String[] args) {
        int n=13;
        ArrayList<Integer> arr=new ArrayList<Integer>();
        printLexoOrder(n,arr,1,0);
    }

    private static void printLexoOrder(int n, ArrayList<Integer> arr,int start,int curr) {
        if(curr==n){
            System.out.println(arr);
            return;
        }
        arr.add(start);
        if(start*10<=n){
            printLexoOrder(n,arr,start*10,curr+1);
            return;
        }
        if(start>=n) {
            start = ((start / 10) + 1);
        }
        else if(start<n){
            start+=1;
            }
        while ((start%10==0)){
                 start/=10;
        }
        printLexoOrder(n,arr,start,curr+1);
        return;
    }


}
