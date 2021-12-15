public class Cell {
    private final int position;
    private Move move = new DefaultMove();

    public Cell(int position) {
        this.position = position;
    }

    public Cell(int position, Move move) {
        this.position = position;
        this.move = move;
    }


    public int getPosition() {
        return position;
    }

    public int nextPosition() {
        int nextPosition = move.getNextPosition();
        if (nextPosition == 0) {
            return position;
        }
        return nextPosition;
    }
