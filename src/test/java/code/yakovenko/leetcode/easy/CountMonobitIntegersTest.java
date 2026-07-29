package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountMonobitIntegersTest {

	private final CountMonobitIntegers solution = new CountMonobitIntegers();

	@Test
	public void test1() {
		assertThat(solution.countMonobit(1)).isEqualTo(2);
	}

	@Test
	public void test2() {
		assertThat(solution.countMonobit(4)).isEqualTo(3);
	}
}
