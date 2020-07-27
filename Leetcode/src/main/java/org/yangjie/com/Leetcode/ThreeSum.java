package org.yangjie.com.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode 15. 三数之和
public class ThreeSum {

	public static void main(String[] args) {
		ThreeSum t = new ThreeSum();
		int num[] = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> l = t.yjthreeSum(num);
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}

	}

	public List<List<Integer>> yjthreeSum(int[] nums) {
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		List<Integer> ls = null;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < nums.length; j++) {

				for (int j2 = j + 1; j2 < nums.length; j2++) {

					if (nums[i] + nums[j] + nums[j2] == 0) {
						ls = new ArrayList<Integer>();
						ls.add(nums[i]);
						ls.add(nums[j]);
						ls.add(nums[j2]);
						l.add(ls);
					}
				}
			}
		}
		return l;
	}

	// 标准答案。
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList();
		int len = nums.length;
		if (nums == null || len < 3)
			return ans;
		Arrays.sort(nums); // 排序
		for (int i = 0; i < len; i++) {
			if (nums[i] > 0)
				break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
			if (i > 0 && nums[i] == nums[i - 1])
				continue; // 去重
			int L = i + 1;
			int R = len - 1;
			while (L < R) {
				int sum = nums[i] + nums[L] + nums[R];
				if (sum == 0) {
					ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
					while (L < R && nums[L] == nums[L + 1])
						L++; // 去重
					while (L < R && nums[R] == nums[R - 1])
						R--; // 去重
					L++;
					R--;
				} else if (sum < 0)
					L++;
				else if (sum > 0)
					R--;
			}
		}
		return ans;
	}

}
