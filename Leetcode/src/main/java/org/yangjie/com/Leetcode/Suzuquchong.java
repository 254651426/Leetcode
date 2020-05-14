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

		System.out.println(findDuplicates1(num));
	}

	// 暴利破解
	public static List<Integer> findDuplicates(int[] num) {
		List<Integer> l = new ArrayList<Integer>();
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

	/**
	 *  网友答案
	 * @param nums
	 * @return
	 */
	public static List<Integer> findDuplicates1(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; ++i) {
			int index = Math.abs(nums[i]) - 1;    //用数组元素减1 来做索引  反查数组元素
			if (nums[index] < 0) 					//如果为负数则说明重复。
				res.add(Math.abs(index + 1));   
			nums[index] = -nums[index];				//不为负数 就改成负数
		}
		return res;
	}

}
