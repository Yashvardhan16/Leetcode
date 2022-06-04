class Solution {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> result = new ArrayList<>();
        helper(board, 0, result);

        return result;
    }

    private static void helper(char[][] board, int row, List<List<String>> result) {
        // Base Condition.
        if (row >= board.length) {
            List<String> newList = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {
                String str = new String(board[i]);
                newList.add(str);
            }

            result.add(newList);
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, row + 1, result);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        // Check Vertical.
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check Diagonal Left.
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i] == 'Q') {
                return false;
            }
        }

        // Diagonal Right.
        int maxRight = Math.min(row, board[0].length - 1 - col);

        for (int i = 1; i <= maxRight ; i++) {
            if (board[row - i][col + i] == 'Q') {
                return false;
            }
        }

        return true;
    }
}