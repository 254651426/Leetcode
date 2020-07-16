package org.yangjie.com.Leetcode;

//删除排序数组中的重复项 II
public class SolutionTwo {

	public static void main(String[] args) {
		SolutionTwo s = new SolutionTwo();
		int[] num = new int[] { 1, 2, 2, 2, 3, 3, 3, 4, 5 };
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
		if (nums.length <= 2)
			return nums.length;
		int index = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[index - 2])
				nums[index++] = nums[i];
		}
		return index;

	}
}
