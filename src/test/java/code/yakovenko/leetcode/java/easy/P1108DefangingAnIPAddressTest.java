package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class P1108DefangingAnIPAddressTest {

	private final P1108DefangingAnIPAddress solution = new P1108DefangingAnIPAddress();

	@Test
	public void example1() {
		assertThat(solution.defangIPaddr("1.1.1.1")).isEqualTo("1[.]1[.]1[.]1");
	}

	@Test
	public void example2() {
		assertThat(solution.defangIPaddr("255.100.50.0")).isEqualTo("255[.]100[.]50[.]0");
	}
}
