public class AIPlayerFactory implements PlayerAbstractFactory {
    private final symbol symbol;

    public AIPlayerFactory(symbol symbol) {
        this.symbol = symbol;
    }

    @Override
    public Player createPlayer() {
        return new PlayerImpl(symbol,  new AIStyle());
    }
}
