package code.yakovenko.leetcode.java.easy;

public final class P0171ExcelSheetColumnTitle {

	public String convertToTitle(int columnNumber) {
		final StringBuilder stringBuilder = new StringBuilder();

		while (columnNumber != 0) {
			columnNumber--;
			stringBuilder.append((char) ('A' + columnNumber % 26));
			columnNumber /= 26;
		}

		return stringBuilder.reverse().toString();
	}
}
