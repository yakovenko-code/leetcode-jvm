package code.yakovenko.leetcode.java.easy;

public final class ConvertDateToBinary {

	public String convertDateToBinary(String date) {
		final StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))));
		stringBuilder.append('-');
		stringBuilder.append(Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))));
		stringBuilder.append('-');
		stringBuilder.append(Integer.toBinaryString(Integer.parseInt(date.substring(8, 10))));

		return stringBuilder.toString();
	}
}
