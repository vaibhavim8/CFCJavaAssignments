package CFC.Java.assignment4;

public class Q10_CountTwin {
    public static void main(String[] args) {
        String str="AxAxxA";
        int count=countTwin(str,0);
        System.out.println(count);
    }

    private static int countTwin(String unproc, int count) {
        if(unproc.isEmpty()){
            return count;
        }
        if(unproc.length()>2){
            char first=unproc.charAt(0);
            char second=unproc.charAt(1);
            char third=unproc.charAt(2);
            if(first==third && first!=second) {
                return countTwin(unproc.substring(1), count + 1);
            }
        }
        return countTwin(unproc.substring(1),count);

    }
}
