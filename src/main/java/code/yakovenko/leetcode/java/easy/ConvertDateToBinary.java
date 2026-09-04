package code.yakovenko.leetcode.java.easy;

public final class ConvertDateToBinary {

	public String convertDateToBinary(String date) {

		String stringBuilder = Integer.toBinaryString(Integer.parseInt(date.substring(0, 4))) +
				'-' +
				Integer.toBinaryString(Integer.parseInt(date.substring(5, 7))) +
				'-' +
				Integer.toBinaryString(Integer.parseInt(date.substring(8, 10)));

		return stringBuilder;
	}
}
