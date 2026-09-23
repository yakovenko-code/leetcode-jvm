package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2951FindThePeaksTest {

	private final P2951FindThePeaks solution = new P2951FindThePeaks();

	@Test
	public void example1() {
		assertThat(solution.findPeaks(new int[]{2, 4, 4})).isEqualTo(List.of());
	}

	@Test
	public void example2() {
		assertThat(solution.findPeaks(new int[]{1, 4, 3, 8, 5})).isEqualTo(List.of(1, 3));
	}
}
