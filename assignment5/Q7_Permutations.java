package CFC.Java.assignment5;

import java.util.ArrayList;

public class Q7_Permutations {
    public static void main(String[] args) {
        String str="abc";
        //permute(str,"");
//        ArrayList<String> result=new ArrayList<String>();
//        permuteArr(str,result,"");
//        System.out.println(result.toString());
        System.out.println(permuteCount(str,""));

    }

    private static void permute(String str, String emp) {
        if(str.length()==0){
            System.out.println(emp);
            return;
        }
        char ch=str.charAt(0);
        str=str.substring(1);
        for (int i = 0; i <= emp.length(); i++) {
            String first=emp.substring(0,i);
            String second=emp.substring(i);
            permute(str,first+ch+second);
        }
    }
    private static ArrayList<String> permuteArr(String str, ArrayList<String> res,String emp) {
        if(str.length()==0){
            res.add(emp);
            return res;
        }
        char ch=str.charAt(0);
        str=str.substring(1);
        for (int i = 0; i <= emp.length(); i++) {
            String first=emp.substring(0,i);
            String second=emp.substring(i);
            permuteArr(str,res,first+ch+second);
        }
        return res;
    }
    private static int permuteCount(String str,String emp) {
        int count=0;
        if(str.length()==0){
            return count+1;
        }

        char ch=str.charAt(0);
        str=str.substring(1);
        for (int i = 0; i <= emp.length(); i++) {
            String first=emp.substring(0,i);
            String second=emp.substring(i);
            count=count+permuteCount(str,first+ch+second);
        }
        return count;
    }

}
