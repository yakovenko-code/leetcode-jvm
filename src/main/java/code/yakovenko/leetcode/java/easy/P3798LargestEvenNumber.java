package code.yakovenko.leetcode.java.easy;

public final class P3798LargestEvenNumber {

	public String largestEven(String s) {
		return s.substring(0, s.lastIndexOf('2') + 1);
	}
}
