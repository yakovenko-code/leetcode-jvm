package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class GoalParserInterpretationTest {

	private final GoalParserInterpretation solution = new GoalParserInterpretation();

	@Test
	public void example1() {
		assertThat(solution.interpret("G()(al)")).isEqualTo("Goal");
	}

	@Test
	public void example2() {
		assertThat(solution.interpret("G()()()()(al)")).isEqualTo("Gooooal");
	}

	@Test
	public void example3() {
		assertThat(solution.interpret("(al)G(al)()()G")).isEqualTo("alGalooG");
	}
}
