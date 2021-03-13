package CFC.Java.assignment5;

import java.util.Arrays;

public class Q4_RatMaze {
    public static void main(String[] args) {
        int n=5,m=4;
        int[][] grid=new int[n][m];
        int[][] blocked={{0,1},{1,3},{2,2},{3,0},{4,0},{4,1}};
        for (int i = 0; i < blocked.length; i++) {
            grid[blocked[i][0]][blocked[i][1]]=1;
        }
  //      System.out.println(Arrays.deepToString(grid));
        ratPath(grid,1,1,n-1,m-1);

    }

    private static void ratPath(int[][] grid, int cRow, int cCol, int nRow, int nCol) {
        if(cRow>nRow || cCol>nCol){
            return;
        }
        if(cRow==nRow && cCol==nCol){
            grid[cRow][cCol]=1;
            System.out.println(Arrays.deepToString(grid));
            return;
        }
        if(grid[cRow][cCol]==1){
            return;
        }
        grid[cRow][cCol]=1;
        if(cCol<nCol && grid[cRow][cCol+1]==0){
                ratPath(grid,cRow,cCol+1,nRow,nCol);
        }
        ratPath(grid,cRow+1,cCol,nRow,nCol);
        //grid[cRow][cCol]=0;


    }
}
