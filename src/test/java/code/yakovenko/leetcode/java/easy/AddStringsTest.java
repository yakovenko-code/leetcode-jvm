package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class AddStringsTest {

	private final AddStrings solution = new AddStrings();

	@Test
	public void example1() {
		assertThat(solution.addStrings("11", "123")).isEqualTo("134");
	}

	@Test
	public void example2() {
		assertThat(solution.addStrings("456", "77")).isEqualTo("533");
	}

	@Test
	public void example3() {
		assertThat(solution.addStrings("0", "0")).isEqualTo("0");
	}
}
