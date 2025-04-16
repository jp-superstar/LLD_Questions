public interface Player {
    symbol getSignature();  // Symbol is your enum type
    void move(Board board);
}
