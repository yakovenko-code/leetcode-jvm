package code.yakovenko.leetcode.java.easy;

public final class P3210FindTheEncryptedString {

	public String getEncryptedString(String s, int k) {
		return s.substring(k % s.length()) + s.substring(0, k % s.length());
	}
}
