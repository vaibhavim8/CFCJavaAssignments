package CFC.Java.assignment3;

public class Q13_PerfectStr {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("abbbbaaaa");
        int k=2;
        int countPerfectness=0;
        countPerfectness=getCount(str,k,countPerfectness);
        System.out.println(countPerfectness);
    }

    private static int getCount(StringBuilder str, int k,int countPerfectness) {
        int counta=0;
        int countb=0;
        int start=0;
        for (int i = 0; i < str.length(); i++) {
            int len=start+i+1;
            if(str.charAt(i)=='a'){
                counta++;
            }
            else {
                countb++;
            }
            if(len-Math.max(counta,countb)<=k){
                countPerfectness++;
            }
            else {
                if(str.charAt(start)=='a'){
                    counta--;
                }
                else {
                    countb--;
                }
                start++;

            }
        }
        return countPerfectness;
    }
}
