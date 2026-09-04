package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindClosestPersonTest {

	private final FindClosestPerson solution = new FindClosestPerson();

	@Test
	public void example1() {
		assertThat(solution.findClosest(2, 7, 4)).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.findClosest(2, 5, 6)).isEqualTo(2);
	}

	@Test
	public void example3() {
		assertThat(solution.findClosest(1, 5, 3)).isEqualTo(0);
	}
}
