public class Main {
    public static void main(String[] args) {

        char[][] letters = {{'U', 'L', 'O', 'P', 'H'},
                            {'I', 'F', 'A', 'O', 'C'},
                            {'H', 'A', 'L', 'L', 'O'},
                            {'X', 'Q', 'W', 'F', 'I'},
                            {'V', 'I', 'R', 'Q', 'T'}};
        char[] word;

        Board board = new Board(letters);

        word = board.getWord();

        board.searchField(board.getFields(), word);
    }
}