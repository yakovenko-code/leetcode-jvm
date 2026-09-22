package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3024TypeOfTriangleTest {

	private final P3024TypeOfTriangle solution = new P3024TypeOfTriangle();

	@Test
	public void example1() {
		assertThat(solution.triangleType(new int[]{3, 3, 3})).isEqualTo("equilateral");
	}

	@Test
	public void example2() {
		assertThat(solution.triangleType(new int[]{3, 4, 5})).isEqualTo("scalene");
	}
}
