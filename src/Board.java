import java.util.Scanner;

public class Board {

    private Field[][] fields;
    private char[] wordArr;

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

    public void getWord() {
        String word = UserInput.getUserInput();
        int lengthOfWord = 0;
        for(int i = 0; i < 6; i++) {
            if(word.charAt(i) != '\n') {
                lengthOfWord++;
            }
        }
        this.wordArr = new char[lengthOfWord];
        for(int i = 0; i <= lengthOfWord; i++) {
            this.wordArr[i] = word.charAt(i);
        }
        for(int i = 0; i < this.wordArr.length; i++) {
            System.out.print(this.wordArr[i]);
        }
    }
}
