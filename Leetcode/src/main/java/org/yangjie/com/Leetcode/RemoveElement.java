package org.yangjie.com.Leetcode;

//27. 移除元素 返回数组大小。
public class RemoveElement {

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 2, 2, 3 };
		RemoveElement r = new RemoveElement();
		System.out.println(r.removeElement(nums, 3));

	}

	public int removeElement(int[] nums, int val) {
		int index = 0;
		for (int nums_index : nums) {
			if (nums_index != val) {
				nums[index] = nums_index;
				index++;
			}
		}
		return index;

	}

}
