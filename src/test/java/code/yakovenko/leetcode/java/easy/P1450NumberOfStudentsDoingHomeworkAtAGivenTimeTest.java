package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1450NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

	private final P1450NumberOfStudentsDoingHomeworkAtAGivenTime solution = new P1450NumberOfStudentsDoingHomeworkAtAGivenTime();

	@Test
	public void example1() {
		assertThat(solution.busyStudent(new int[]{1, 2, 3}, new int[]{3, 2, 7}, 4)).isEqualTo(1);
	}

	@Test
	public void example2() {
		assertThat(solution.busyStudent(new int[]{4}, new int[]{4}, 4)).isEqualTo(1);
	}
}
