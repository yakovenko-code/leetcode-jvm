package code.yakovenko.leetcode.java.design;

import java.util.*;

public class RandomizedSet {

	private static final Random random = new Random();

	private final List<Integer> list;
	private final Map<Integer, Integer> map;

	public RandomizedSet() {
		list = new ArrayList<>();
		map = new HashMap<>();
	}

	public boolean insert(int val) {
		if (map.containsKey(val)) {
			return false;
		}

		list.add(val);
		map.put(val, list.size() - 1);

		return true;
	}

	public boolean remove(int val) {
		final Integer index = map.get(val);

		if (index == null) {
			return false;
		}

		final int lastElement = list.getLast();

		list.set(index, lastElement);
		map.replace(lastElement, index);

		list.removeLast();
		map.remove(val);

		return true;
	}

	public int getRandom() {
		return list.get(random.nextInt(list.size()));
	}
}
