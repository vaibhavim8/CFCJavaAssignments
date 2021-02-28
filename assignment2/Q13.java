package CFC.Java.assignment2;

import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {
        int[] arr={4,7,2,1,6,3,9};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int t=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
        System.out.println(Arrays.toString(arr));
    }


}
