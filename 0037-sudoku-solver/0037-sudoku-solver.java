class Solution {

    public boolean issafe(char[][] board, int r, int c, char z) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == z) {
                return false;
            }
        }
        for (int j = 0; j < 9; j++) {
            if (board[j][c] == z) {
                return false;
            }
        }

        int r1 = (r / 3) * 3;
        int c1 = (c / 3) * 3;

        for (int i = r1; i <= r1 + 2; i++) {
            for (int j = c1; j <= c1 + 2; j++) {
                if (board[i][j] == z) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean ans(char[][] board, int r, int c) {
        if (r == 9) {
            return true;
        }

        int nr = r;
        int nc = c + 1;

        if (nc == 9) {
            nr = r + 1;
            nc = 0;
        }
        if (board[r][c] != '.') {
            return ans(board, nr, nc);
        }

        for (char ch = '1'; ch <= '9'; ch++) {
            if (issafe(board, r, c, ch)) {

                board[r][c] = ch;

                if (ans(board, nr, nc))
                    return true;

                board[r][c] = '.';
            }
        }
        return false;
    }

    public void solveSudoku(char[][] board) {
        ans(board, 0, 0);
    }
}