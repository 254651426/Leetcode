package org.yangjie.com.Leetcode;

//删除排序数组中的重复项
public class Solution {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] num = new int[] { 1, 2, 2, 2, 2, 2, 3, 4, 5 };
		System.out.println(s.removeDuplicates(num));

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}

	/**
	 * 双指针 快慢指针
	 * 
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;
		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;

	}
}
