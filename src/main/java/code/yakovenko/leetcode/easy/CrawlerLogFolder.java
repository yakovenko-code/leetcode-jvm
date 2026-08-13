package code.yakovenko.leetcode.easy;

public final class CrawlerLogFolder {

	public int minOperations(String[] logs) {
		int operations = 0;

		for (final String log : logs) {
			switch (log) {
				case "../":
					operations = Math.max(0, --operations);
					break;
				case "./":
					break;
				default:
					++operations;
			}
		}

		return operations;
	}
}
