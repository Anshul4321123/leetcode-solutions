class Solution {
 
 public static boolean  exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean[][] visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, word, i, j, 0, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean  dfs(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
        if (index == word.length()) return true;

        if (row < 0 || col < 0 || row >= board.length || col >= board[0].length 
            || visited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }

        visited[row][col] = true;

        boolean found = dfs(board, word, row - 1, col, index + 1, visited) ||
                        dfs(board, word, row + 1, col, index + 1, visited) ||
                        dfs(board, word, row, col - 1, index + 1, visited) ||
                        dfs(board, word, row, col + 1, index + 1, visited);

        visited[row][col] = false; 

        return found;
    }
}