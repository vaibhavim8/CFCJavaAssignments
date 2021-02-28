package CFC.Java.assignment4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4_TargetAsArray {
    public static void main(String[] args) {
        int[] arr={0,4,2,2,1,2,3,4,2};
        int target=2;
        ArrayList<Integer> res=new ArrayList<Integer>();
        res=targetInArray(arr,target,0,res);
        int[] arrRes=new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arrRes[i]=res.get(i);
        }
        System.out.println(Arrays.toString(arrRes));
    }

    private static ArrayList<Integer> targetInArray(int[] arr, int target, int ind,ArrayList<Integer> res) {
        if(ind>arr.length-1){
            return res;
        }
        if(arr[ind]==target){
            res.add(ind);
        }
        return targetInArray(arr,target,ind+1,res);
    }


}
