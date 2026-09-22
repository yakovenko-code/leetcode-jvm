package code.yakovenko.leetcode.java.easy;

public final class P1550ThreeConsecutiveOdds {

	public boolean threeConsecutiveOdds(int[] arr) {
		for (int i = 2; i < arr.length; i++) {
			if ((arr[i - 2] & arr[i - 1] & arr[i] & 1) == 1) {
				return true;
			}
		}

		return false;
	}
}
