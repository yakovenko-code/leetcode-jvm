package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CheckIfAWordOccursAsAPrefixOfAnyWordInASentenceTest {

	private final CheckIfAWordOccursAsAPrefixOfAnyWordInASentence solution =
			new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();

	@Test
	public void example1() {
		assertThat(solution.isPrefixOfWord("i love eating burger", "burg")).isEqualTo(4);
	}

	@Test
	public void example2() {
		assertThat(solution.isPrefixOfWord("this problem is an easy problem", "pro"))
				.isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.isPrefixOfWord("i am tired", "you")).isEqualTo(-1);
	}
}
