package CFC.Java.assignment5;

import java.util.ArrayList;

public class Q6_KeypadPermute {
    public static void main(String[] args) {
        String str="123";
  //      getKeypadPermute(str,"");
   //     System.out.println(getKeypadPermuteCount(str,""));
        ArrayList<String> listComb=new ArrayList<String>();
        System.out.println(getKeypadPermuteArr(str,"",listComb).toString());
    }

    private static void getKeypadPermute(String str, String emp) {
        if(str.isEmpty()){
            System.out.println(emp);
            return;
        }
        char ch=str.charAt(0);
        int t=Integer.parseInt(String.valueOf(ch));
        for (int i = 3*(t-1); i < 3*t; i++) {
            getKeypadPermute(str.substring(1),emp+(char)(i+'a'));
        }
    }
    private static int getKeypadPermuteCount(String str, String emp) {
        int count=0;
        if(str.isEmpty()){
            return count+1 ;
        }
        char ch=str.charAt(0);
        int t=Integer.parseInt(String.valueOf(ch));
        for (int i = 3*(t-1); i < 3*t; i++) {
            count=count+getKeypadPermuteCount(str.substring(1),emp+(char)(i+'a'));
        }
        return count;
    }
    private static ArrayList<String> getKeypadPermuteArr(String str, String emp,ArrayList<String> listComb) {
        if(str.isEmpty()){
            listComb.add(emp);
            return listComb ;
        }
        char ch=str.charAt(0);
        int t=Integer.parseInt(String.valueOf(ch));
        for (int i = 3*(t-1); i < 3*t; i++) {
            getKeypadPermuteArr(str.substring(1),emp+(char)(i+'a'),listComb);
        }
        return listComb;
    }
}
