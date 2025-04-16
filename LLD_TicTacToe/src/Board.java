public class Board {
    private symbol[][] grid;
    private int size;

    // Default constructor for 3x3 board
    public Board() {
        this(3);  // delegate to the other constructor
    }

    // Constructor for custom n x n board
    public Board(int n) {
        this.size = n;
        grid = new symbol[n][n];

        // Initialize all cells to EMPTY
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = symbol.EMPTY;
            }
        }
    }
    public boolean isCellEmpty(int x, int y) {
        return grid[x][y] == symbol.EMPTY;
    }

    public void setCell(int x, int y, symbol s) {
        grid[x][y] = s;
    }

    // Utility method to print the board
    public int getSize() {
        return this.size;
    }

    public symbol[][] getGrid() {
        return grid;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
