public class BoardUtils {
    public static boolean checkWin(Board board, symbol symbol) {
        int n = board.getSize();
        symbol[][] grid = board.getGrid();

        // Check rows and columns
        for (int i = 0; i < n; i++) {
            if (checkLine(grid[i], symbol)) return true;
            if (checkColumn(grid, i, symbol)) return true;
        }

        // Check diagonals
        return checkDiagonal(grid, symbol) || checkAntiDiagonal(grid, symbol);
    }

    private static boolean checkLine(symbol[] row, symbol symbol) {
        for (symbol s : row) if (s != symbol) return false;
        return true;
    }

    private static boolean checkColumn(symbol[][] grid, int col, symbol symbol) {
        for (symbol[] row : grid) if (row[col] != symbol) return false;
        return true;
    }

    private static boolean checkDiagonal(symbol[][] grid, symbol symbol) {
        for (int i = 0; i < grid.length; i++) if (grid[i][i] != symbol) return false;
        return true;
    }

    private static boolean checkAntiDiagonal(symbol[][] grid, symbol symbol) {
        int n = grid.length;
        for (int i = 0; i < n; i++) if (grid[i][n - 1 - i] != symbol) return false;
        return true;
    }
}
