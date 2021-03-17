package CFC.Java.assignment3;

import java.util.ArrayList;

public class Q9_MinMaxSubArray {
    public static void main(String[] args) {
        int[] arr={2,5,-1,7,-3,-1,-2};
        int k=4;
        minMaxSubArr(arr,k);
    }

    private static void minMaxSubArr(int[] arr, int k) {
        int sum=0;
        ArrayList<Integer> minArray=new ArrayList<Integer>();
        ArrayList<Integer> maxArray=new ArrayList<Integer>();
        for (int i = 0; i < k ; i++) {
            while(!maxArray.isEmpty() && arr[maxArray.get(0)]<=arr[i]){
                maxArray.remove(0);
            }
            while (!minArray.isEmpty() && arr[minArray.get(0)]>=arr[i]){
                minArray.remove(0);
            }
            minArray.add(i);
            maxArray.add(i);
        }
        sum=sum+arr[minArray.get(0)]+arr[maxArray.get(0)];
       // System.out.println("MinEle : "+arr[minArray.get(0)] +" MaxEle : "+arr[maxArray.get(0)]);
        for (int i = k; i < arr.length; i++) {
            if(minArray.get(0).equals(i-k)){
                minArray.remove(0);
            }
            if(maxArray.get(0).equals(i-k)){
                maxArray.remove(0);
            }
            while (!maxArray.isEmpty() && arr[maxArray.get(0)]<=arr[i]){
                maxArray.remove(0);
            }
            while (!minArray.isEmpty() && arr[minArray.get(0)]>=arr[i]){
                minArray.remove(0);
            }
            minArray.add(i);
            maxArray.add(i);
           // System.out.println("MinEle : "+arr[minArray.get(0)] +" MaxEle : "+arr[maxArray.get(0)]);
            sum=sum+arr[minArray.get(0)]+arr[maxArray.get(0)];


        }
        System.out.println(sum);
    }
}
