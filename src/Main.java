/*
    Author: Michael Fessler
    Date: 2022/12/7
    Version: 0.1
    Description:
            App to read input and search 2d array of characters for it.
 */
public class Main {
    public static void main(String[] args) {

        char[][] letters = {{'U', 'L', 'O', 'P', 'H'},
                            {'I', 'F', 'A', 'O', 'C'},
                            {'H', 'A', 'L', 'L', 'O'},
                            {'X', 'Q', 'W', 'F', 'I'},
                            {'V', 'I', 'R', 'Q', 'T'}};

        Board board = new Board(letters);

        board.searchField(board.getFields(), board.getWord());
    }
}