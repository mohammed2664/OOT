package A5.code;

public class BoardLogic {

    private final char[][] grid;
    private final Player playerX;
    private final Player playerO;
    private Player currentPlayer;
    private int movesCount;

    public BoardLogic() {
        this.grid = new char[3][3];
        this.playerX = new HumanPlayer("Player 1", 'X');
        this.playerO = new HumanPlayer("Player 2", 'O');
        resetBoard();
    }

    public final void resetBoard() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                grid[r][c] = ' ';
            }
        }
        this.currentPlayer = playerX;
        this.movesCount = 0;
    }

    public boolean makeMove(int row, int col) {
        if (grid[row][col] != ' ') {
            return false;
        }
        grid[row][col] = currentPlayer.getSymbol();
        movesCount++;
        return true;
    }

    public boolean checkWin() {
        char sym = currentPlayer.getSymbol();

        for (int i = 0; i < 3; i++) {
            if (grid[i][0] == sym && grid[i][1] == sym && grid[i][2] == sym) return true;
            if (grid[0][i] == sym && grid[1][i] == sym && grid[2][i] == sym) return true;
        }

        if (grid[0][0] == sym && grid[1][1] == sym && grid[2][2] == sym) return true;
        return grid[0][2] == sym && grid[1][1] == sym && grid[2][0] == sym;
    }

    public boolean isDraw() {
        return movesCount == 9;
    }

    public void switchTurn() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}