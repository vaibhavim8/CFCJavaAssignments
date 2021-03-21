package CFC.Java.assignment5;

import java.util.ArrayList;
import java.util.Arrays;

public class Q11_KnightCombi {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board=new boolean[n][n];
        getKnightComb(board,0,0);
    }

    private static void getKnightComb(boolean[][] board, int row,int col) {
        if(row==board.length){
            System.out.println(Arrays.deepToString(board));
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if(col<board.length && isSafe(board,row,col+i)){
                    board[row][col+i]=true;
                    getKnightComb(board,row,col+1);
                    return;
            }
            if(col<board.length){
                getKnightComb(board,row,col+1);
                return;
            }
            if(row<board.length){
                getKnightComb(board,row+1,0);
                return;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(row>1 && col<board.length-1 && board[row-2][col+1]==true){
                return false;
            }

        if(row>1 && col>0 && board[row-2][col-1]==true){
            return false;
        }
        if(row>0 && col>1 && board[row-1][col-2]==true){
                return false;
        }
        if(row>0 && col<board.length-2 &&  board[row-1][col+2]==true){
            return false;
        }
        if(row<board.length-2 && col<board.length-1 && board[row+2][col+1]==true){
                return false;
        }
        if(row<board.length-2 && col>0 && board[row+2][col-1]==true){
            return false;
        }
        if(row<board.length-1 && col>1 && board[row+1][col-2]==true ){
                return false;
        }
        if(row<board.length-1 && col<board.length-2 && board[row+1][col+2]==true){
            return false;
        }
        return true;


    }


}
