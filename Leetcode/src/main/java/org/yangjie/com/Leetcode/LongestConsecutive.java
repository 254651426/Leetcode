package org.yangjie.com.Leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//leetcode 128最长连续序列 
public class LongestConsecutive {

	public static void main(String[] args) {
		int[] num = new int[] { 100, 4, 200, 1, 3, 2, 5 };
		LongestConsecutive l = new LongestConsecutive();
		System.out.println(l.longestConsecutive(num));
	}

	/**
	 * 自己的方法。。
	 * 
	 * @param nums
	 * @return
	 */
	public int yjlongestConsecutive(int[] nums) {
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1] + 1) {
			} else {
				return i;
			}
		}
		return 0;
	}

	
	/**
	 * 官方
	 * @param nums
	 * @return
	 */
	public int longestConsecutive(int[] nums) {
		Set<Integer> num_set = new HashSet<Integer>();
		for (int num : nums) {
			num_set.add(num);
		}

		int longestStreak = 0;

		for (int num : num_set) {
			if (!num_set.contains(num - 1)) {
				int currentNum = num;
				int currentStreak = 1;

				while (num_set.contains(currentNum + 1)) {
					currentNum += 1;
					currentStreak += 1;
				}

				longestStreak = Math.max(longestStreak, currentStreak);
			}
		}

		return longestStreak;
	}

}
