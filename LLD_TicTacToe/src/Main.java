public class Main {
    public static void main(String[] args) {
        PlayerAbstractFactory factoryX = new AIPlayerFactory(symbol.X);
        PlayerAbstractFactory factoryO = new AIPlayerFactory(symbol.O);

        Player playerX = factoryX.createPlayer();
        Player playerO = factoryO.createPlayer();

        TicTacToeGame game = new TicTacToeGame(playerX, playerO);

        game.playGame(); // or use while loop if you didn't add playGame()
    }
}
