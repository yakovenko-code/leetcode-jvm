package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CircularSentenceTest {

	private final CircularSentence solution = new CircularSentence();

	@Test
	public void example1() {
		assertThat(solution.isCircularSentence("leetcode exercises sound delightful")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.isCircularSentence("eetcode")).isTrue();
	}

	@Test
	public void example3() {
		assertThat(solution.isCircularSentence("Leetcode is cool")).isFalse();
	}
}
