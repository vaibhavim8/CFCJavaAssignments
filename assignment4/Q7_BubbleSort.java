package CFC.Java.assignment4;

import java.util.Arrays;


public class Q7_BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,1,3,8,9,4,0};
        bubbleSort(arr,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int start, int next) {
        if(start==arr.length-1){
            return;
        }
        if(next==arr.length-1-start){
            bubbleSort(arr,start+1,0);
            return;
        }
        if(arr[next]>arr[next+1]){
            swap(arr,next,next+1);
        }
        bubbleSort(arr,start,next+1);


    }

    private static void swap(int[] arr, int start, int next) {
        int t=arr[start];
        arr[start]=arr[next];
        arr[next]=t;
    }


}
