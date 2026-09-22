package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1832CheckIfTheSentenceIsPangramTest {

	private final P1832CheckIfTheSentenceIsPangram solution = new P1832CheckIfTheSentenceIsPangram();

	@Test
	public void example1() {
		assertThat(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkIfPangram("leetcode")).isFalse();
	}
}
