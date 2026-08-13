package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class HammingDistanceTest {

	private final HammingDistance solution = new HammingDistance();

	@Test
	public void example1() {
		assertThat(solution.hammingDistance(1, 4)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.hammingDistance(3, 1)).isEqualTo(1);
	}
}
