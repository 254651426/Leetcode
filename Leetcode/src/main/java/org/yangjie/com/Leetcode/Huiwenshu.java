package org.yangjie.com.Leetcode;

/**
 * 回文数
 * 
 * @author whIDE
 *
 */
public class Huiwenshu {

	public static void main(String[] args) {
		Huiwenshu h = new Huiwenshu();
		System.out.println(h.isPalindrome(10));
	}

	public boolean isPalindrome(int x) {
		String str = String.valueOf(x);
		char[] c = str.toCharArray();
		String newstr = "";
		for (int i = c.length - 1; i >= 0; i--) {
			newstr += c[i];
		}
		if (newstr.equals(str)) {
			return true;
		}
		return false;
	}

}
