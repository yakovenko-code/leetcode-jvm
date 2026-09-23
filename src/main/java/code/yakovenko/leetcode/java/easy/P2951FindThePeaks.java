package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class P2951FindThePeaks {

	public List<Integer> findPeaks(int[] mountain) {
		final List<Integer> peaks = new ArrayList<>();

		for (int i = 1; i < mountain.length - 1; i++) {
			if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
				peaks.add(i);
				i++;
			}
		}

		return peaks;
	}
}
