class Solution {
    public boolean isValidSudoku(char[][] board) {
        int rows[][] = new int[9][9];
        int cols[][] = new int[9][9];
        int box[][] = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.') continue;

                int val = board[i][j] - '1';
                if(rows[i][val] == 1) return false;
                rows[i][val] = 1;

                if(cols[j][val] == 1)return false;
                cols[j][val] = 1;

                int boxIdx = (i / 3) * 3 + (j / 3);
                if(box[boxIdx][val] == 1) return false;
                box[boxIdx][val] =1;
            }
        }
        return true;
    }
}