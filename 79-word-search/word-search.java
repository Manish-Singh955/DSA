class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j)) return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] b, String w, int idx, int x, int y) {
        if (idx == w.length()) return true;
        if (x < 0 || y < 0 || x >= b.length || y >= b[0].length || b[x][y] != w.charAt(idx)) return false;
        char temp = b[x][y];
        b[x][y] = '#';
        boolean found = dfs(b, w, idx + 1, x + 1, y) ||
                        dfs(b, w, idx + 1, x - 1, y) ||
                        dfs(b, w, idx + 1, x, y + 1) ||
                        dfs(b, w, idx + 1, x, y - 1);
        b[x][y] = temp;
        return found;
    }
}
