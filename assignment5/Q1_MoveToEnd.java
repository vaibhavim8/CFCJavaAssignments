package CFC.Java.assignment5;

public class Q1_MoveToEnd {
    public static void main(String[] args) {
        String str="abexexdexed";
        int count=0;
        System.out.println(movexToEnd(str,"",count));
    }

    private static String movexToEnd(String str,String emp,int cnt) {
        if(str.isEmpty()){
            if(cnt!=0){
                return movexToEnd(str,emp+'x',cnt-1);

            }
            return emp;
        }
        char ch=str.charAt(0);
        if(ch=='x'){
            cnt++;
            return movexToEnd(str.substring(1),emp,cnt);

        }
            return movexToEnd(str.substring(1),emp+ch,cnt);

    }
}
