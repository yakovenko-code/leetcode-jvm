package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfTheSentenceIsPangramTest {

	private final CheckIfTheSentenceIsPangram solution = new CheckIfTheSentenceIsPangram();

	@Test
	public void example1() {
		assertThat(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")).isTrue();
	}

	@Test
	public void example2() {
		assertThat(solution.checkIfPangram("leetcode")).isFalse();
	}
}
