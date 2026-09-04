package code.yakovenko.leetcode.java.easy;

public final class DefangingAnIPAddress {

	public String defangIPaddr(String address) {
		return address.replace(".", "[.]");
	}
}
