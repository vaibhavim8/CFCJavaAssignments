package CFC.Java.assignment3;

public class Q5_ClockWise {
    public static void main(String[] args) {
        int[][] arrayInput={{11 ,12, 13, 14},
                {21 ,22, 23, 24},
                {31 ,32 ,33, 34},
                {41, 42, 43, 44}};
        printClockwise(arrayInput);
    }

    private static void printClockwise(int[][] arrayInput) {
        for (int row = 0; row < arrayInput.length/2; row++) {
            int length=arrayInput.length-row-1;
            for (int j = row; j < length; j++) {
                System.out.print(arrayInput[row][j]+",");
            }
            for (int i = row; i < length ; i++) {
                System.out.print(arrayInput[i][length]+",");
            }
            for (int i = length; i >row ; i--) {
                System.out.print(arrayInput[length][i]+",");
            }
            for (int i = length; i >row ; i--) {
                System.out.print(arrayInput[i][row]+",");
            }
        }
    }
}
