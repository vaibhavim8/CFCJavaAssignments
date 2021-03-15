package CFC.Java.assignment5;

import java.util.ArrayList;

public class Q9_TargetSum {
    public static void main(String[] args) {
        int[] arr={-1,4,5,1,8,3};
        int target=4;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> targetList=new ArrayList<ArrayList<Integer>>();
        int sum=0;
        getTargetArr(arr,target,targetList,temp,sum,0);
        System.out.println(targetList.toString());

    }

    private static ArrayList<ArrayList<Integer>> getTargetArr(int[] arr, int target, ArrayList<ArrayList<Integer>> targetList,ArrayList<Integer> temp,int sum,int start)
    {
        if(start==arr.length){
            return targetList;
        }
        if(sum==target){
            ArrayList<Integer> dup= (ArrayList<Integer>) temp.clone();
            targetList.add(dup);
            return targetList;
        }
        if(sum>target){
            return targetList;
        }
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            getTargetArr(arr,target,targetList,temp,sum+arr[i],i+1);
            temp.remove(temp.size()-1);
        }
        return targetList;
    }


}
