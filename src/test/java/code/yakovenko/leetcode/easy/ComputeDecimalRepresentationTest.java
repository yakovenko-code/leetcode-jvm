package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ComputeDecimalRepresentationTest {

	private final ComputeDecimalRepresentation solution = new ComputeDecimalRepresentation();

	@Test
	public void test1() {
		assertThat(solution.decimalRepresentation(537)).isEqualTo(new int[]{500, 30, 7});
	}

	@Test
	public void test2() {
		assertThat(solution.decimalRepresentation(102)).isEqualTo(new int[]{100, 2});
	}

	@Test
	public void test3() {
		assertThat(solution.decimalRepresentation(6)).isEqualTo(new int[]{6});
	}
}
