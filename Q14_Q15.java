package CFC.Java.assignment2;

import java.util.ArrayList;
import java.util.Arrays;

public class Q14_Q15 {
    public static void main(String[] args) {
        int[] arr={3,1,2,9,7,5,-1,6};
        int target=9;
       // checkPairSumInArray(arr,target);
        checkTripleSumInArray(arr,target);
    }

    private static void checkTripleSumInArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        int[] array={arr[i],arr[j],arr[k]};
                        System.out.println(Arrays.toString(array));
                    }
                }
            }
        }
    }

    private static void checkPairSumInArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    int[] array={arr[i],arr[j]};
                    System.out.println(Arrays.toString(array));
                }
            }

        }
    }
}
