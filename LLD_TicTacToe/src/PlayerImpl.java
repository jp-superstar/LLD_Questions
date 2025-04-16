public class PlayerImpl implements Player {
    private final symbol signature;
    private final PlayStrategy strategy;

    public PlayerImpl(symbol s, PlayStrategy strategy) {
        this.signature = s;
        this.strategy = strategy;
    }

    @Override
    public symbol getSignature() {
        return signature;
    }
    public void move(Board board) {
        Coordinate coord = strategy.makeMove(board, signature);
        int x = coord.x, y = coord.y;;
        if (board.isCellEmpty(x, y)) {
            board.setCell(x, y, signature);
            System.out.println("Player " + signature + " placed at (" + x + ", " + y + ")");
        } else {
            System.out.println("Cell (" + x + ", " + y + ") is already occupied!");
        }
    }

}
