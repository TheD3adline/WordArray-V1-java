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