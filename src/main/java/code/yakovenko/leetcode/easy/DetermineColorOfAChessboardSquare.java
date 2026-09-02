package code.yakovenko.leetcode.easy;

public final class DetermineColorOfAChessboardSquare {

	public boolean squareIsWhite(String coordinates) {
		return ((coordinates.charAt(0) - 'a' + 1) + (coordinates.charAt(1) - '0')) % 2 != 0;
	}
}
