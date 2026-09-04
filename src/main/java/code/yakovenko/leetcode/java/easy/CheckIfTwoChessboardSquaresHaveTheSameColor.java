package code.yakovenko.leetcode.java.easy;

public final class CheckIfTwoChessboardSquaresHaveTheSameColor {

	public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
		final int color1 = ((coordinate1.charAt(0) - 'a' + 1) + (coordinate1.charAt(1) - '0')) % 2;
		final int color2 = ((coordinate2.charAt(0) - 'a' + 1) + (coordinate2.charAt(1) - '0')) % 2;

		return color1 == color2;
	}
}
