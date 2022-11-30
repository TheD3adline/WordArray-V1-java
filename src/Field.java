public class Field {

    private boolean occupied = false;
    private char letter = ' ';

    public Field(char letter) {
        this.letter = letter;
        this.occupied = true;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }
}
