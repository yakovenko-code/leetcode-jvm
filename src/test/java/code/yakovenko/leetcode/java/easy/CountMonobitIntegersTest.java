package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountMonobitIntegersTest {

	private final CountMonobitIntegers solution = new CountMonobitIntegers();

	@Test
	public void example1() {
		assertThat(solution.countMonobit(1)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.countMonobit(4)).isEqualTo(3);
	}
}
