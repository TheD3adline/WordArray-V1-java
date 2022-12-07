import java.util.Scanner;

public class Board {

    private Field[][] fields;
    final int[] x = {-1, -1, -1, 0, 0, 1, 1, 1};
    final int[] y = {-1, 0, 1, -1, 1, -1, 0, 1};

    Scanner sc = new Scanner(System.in);

    public Board(char[][] givenLetters) {
        fields = new Field[givenLetters.length][givenLetters[0].length];
        for(int y = 0; y < fields.length; y++) {
            for(int x = 0; x < fields[0].length; x++) {
                fields[y][x] = new Field(givenLetters[y][x]);
            }
        }
    }

    public boolean searchWord(Field[][] field, char[] word, int row, int col) {
        if(field[row][col].getLetter() != word[0])
            return false;

        int len = word.length;

        for(int dir = 0; dir < 8; dir++) {
            int k, rd = row + x[dir], cd = col + y[dir];

            for(k = 1; k < len; k++) {
                if(rd >= field.length || rd < 0 || cd >= field[0].length || cd < 0)
                    break;
                if(field[rd][cd].getLetter() != word[k])
                    break;

                rd += x[dir];
                cd += y[dir];
            }
            if(k == len)
                return true;
        }
        return false;
    }

    public void searchField(Field[][] field, char[] word) {
        for(int row = 0; row < field.length; row++)
            for(int col = 0; col < field[0].length; col++)
                if(field[row][col].getLetter() == word[0] && searchWord(field, word, row, col)) {
                    System.out.println("Word found at " + "\u001B[36m" + row + ", " + col + "\u001B[0m");
                }

    }

    public char[] getWord() {
        String word = UserInput.getUserInput();
        int lengthOfWord = 0;
        for(int i = 0; i < 6; i++) {
            if(word.charAt(i) != '\n') {
                lengthOfWord++;
            } else if(word.charAt(i) == '\n') {
                break;
            }
        }
        char[] wordArr = new char[lengthOfWord];
        for(int i = 0; i < lengthOfWord; i++) {
            wordArr[i] = word.charAt(i);
        }
        System.out.print("Searching for input " + "\u001B[36m" + word + "\u001B[0m");
        return wordArr;
    }

    public Field[][] getFields() {
        return fields;
    }
}
