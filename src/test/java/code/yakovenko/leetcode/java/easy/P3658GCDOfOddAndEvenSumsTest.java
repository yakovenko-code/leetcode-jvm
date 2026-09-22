package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3658GCDOfOddAndEvenSumsTest {

	private final P3658GCDOfOddAndEvenSums solution = new P3658GCDOfOddAndEvenSums();

	@Test
	public void example1() {
		assertThat(solution.gcdOfOddEvenSums(4)).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.gcdOfOddEvenSums(5)).isEqualTo(5);
	}
}
