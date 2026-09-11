package code.yakovenko.leetcode.java.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class TextJustificationTest {

	private final TextJustification solution = new TextJustification();

	@Test
	public void example1() {
		assertThat(
				solution.fullJustify(
						new String[]{"This", "is", "an", "example", "of", "text", "justification."},
						16
				)
		).isEqualTo(
				List.of(
						"This    is    an",
						"example  of text",
						"justification.  "
				)
		);
	}

	@Test
	public void example2() {
		assertThat(
				solution.fullJustify(
						new String[]{"What", "must", "be", "acknowledgment", "shall", "be"},
						16
				)
		).isEqualTo(
				List.of(
						"What   must   be",
						"acknowledgment  ",
						"shall be        "
				)
		);
	}

	@Test
	public void example3() {
		assertThat(
				solution.fullJustify(
						new String[]{
								"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
								"to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"
						},
						20
				)
		).isEqualTo(
				List.of(
						"Science  is  what we",
						"understand      well",
						"enough to explain to",
						"a  computer.  Art is",
						"everything  else  we",
						"do                  "
				)
		);
	}
}
