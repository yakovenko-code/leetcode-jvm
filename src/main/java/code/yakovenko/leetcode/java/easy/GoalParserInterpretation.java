package code.yakovenko.leetcode.java.easy;

public final class GoalParserInterpretation {

	public String interpret(String command) {
		return command.replace("()", "o").replace("(al)", "al");
	}
}
