package code.yakovenko.leetcode.java.easy;

public final class P1791FindCenterOfStarGraph {

	public int findCenter(int[][] edges) {
		if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
			return edges[0][0];
		} else {
			return edges[0][1];
		}
	}
}
