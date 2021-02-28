package CFC.Java.assignment4;

public class Q2_ReturnSum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOf1ToN(n));
    }

    private static int sumOf1ToN(int n) {
        if(n==1){
            return 1;
        }
        return n+sumOf1ToN(n-1);
    }


}
