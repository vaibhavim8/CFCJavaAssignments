package CFC.Java.assignment3;

public class Q3_Pattern {
    public static void main(String[] args) {
        int n=5;
        printPattern(n);
    }

    private static void printPattern(int n) {
        int row=0;
        int mirr=n/2;
        while(row<n){
            int col=0;
            while (col<n){
                if((col==0 && row<mirr) || (col==n-1 && row>mirr)){
                    System.out.print("* ");
                }
                else if((row==0 && col>mirr) || (row==n-1 && col<mirr)){
                    System.out.print("* ");
                }
                else if(row==mirr || col==mirr){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
                col++;

            }
            row++;
            System.out.println();

        }

    }
}
