package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.List;

public final class FizzBuzz {

	public List<String> fizzBuzz(int n) {
		final List<String> list = new ArrayList<>(n);

		for (int i = 1; i <= n; i++) {

			if (i % 15 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(Integer.toString(i));
			}
		}

		return list;
	}
}
