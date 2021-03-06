package org.yangjie.com.Leetcode;

//leetcode 33搜索旋转排序数组
public class BinarySort {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 6, 7, 3, 1, 2, 9 };
		BinarySort sb = new BinarySort();
		System.out.println(sb.search(array, 3));
	}

	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int start = 0;
		int end = nums.length - 1;
		int mid;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			// 前半部分有序,注意此处用小于等于
			if (nums[start] <= nums[mid]) {
				// target在前半部分
				if (target >= nums[start] && target < nums[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target <= nums[end] && target > nums[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}
			}

		}
		return -1;

	}

}
