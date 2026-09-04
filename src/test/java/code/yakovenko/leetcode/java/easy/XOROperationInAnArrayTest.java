package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class XOROperationInAnArrayTest {

	private final XOROperationInAnArray solution = new XOROperationInAnArray();

	@Test
	public void example1() {
		assertThat(solution.xorOperation(5, 0)).isEqualTo(8);
	}

	@Test
	public void example2() {
		assertThat(solution.xorOperation(4, 3)).isEqualTo(8);
	}
}
