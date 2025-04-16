public class XTurnState implements GameState {
    @Override
    public void play(TicTacToeGame game) {
        Player playerX = game.getPlayerX();
        playerX.move(game.getBoard());

        if (game.checkWinner(symbol.X)) {
            System.out.println("Player X wins!");
            game.getBoard().printBoard();
            game.setGameOver(true);
        } else {
            game.setState(new OTurnState());
        }
    }
}