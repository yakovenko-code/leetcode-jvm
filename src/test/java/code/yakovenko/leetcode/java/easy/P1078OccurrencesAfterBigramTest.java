package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1078OccurrencesAfterBigramTest {

	private final P1078OccurrencesAfterBigram solution = new P1078OccurrencesAfterBigram();

	@Test
	public void example1() {
		assertThat(solution.findOcurrences("alice is a good girl she is a good student", "a", "good"))
				.isEqualTo(new String[]{"girl", "student"});
	}

	@Test
	public void example2() {
		assertThat(solution.findOcurrences("we will we will rock you", "we", "will"))
				.isEqualTo(new String[]{"we", "rock"});
	}
}
