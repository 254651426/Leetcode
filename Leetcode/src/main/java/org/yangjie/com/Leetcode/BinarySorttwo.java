package org.yangjie.com.Leetcode;

//leetcode 81搜索旋转排序数组 有重复 并不是顺序的数组
public class BinarySorttwo {

	public static void main(String[] args) {
		int[] array = new int[] { 4, 5, 6, 7, 3, 1, 1, 2, 9, 7 };
		BinarySorttwo sb = new BinarySorttwo();
		System.out.println(sb.search(array, 1));
	}

	public boolean search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return false;
		}
		int start = 0;
		int end = nums.length - 1;
		int mid;
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return true;
			}
			if (nums[start] == nums[mid]) {
				start++;
				continue;
			}
			// 前半部分有序
			if (nums[start] < nums[mid]) {
				// target在前半部分
				if (nums[mid] > target && nums[start] <= target) {
					end = mid - 1;
				} else { // 否则，去后半部分找
					start = mid + 1;
				}
			} else {
				// 后半部分有序
				// target在后半部分
				if (nums[mid] < target && nums[end] >= target) {
					start = mid + 1;
				} else { // 否则，去后半部分找
					end = mid - 1;

				}
			}
		}
		// 一直没找到，返回false
		return false;

	}

}
