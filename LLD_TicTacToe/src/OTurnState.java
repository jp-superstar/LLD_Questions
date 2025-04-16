public class OTurnState implements GameState {
    @Override
    public void play(TicTacToeGame game) {
        Player playerO = game.getPlayerO();
        playerO.move(game.getBoard());

        if (game.checkWinner(symbol.O)) {
            System.out.println("Player O wins!");
            game.getBoard().printBoard();
            game.setGameOver(true);
        } else {
            game.setState(new XTurnState());
        }
    }
}