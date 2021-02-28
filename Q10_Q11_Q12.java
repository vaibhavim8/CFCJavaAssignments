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
        //this is called counting sort. Not recommended as any random 0 is put in 1st position.
        //and multiple loops are used
       /*int count= countZeros(arr);
        for (int i = 0; i < arr.length; i++) {
            if(count>0){
            arr[i]=0;
            count--;
            }
            else {
                arr[i]=1;
            }
        }
        System.out.println(Arrays.toString(arr));*/
        //This is called Stable sort. First 0 in arr will be put in 1st position. Recommended and is optimized
        //as single loop is used
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
