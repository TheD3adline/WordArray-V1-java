import java.util.Scanner;

public class Board {

    private Field[][] fields;

    Scanner sc = new Scanner(System.in);

    public Board(char[][] givenLetters) {
        fields = new Field[5][5];
        for(int y = 0; y < fields.length; y++) {
            for(int x = 0; x < fields[0].length; y++) {
                fields[y][x] = new Field(givenLetters[y][x]);
            }
        }
    }

    public boolean searchWord(String word) {
        int wordNotFound = 0;


        for(int y = 0; y < fields.length; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                if(fields[y][x].isOccupied()) {
                    wordNotFound++;
                }
                if(word.charAt(0) == fields[y][x].getLetter()) {

                }
            }

        }

        return false;
    }
}
