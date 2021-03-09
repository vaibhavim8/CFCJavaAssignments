package CFC.Java.assignment3;

import java.util.Arrays;

public class QLC_D {
    public static void main(String[] args) {
        int n=2;
        int m=3;
        int[][] indices={{0,1},{1,1}};
        int count=oddCells(n,m,indices);

    }
    public static int oddCells(int n, int m, int[][] indices) {
        int oddCount=0;
        int[][] matrix=new int[n][m];
        for(int i=0;i<indices.length;i++){
            int row=indices[i][0];
            int col=indices[i][1];
            for(int j=0;j<matrix.length;j++){
                for (int k = 0; k < matrix[j].length ; k++) {
                    if(j==row){
                        matrix[j][k]=matrix[j][k]+1;
                    }
                    if(k==col){
                        matrix[j][k]=matrix[j][k]+1;
                    }
                   
                    else if(matrix[j][k]!=0 && matrix[j][k]%2!=0 && oddCount>=0){
                        oddCount++;
                    }
                }

            }
        }
        System.out.println(Arrays.deepToString(matrix));
        return oddCount;
    }
}
