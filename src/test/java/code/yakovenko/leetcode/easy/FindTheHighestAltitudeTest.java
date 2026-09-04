package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindTheHighestAltitudeTest {

	private final FindTheHighestAltitude solution = new FindTheHighestAltitude();

	@Test
	public void example1() {
		assertThat(solution.largestAltitude(new int[]{-5, 1, 5, 0, -7})).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2})).isEqualTo(0);
	}
}
