package org.yangjie.com.Leetcode;

public class IsValidSudoku {

	public static void main(String[] args) {
		char[][] board = {
				{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}
				};
		
		IsValidSudoku i= new IsValidSudoku();
		System.out.println(i.isValidSudoku(board));

	}

	public boolean isValidSudoku(char[][] board) {
		byte[][] row = new byte[9][9];
		byte[][] col = new byte[9][9];
		byte[][] rec = new byte[9][9];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				int index = board[i][j] - '1';
				if (index >= 0 && index <= 9) {
					if (row[i][index] != 0)
						return false;
					else
						row[i][index] = 1;
					if (col[j][index] != 0)
						return false;
					else
						col[j][index] = 1;
					int pos = i / 3 * 3 + j / 3;
					if (rec[pos][index] != 0)
						return false;
					else
						rec[pos][index] = 1;
				}
			}
		}
		return true;
	}

}
