package code.yakovenko.leetcode.java.design;

public class GuessGame {

	private int pick;

	protected int guess(int num) {
		return Integer.compare(pick, num);
	}

	public void setPick(final int pick) {
		this.pick = pick;
	}
}
