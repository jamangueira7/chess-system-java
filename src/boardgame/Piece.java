package boardgame;

public class Piece {
    private Position position;
    private Board board;

    public Piece(Board board) {
        this.position = null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }
}
