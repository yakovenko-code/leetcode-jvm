package code.yakovenko.leetcode.java.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public final class FizzBuzzTest {

	private final FizzBuzz solution = new FizzBuzz();

	@Test
	public void example1() {
		assertThat(solution.fizzBuzz(3)).isEqualTo(List.of("1", "2", "Fizz"));
	}

	@Test
	public void example2() {
		assertThat(solution.fizzBuzz(5)).isEqualTo(List.of(
				"1", "2", "Fizz", "4", "Buzz"
		));
	}

	@Test
	public void example3() {
		assertThat(solution.fizzBuzz(15)).isEqualTo(List.of(
				"1", "2", "Fizz", "4", "Buzz",
				"Fizz", "7", "8", "Fizz", "Buzz",
				"11", "Fizz", "13", "14", "FizzBuzz"
		));
	}
}
