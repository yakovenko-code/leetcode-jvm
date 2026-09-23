package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3798LargestEvenNumberTest {

	private final P3798LargestEvenNumber solution = new P3798LargestEvenNumber();

	@Test
	public void example1() {
		assertThat(solution.largestEven("1112")).isEqualTo("1112");
	}

	@Test
	public void example2() {
		assertThat(solution.largestEven("221")).isEqualTo("22");
	}

	@Test
	public void example3() {
		assertThat(solution.largestEven("1")).isEqualTo("");
	}
}
