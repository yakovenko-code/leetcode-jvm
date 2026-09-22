package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3019NumberOfChangingKeysTest {

	private final P3019NumberOfChangingKeys solution = new P3019NumberOfChangingKeys();

	@Test
	public void example1() {
		assertThat(solution.countKeyChanges("aAbBcC")).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.countKeyChanges("AaAaAaaA")).isEqualTo(0);
	}
}
