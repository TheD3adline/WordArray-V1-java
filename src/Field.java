/*
    Author: Michael Fessler
    Date: 2022/12/7
    Version: 0.1
    Description:
            The custom data type for the individual fields with characters.
 */
public class Field {

    private char letter;

    public Field(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }
}