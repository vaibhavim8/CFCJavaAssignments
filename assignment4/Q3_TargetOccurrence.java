package CFC.Java.assignment4;

public class Q3_TargetOccurrence {
    public static void main(String[] args) {
        int[] arr={9,2,1,8,6,1,3};
        int target=5;
        int ind=indexInArray(arr,target,arr.length-1);
        System.out.println(ind);
    }

    private static int indexInArray(int[] arr,int target,int end) {
        if(end<0){
            return -1;
        }
        if(arr[end]==target){
            return end;
        }
        return indexInArray(arr,target,end-1);
    }

}
