package CFC.Java.assignment3;

import java.util.ArrayList;

public class Q7_SubGroup {
    public static void main(String[] args) {
        int[] mma={5,4,3,1,1};
        int k=3;
        findSubGroups(mma,k);
    }

    private static void findSubGroups(int[] mma, int k) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        res.add(mma[0]);
        for (int i = 0; i < mma.length; i++) {
            if(!res.isEmpty() && res.get(0)<mma[i]){
                res.add(0,mma[i]);
                if(res.size()>k){
                    res.remove(k);
                }

            }
            else if(res.get(0)>mma[i] && res.size()<k && !res.isEmpty()){
                res.add(mma[i]);
            }

        }
        System.out.println(res.toString());
    }
}
