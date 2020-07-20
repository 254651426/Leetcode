package org.yangjie.com.Leetcode;

import java.util.Arrays;

//数组合并 88题 将数组2 合并到数组1
public class Shuzumerge {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 0, 0, 0 };
		int[] b = { 2, 5, 6 };
		int[] c = new int[a.length + b.length];
		// 方法二 是将两个数组合并
		// System.arraycopy(a, 0, c, 0, a.length);
		// System.arraycopy(b, 0, c, a.length, b.length);
		// for (int i : c) {
		// System.out.println(i);
		// }

		// 官方
		Shuzumerge s = new Shuzumerge();
		s.merge(a, b.length, b, 0);

		// 方法一
		// int[] object = merge(a, b);
		// for (int i = 0; i < object.length; i++) {
		// System.out.println(object[i]);
		// }

	}

	// 方法一 两个数组合并
	public static int[] merge(int[] a, int[] b) {
		int a_index = 3;
		for (int i = 0; i < b.length; i++) {
			a[a_index] = b[i];
			a_index++;
		}
		return a;
	}

	// 官方方法 nums2 合并到nums1
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, n, nums1, m, nums2.length);
		Arrays.sort(nums1);
		for (int i = 0; i < nums1.length; i++) {
			System.out.println(nums1[i]);
		}
	}

}
