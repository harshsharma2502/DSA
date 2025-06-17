class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows[][] = new int[9][9];
        int cols[][] = new int [9][9];
        int box[][] = new int[9][9];

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                if(board[r][c] == '.') continue;

                int val = board[r][c] - '1';
                if(rows[r][val] == 1) return false;
                rows[r][val] = 1;

                if(cols[val][c] == 1) return false;
                cols[val][c] = 1;

                int boxIdx = 3 * (r/3) + (c/3);
                if(box[boxIdx][val] == 1) return false;
                box[boxIdx][val] = 1;
            }
        }
        return true;
    }
}