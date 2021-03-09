package CFC.Java.assignment3;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8_CommonEle {
    public static void main(String[] args) {
        int[] array1={1,2,3,1,2,4,1};
        int[] array2={2,1,3,1,5,2,2};
        intersectionArr(array1,array2);
    }

    private static void intersectionArr(int[] array1, int[] array2) {
        ArrayList<Integer> res=new ArrayList<Integer>();
         array1=sortArray(array1);
         array2=sortArray(array2);
     //   System.out.println(Arrays.toString(array1));
       // System.out.println(Arrays.toString(array2));
         int i=0;int j=0;
         while(i<array1.length && j<array2.length){
             if(array1[i]==array2[j]){
                 res.add(array1[i]);
                 i++;
                 j++;
             }
             else if(array1[i]<array2[j]){
                 i++;
             }
             else {
                 j++;
             }
         }
        System.out.println(res.toString());
    }

    private static int[] sortArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j >0; j--) {
                if(array[j-1]>array[j]){
                    int t=array[j-1];
                    array[j-1]=array[j];
                    array[j]=t;
                }
                else {
                    break;
                }
            }
        }
        return array;
    }
}
