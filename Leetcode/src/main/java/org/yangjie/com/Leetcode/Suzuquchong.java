package org.yangjie.com.Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出重复的数组
 * 
 * @author whIDE
 *
 */
public class Suzuquchong {

	public static void main(String[] args) {
		int[] num = { 4, 3, 2, 7, 8, 2, 3, 1 };

		findDuplicates(num);
	}

	// 暴利破解
	public static List<Integer> findDuplicates(int[] num) {
		List l = new ArrayList();
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
					l.add(num[i]);
					continue;
				}
			}
		}
		return l;
	}
}
