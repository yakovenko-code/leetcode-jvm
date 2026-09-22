package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P0917ReverseOnlyLettersTest {

	private final P0917ReverseOnlyLetters solution = new P0917ReverseOnlyLetters();

	@Test
	public void example1() {
		assertThat(solution.reverseOnlyLetters("ab-cd")).isEqualTo("dc-ba");
	}

	@Test
	public void example2() {
		assertThat(solution.reverseOnlyLetters("a-bC-dEf-ghIj")).isEqualTo("j-Ih-gfE-dCba");
	}

	@Test
	public void example3() {
		assertThat(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!")).isEqualTo("Qedo1ct-eeLg=ntse-T!");
	}
}
