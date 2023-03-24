package code.y2021.m12;

public class P794 {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i].charAt(j) == 'X') {
                    xCount++;
                } else if (board[i].charAt(j) == 'O') {
                    oCount++;
                }
            }
        }
        if (xCount > oCount + 1 || xCount < oCount) {
            return false;
        }
        if (win(board, 'X') && xCount != oCount + 1) {
            return false;
        }
        if (win(board, 'O') && xCount != oCount) {
            return false;
        }
        return true;
    }
    private boolean win(String[] board, char chess) {
        for (int i = 0; i < 3; i++) {
            if (board[i].charAt(0) == chess && board[i].charAt(1) == chess && board[i].charAt(2) == chess) {
                return true;
            }
            if (board[0].charAt(i) == chess && board[1].charAt(i) == chess && board[2].charAt(i) == chess) {
                return true;
            }
        }

        if (board[0].charAt(0) == chess && board[1].charAt(1) == chess && board[2].charAt(2) == chess) {
            return true;
        }
        if (board[0].charAt(2) == chess && board[1].charAt(1) == chess && board[2].charAt(0) == chess) {
            return true;
        }
        return false;
    }
}
