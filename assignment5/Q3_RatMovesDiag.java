package CFC.Java.assignment5;

import java.util.ArrayList;

public class Q3_RatMovesDiag {
    public static void main(String[] args) {
        int n = 3;
        int[][] board = new int[n][n];
        ArrayList<String> moves = new ArrayList<String>();
        getRatMovesD(board, 0, 0, "",moves);
        System.out.println(moves.toString());
    }

    private static ArrayList<String> getRatMovesD(int[][] board, int row, int col, String solution,ArrayList<String> moves) {
        if(row>board.length-1 || col>board.length-1){
            return moves;
        }
        if(row==board.length-1 && col==board.length-1){
            moves.add(solution);
            return moves;
        }
        if(board[row][col]==1){
            return moves;
        }
        board[row][col]=1;
        getRatMovesD(board,row,col+1,solution+"H",moves);
        getRatMovesD(board,row+1,col+1,solution+"D",moves);
        getRatMovesD(board,row+1,col,solution+"V",moves);
        board[row][col]=0;
        return moves;
    }

}