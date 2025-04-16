public class TicTacToeGame {

    private Board gameBoard;

    private GameState currentState;
    private boolean isGameOver = false;
    private final Player playerX;
    private final Player playerO;

    public TicTacToeGame(Player playerX, Player playerO) {
        this.gameBoard = new Board();
        this.playerX = playerX;
        this.playerO = playerO;
        this.currentState = new XTurnState();
        this.isGameOver = false;
    }

    public Board getBoard() { return this.gameBoard; }
    public Player getPlayerX() { return this.playerX; }
    public Player getPlayerO() { return this.playerO; }
    public void setState(GameState state) { this.currentState = state; }
    public void setGameOver(boolean over) { this.isGameOver = over; }

    public boolean checkWinner(symbol symbol) {
        return BoardUtils.checkWin(gameBoard, symbol);
    }

    public void playGame() {
        while (!isGameOver) {
            currentState.play(this);
        }
        System.out.println("Game Over.");
    }
}
