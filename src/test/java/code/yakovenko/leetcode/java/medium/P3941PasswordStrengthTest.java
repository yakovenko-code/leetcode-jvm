package code.yakovenko.leetcode.java.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P3941PasswordStrengthTest {

	private final P3941PasswordStrength solution = new P3941PasswordStrength();

	@Test
	public void example1() {
		assertThat(solution.passwordStrength("aA1!")).isEqualTo(11);
	}

	@Test
	public void example2() {
		assertThat(solution.passwordStrength("bbB11#")).isEqualTo(11);
	}
}
