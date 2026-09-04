package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountOfMatchesInTournamentTest {

	private final CountOfMatchesInTournament solution = new CountOfMatchesInTournament();

	@Test
	public void example1() {
		assertThat(solution.numberOfMatches(7)).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.numberOfMatches(14)).isEqualTo(13);
	}
}
