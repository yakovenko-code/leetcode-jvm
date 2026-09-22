package code.yakovenko.leetcode.java.easy;

public final class P1678GoalParserInterpretation {

	public String interpret(String command) {
		return command.replace("()", "o").replace("(al)", "al");
	}
}
