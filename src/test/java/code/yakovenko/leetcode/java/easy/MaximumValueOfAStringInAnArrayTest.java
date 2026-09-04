package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MaximumValueOfAStringInAnArrayTest {

	private final MaximumValueOfAStringInAnArray solution = new MaximumValueOfAStringInAnArray();

	@Test
	public void example1() {
		assertThat(solution.maximumValue(new String[]{"alic3", "bob", "3", "4", "00000"})).isEqualTo(5);
	}

	@Test
	public void example2() {
		assertThat(solution.maximumValue(new String[]{"1", "01", "001", "0001"})).isEqualTo(1);
	}
}
