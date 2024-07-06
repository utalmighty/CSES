package com.Google.Utkarsh;


public class ChessboardAndQueen {

    public static void main(String[] args) {

        String s = "...**...\n" + //
                        "......*.\n" + //
                        "*....*..\n" + //
                        "...*...*\n" + //
                        "....**.*\n" + //
                        "..*.....\n" + //
                        ".......*\n" + //
                        "...*....\n" + //
                        "";

        byte[][] board = getBoard(s);
        boolean[] colArray = new boolean[8];
        System.out.println(f(board, colArray, 8-1));
    }

    private static byte[][] getBoard(String s) {
        String[] arr = s.split("\n");
        byte[][] board = new byte[8][];
        for (int i=0; i<8; i++) {
            board[i] = getRow(arr[i]);
        }
        return board;
    }

    private static byte[] getRow(String s) {
        byte[] row = new byte[8];
        for(int i=0; i<8; i++) {
            if (s.charAt(i) == '*') row[i] = 2;
            else row[i] = 0;
        }
        return row;
    }
    

    private static int f(byte[][] board, boolean[] colArray, int queen) {
        if (queen < 0) return 1;
        int cnt = 0;
        for (int col=0; col<8; col++) {
            if (canGo(board, colArray, queen, col)){
                colArray[col] = true;
                board[queen][col] = 1;
                cnt += f(board, colArray, queen-1);
                colArray[col] = false;
                board[queen][col] = 0;
            }
        }
        return cnt;
    }

    private static boolean canGo(byte[][] board, boolean[] colArray, int row, int col) {
        if (colArray[col] == true) return false; // attacking queen col
        if (board[row][col] == 2) return false; // blocked
        int r = row - 1;
        int c = col - 1;
        while (isValidCell(r, c))
            if (board[r--][c--] == 1) return false;
        r = row + 1;
        c = col + 1;
        while (isValidCell(r, c))
            if (board[r++][c++] == 1) return false;
        r = row - 1;
        c = col + 1;
        while (isValidCell(r, c))
            if (board[r--][c++] == 1) return false;
        r = row + 1;
        c = col - 1;
        while (isValidCell(r, c))
            if (board[r++][c--] == 1) return false;
        return true;
        
    }

    private static boolean isValidCell(int row, int col) {
        return row>=0 && row<8 && col>=0 && col<8;
    }
}
