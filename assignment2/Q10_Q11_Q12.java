package CFC.Java.assignment2;

import java.util.Arrays;

public class Q10_Q11_Q12 {
    public static void main(String[] args) {
        int[] arr={3,8,5,13,6};
       // int[] arr={0,1,0,0,0,1,1,0,1,0,1};
        //boolean result=checkSorted(arr,arr.length);
        //System.out.println(result);
       //sortArray(arr);
      sortOddEvenArray(arr);


    }

    private static void sortOddEvenArray(int[] arr) {
            int indexeven=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                int t=arr[i];
                arr[i]=arr[indexeven];
                arr[indexeven]=t;
                indexeven++;
            }
        }
        System.out.println(Arrays.toString(arr));

        }


    private static void sortArray(int[] arr) {

        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                int t=arr[i];
                arr[i]=arr[index];
                arr[index]=t;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    private static int countZeros(int[] arr) {
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]==0){
//                count++;
//            }
//
//        }
//        return count;
//    }

    private static boolean checkSorted(int[] arr, int length) {
        if(length==0||length==1){
            return true;
        }
        if(arr[length-1]<arr[length-2]){
            return false;
        }
        return checkSorted(arr,length-1);
    }


}
