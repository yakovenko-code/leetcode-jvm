package code.yakovenko.leetcode.java.easy;

public final class P3492MaximumContainersOnAShip {

	public int maxContainers(int n, int w, int maxWeight) {
		return Math.min(n * n, maxWeight / w);
	}
}
