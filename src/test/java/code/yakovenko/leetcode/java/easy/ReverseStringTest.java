package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseStringTest {

	private final ReverseString solution = new ReverseString();

	@Test
	public void example1() {
		char[] s = new char[]{'h', 'e', 'l', 'l', 'o'};

		solution.reverseString(s);

		assertThat(s).isEqualTo(new char[]{'o', 'l', 'l', 'e', 'h'});
	}

	@Test
	public void example2() {
		char[] s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};

		solution.reverseString(s);

		assertThat(s).isEqualTo(new char[]{'h', 'a', 'n', 'n', 'a', 'H'});
	}
}
