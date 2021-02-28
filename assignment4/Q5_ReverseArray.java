package CFC.Java.assignment4;

import java.util.Arrays;

public class Q5_ReverseArray {
    public static void main(String[] args) {
        int[] arr={8,3,5,2,1,0};
        arr=reverseArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] reverseArray(int[] arr, int start,int end) {
        if(start==arr.length/2){
            return arr;
        }
        int t=arr[start];
        arr[start]=arr[end-start];
        arr[end-start]=t;
        return reverseArray(arr,start+1,end);
    }


}
