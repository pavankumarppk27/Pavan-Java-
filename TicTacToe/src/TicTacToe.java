import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {
	
		static int size = 5;
		static int limit = 3;
		static int[][] board = new int[size][size];
		final static int X = 1;
		final static int O = 2;
		final static int EMPTY = 0;

		public static void main(String[] args) throws IOException {
			play();
		}

		public static void play() throws IOException {

			Scanner scanner = new Scanner(System.in);
			String[] symbols = { "x", "o" };
			String player1 = null;
			String player1Symbol = null;
			String player2 = null;
			String player2Symbol = null;
			String firstTurnPlayer = null;
			String secondTurnPlayer = null;
			String tossWinner = null;
			int playerChange = 1;
			String playerTurn = null;
			boolean isWin = false;
			String tossWinnerSymbol = null;
			System.out.println("Enter player1 name:");
			player1 = scanner.next();
			System.out.println("Enter player2 name:");
			player2 = scanner.next();
			tossWinner = getFirstPlayer(player1, player2);
			System.out.println(tossWinner);
			while (true) {
				System.out.println("Toss Winner " + tossWinner + " Select symbol 'X' or 'O' ");
				tossWinnerSymbol = scanner.next();
				if (tossWinnerSymbol.equalsIgnoreCase("X") || tossWinnerSymbol.equalsIgnoreCase("O")) {
					break;
				}
			}
			if (tossWinner.equals(player1)) {
				player1Symbol = tossWinnerSymbol;
				player2Symbol = tossWinnerSymbol.equalsIgnoreCase("X") ? "O" : "X";
			} else {
				player2Symbol = tossWinnerSymbol;
				player1Symbol = tossWinnerSymbol.equalsIgnoreCase("X") ? "O" : "X";
			}

			System.out.println(player1 + ":" + player1Symbol);
			System.out.println(player2 + ":" + player2Symbol);
			if (player1.equals(tossWinner)) {
				firstTurnPlayer = player1;
				secondTurnPlayer = player2;
				System.out.println("First turn to :" + player1);
			} else {
				firstTurnPlayer = player2;
				secondTurnPlayer = player1;
				System.out.println("First turn to :" + player2);
			}

			while (true) {
				int position1;
				int position2;
				if (playerChange == 1) {
					playerTurn = firstTurnPlayer;
				} else {
					playerTurn = secondTurnPlayer;
				}
				while (true) {
					System.out.println(playerTurn + " Enter position");
					position1 = scanner.nextInt();
					position2 = scanner.nextInt();
					if (position1 <= size - 1 && position2 <= size - 1) {
						break;
					}
				}
				if (board[position1][position2] == 0) {
					if (playerTurn.equals(firstTurnPlayer)) {
						board[position1][position2] = 1;
					} else {
						board[position1][position2] = 2;
					}
					System.out.println(printMatrix());
					isWin = isWin1(position1, position2);
					if (isWin) {
						System.out.println(" Congrats " + playerTurn + " You won");
						break;
					}
					if (playerChange == 1) {
						playerChange = 2;
					} else {
						playerChange = 1;
					}

				} else {
					System.out.println("Place already occupied");
				}
			}
		}

		/*
		 * public static boolean isWin(int player) { return ((board[0][0] + board[0][1]
		 * + board[0][2] == player * 3) || (board[1][0] + board[1][1] + board[1][2] ==
		 * player * 3) || (board[2][0] + board[2][1] + board[2][2] == player * 3) ||
		 * (board[0][0] + board[1][0] + board[2][0] == player * 3) || (board[0][1] +
		 * board[1][1] + board[2][1] == player * 3) || (board[0][2] + board[1][2] +
		 * board[2][2] == player * 3) || (board[0][0] + board[1][1] + board[2][2] ==
		 * player * 3) || (board[2][0] + board[1][1] + board[0][2] == player * 3)); }
		 */
//		public static boolean isWin(int row, int col, int player) {
//			boolean win = false;
//			// check row
//			if (col - 2 >= 0) {
//				win = isEqual(board[row][col - 1], board[row][col - 2], board[row][col]);
//			} else if (col + 2 <= size - 1) {
//				win = isEqual(board[row][col + 1], board[row][col + 2], board[row][col]);
//			} else {
//				win = isEqual(board[row][col + 1], board[row][col - 1], board[row][col]);
//			}
//			if (win)
//				return true;
	//
//			// check column
//			win = false;
//			if (row - 2 >= 0) {
//				win = isEqual(board[row - 1][col], board[row - 2][col], board[row][col]);
//			} else if (row + 2 <= size - 1) {
//				win = isEqual(board[row + 1][col], board[row + 2][col], board[row][col]);
//			} else {
//				win = isEqual(board[row + 1][col], board[row - 1][col], board[row][col]);
//			}
//			if (win)
//				return true;
	//
//			// check diagonal
//			win = false;
//			if ((row + 1 <= size - 1 && col + 1 <= size - 1) && (row + 2 <= size - 1 && col + 2 <= size - 1)) {
//				win = isEqual(board[row + 2][col + 2], board[row + 1][col + 1], board[row][col]);
//				return isTrue(win);
//			} else if ((row - 1 >= 0 && col - 1 >= 0) && (row - 2 >= 0 && col - 2 >= 0)) {
//				win = isEqual(board[row - 2][col - 2], board[row - 1][col - 1], board[row][col]);
//				return isTrue(win);
//			} else {
//				win = isEqual(board[row + 1][col + 1], board[row - 1][col - 1], board[row][col]);
	//
//			}
//			if (win)
//				return true;
	//
//			return false;
//		}

		public static boolean isWin1(int row, int col) {
			boolean isWin = false;

			// row check
			isWin = validateRow(row, col, col + 1, col + 2);
			if (isWin)
				return true;
			isWin = validateRow(row, col, col - 1, col - 2);
			if (isWin)
				return true;
			isWin = validateRow(row, col, col - 1, col + 2);
			if (isWin)
				return true;

			// column check
			isWin = validateCol(row, col, row + 1, row + 2);
			if (isWin)
				return true;
			isWin = validateCol(row, col, row - 1, row - 2);
			if (isWin)
				return true;
			isWin = validateCol(row, col, row - 1, row + 1);
			if (isWin)
				return true;

			// diagonal check
			isWin = validateDiagonal(row, col, row + 1, col + 2, row + 2, col + 2);
			if (isWin)
				return true;
			isWin = validateDiagonal(row, col, row - 1, col - 1, row - 2, col - 2);
			if (isWin)
				return true;
			isWin = validateDiagonal(row, col, row + 1, col + 1, row - 1, col - 1);
			if (isWin)
				return true;

			// back diagonal check
			isWin = validateBackDiagonal(row, col, row - 1, col + 1, row - 2, col + 2);
			if (isWin)
				return true;
			isWin = validateBackDiagonal(row, col, row - 1, col + 1, row + 1, col - 1);
			if (isWin)
				return true;
			isWin = validateBackDiagonal(row, col, row + 1, col - 1, row + 2, col - 2);
			if (isWin)
				return true;
			return false;
		}

		public static boolean validateRow(int row, int col, int con1, int con2) {
			boolean flag = false;
			try {
				if ((board[row][con1] == board[row][con2]) && (board[row][con1] == board[row][col])) {
					flag = true;
				}
			} catch (Exception e) {
				return false;
			}
			return flag;
		}

		public static boolean validateCol(int row, int col, int con1, int con2) {
			boolean flag = false;
			try {
				if ((board[con1][col] == board[con2][col]) && (board[con1][col] == board[row][col])) {
					flag = true;
				}
			} catch (Exception e) {
				return false;
			}
			return flag;
		}

		public static boolean validateDiagonal(int row, int col, int con1, int con2, int con3, int con4) {
			boolean flag = false;
			try {
				if ((board[con1][con2] == board[con3][con4]) && (board[con1][con2] == board[row][col])) {
					flag = true;
				}
			} catch (Exception e) {
				return false;
			}
			return flag;
		}

		public static boolean validateBackDiagonal(int row, int col, int con1, int con2, int con3, int con4) {
			boolean flag = false;
			try {
				if ((board[con1][con2] == board[con3][con4]) && (board[con1][con2] == board[row][col])) {
					flag = true;
				}
			} catch (Exception e) {
				return false;
			}
			return flag;
		}

		public static boolean isEqual(int val1, int val2, int val3) {
			boolean flag = false;
			if ((val1 == val2) && (val1 == val3)) {
				flag = true;
			}
			return flag;
		}

		public static boolean isBlank() {
			boolean flag = true;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if (board[i][j] != 0) {
						flag = false;
					}
				}
			}
			return flag;
		}

		public static String printMatrix() {
			StringBuilder s = new StringBuilder();
			boolean isEmpty = false;
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					switch (board[i][j]) {
					case X:
						s.append(" X ");
						break;
					case O:
						s.append(" O ");
						break;
					case EMPTY:
						s.append("   ");
						isEmpty = true;
						break;
					}
					if (j < size) {
						s.append("|");
					}

				}
				if (i < size - 1) {
					s.append("\n---------------------------\n");
				}
			}
			return s.toString();
		}

		public static String getFirstPlayer(String player1, String player2) throws IOException {
			String temp = null;
			while (System.in.available() == 0) {
				temp = player1;
				player1 = player2;
				player2 = temp;
			}
			return temp;

		}
	}