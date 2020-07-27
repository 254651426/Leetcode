package org.yangjie.com.Leetcode;

import java.util.Arrays;

//16. 最接近的三数之和
public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = new int[] { -1, 2, 1, -4 };
		ThreeSumClosest t = new ThreeSumClosest();
		System.out.println(t.threeSumClosest(nums, 2));
	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[2];
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left != right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (Math.abs(sum - target) < Math.abs(result - target))
					result = sum;
				if (sum > target) {
					right--;
				} else {
					left++;
				}
			}
		}
		return result;
	}
}
