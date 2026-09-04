package code.yakovenko.leetcode.java.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CouponCodeValidator {

	public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
		final List<String> electronics = new ArrayList<>();
		final List<String> grocery = new ArrayList<>();
		final List<String> pharmacy = new ArrayList<>();
		final List<String> restaurant = new ArrayList<>();

		for (int i = 0; i < code.length; i++) {
			if (!isActive[i]) continue;
			if (!isValidCode(code[i])) continue;

			switch (businessLine[i]) {
				case "electronics" -> electronics.add(code[i]);
				case "grocery" -> grocery.add(code[i]);
				case "pharmacy" -> pharmacy.add(code[i]);
				case "restaurant" -> restaurant.add(code[i]);
			}
		}

		Collections.sort(electronics);
		Collections.sort(grocery);
		Collections.sort(pharmacy);
		Collections.sort(restaurant);

		final List<String> result = new ArrayList<>(
				electronics.size() + grocery.size() + pharmacy.size() + restaurant.size()
		);

		result.addAll(electronics);
		result.addAll(grocery);
		result.addAll(pharmacy);
		result.addAll(restaurant);

		return result;
	}

	private boolean isValidCode(final String code) {
		if (code.isEmpty()) return false;

		for (int i = 0; i < code.length(); i++) {
			final char character = code.charAt(i);

			if (!(Character.isLetterOrDigit(character) || character == '_')) {
				return false;
			}
		}

		return true;
	}
}
