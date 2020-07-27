package org.yangjie.com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

//数组去重
public class Quchong {

	public static void main(String[] args) {
		// 方法一
		// int[] str = { 5, 6, 6, 6, 8, 8, 7, 4 };
		// List<Integer> list = new ArrayList<Integer>();
		// for (int i = 0; i < str.length; i++) {
		// if (!list.contains(str[i])) {
		// list.add(str[i]);
		// }
		// }
		// System.out.println("去除重复后的list集合" + list);

		// 方法二
		Integer[] nums = { 5, 5, 6, 6, 6, 8, 8, 7, 11, 12, 12 };
		HashSet hset = new HashSet(Arrays.asList(nums));
		Iterator i = hset.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
