package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class NumberOfChangingKeysTest {

	private final NumberOfChangingKeys solution = new NumberOfChangingKeys();

	@Test
	public void example1() {
		assertThat(solution.countKeyChanges("aAbBcC")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.countKeyChanges("AaAaAaaA")).isEqualTo(0);
	}
}
