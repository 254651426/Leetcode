package org.yangjie.com.Leetcode;

//leetcode 第一题
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[] { 11, 15, 2, 2, 7 };
		TwoSum t = new TwoSum();
		int[] num = t.twoSum(nums, 9);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		int sum[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					sum[0] = i;
					sum[1] = j;
				}
			}
		}
		return sum;
	}

}
