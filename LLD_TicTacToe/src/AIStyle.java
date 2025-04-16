import java.util.Random;

public class AIStyle implements PlayStrategy {
    private final Random random = new Random();

    @Override
    public Coordinate makeMove(Board board, symbol symbol) {
        int x, y;
        int size = board.getSize();

        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!board.isCellEmpty(x, y));

        return new Coordinate(x, y);
    }
}
