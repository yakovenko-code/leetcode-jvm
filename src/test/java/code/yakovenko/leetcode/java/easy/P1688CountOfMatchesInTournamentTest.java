package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1688CountOfMatchesInTournamentTest {

	private final P1688CountOfMatchesInTournament solution = new P1688CountOfMatchesInTournament();

	@Test
	public void example1() {
		assertThat(solution.numberOfMatches(7)).isEqualTo(6);
	}

	@Test
	public void example2() {
		assertThat(solution.numberOfMatches(14)).isEqualTo(13);
	}
}
