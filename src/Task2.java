
public class Task2 {
	private static final char EMPTY = ' ';
	private char[][] board;

	public Task2(char[][] board) {
		this.board = board;
	}

	public boolean checkColumns() {
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < board[i].length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == EMPTY)
					break;
				if (board[i][j] == 'X') {
					countX++;
					if (countX == 3)
						return true;
				}
				if (board[i][j] == 'O') {
					countO++;
					if (countO == 3)
						return true;
				}
			}
		}
		return false;
	}

	public boolean checkRows() {
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == EMPTY)
					break;
				if (board[i][j] == 'X') {
					countX++;
					if (countX == 3)
						return true;
				}
				if (board[i][j] == 'O') {
					countO++;
					if (countO == 3)
						return true;
				}
			}
		}
		return false;
	}

	public boolean checkDiagonals() {
		if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'))
			return true;
		if ((board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
			return true;
		return false;
	}
}
