package CFC.Java.assignment4;

import java.util.Arrays;

public class Q8_SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,1,11,8,9,4,0,10};
        selectionSort(arr,0,0,1);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int start, int max,int ind) {
        if(start==arr.length-1){
            return;
        }
        if(ind>arr.length-1-start){
            swapEle(arr,max,arr.length-1-start);
            selectionSort(arr,start+1,0,1);
            return;
        }
        if(arr[ind]>arr[max]){
            selectionSort(arr,start,ind,ind+1);
            return;
        }
        selectionSort(arr,start,max,ind+1);
    }


    private static void swapEle(int[] arr, int index, int next) {
        int t=arr[index];
        arr[index]=arr[next];
        arr[next]=t;
    }
}
