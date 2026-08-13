package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TypeOfTriangleTest {

	private final TypeOfTriangle solution = new TypeOfTriangle();

	@Test
	public void test1() {
		assertThat(solution.triangleType(new int[]{3, 3, 3})).isEqualTo("equilateral");
	}

	@Test
	public void test2() {
		assertThat(solution.triangleType(new int[]{3, 4, 5})).isEqualTo("scalene");
	}
}
