package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class ToggleLightBulbs {

	public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
		final boolean[] bulbsLight = new boolean[100];
		final List<Integer> result = new ArrayList<>();

		for (final Integer bulb : bulbs) {
			bulbsLight[bulb - 1] = !bulbsLight[bulb - 1];
		}

		for (int i = 0; i < 100; i++) {
			if (bulbsLight[i]) {
				result.add(i + 1);
			}
		}

		return result;
	}
}
