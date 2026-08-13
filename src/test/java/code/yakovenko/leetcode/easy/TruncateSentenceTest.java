package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class TruncateSentenceTest {

	private final TruncateSentence solution = new TruncateSentence();

	@Test
	public void test1() {
		assertThat(solution.truncateSentence("Hello how are you Contestant", 4))
				.isEqualTo("Hello how are you");
	}

	@Test
	public void test2() {
		assertThat(solution.truncateSentence("What is the solution to this problem", 4))
				.isEqualTo("What is the solution");
	}

	@Test
	public void test3() {
		assertThat(solution.truncateSentence("chopper is not a tanuki", 5))
				.isEqualTo("chopper is not a tanuki");
	}
}
