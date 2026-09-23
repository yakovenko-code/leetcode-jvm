package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P2586CountTheNumberOfVowelStringsInRangeTest {

	private final P2586CountTheNumberOfVowelStringsInRange solution = new P2586CountTheNumberOfVowelStringsInRange();

	@Test
	public void example1() {
		assertThat(solution.vowelStrings(new String[]{"are", "amy", "u"}, 0, 2)).isEqualTo(2);
	}

	@Test
	public void example2() {
		assertThat(solution.vowelStrings(new String[]{"hey", "aeo", "mu", "ooo", "artro"}, 1, 4))
				.isEqualTo(3);
	}
}
