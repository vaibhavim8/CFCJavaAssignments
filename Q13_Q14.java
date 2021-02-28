package CFC.Java.assignment2;

import java.util.Arrays;

public class Q13_Q14 {
    public static void main(String[] args) {
        int[] arr={4,7,2,1,6,3,9};
        reverseArray(arr,0,arr.length-1);
    }

    private static void reverseArray(int[] arr, int i, int len) {
        if(i==arr.length/2||len==arr.length/2){
            Arrays.toString(arr);
            return;
        }
        int t=arr[i];
        arr[i]=arr[len];
        arr[len]=t;
        reverseArray(arr,i+1,len-1);
    }


}
