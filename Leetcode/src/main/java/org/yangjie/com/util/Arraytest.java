package org.yangjie.com.util;

import java.util.Arrays;

public class Arraytest {

	// public static void main(String[] args) {
	// Integer[] i = { 1, 2, 3, 4, 5, 6, 7 };
	// Object[] remove = remove(i, 0);
	// for (int j = 0; j < remove.length; j++) {
	// System.out.print(remove[j]);
	// }
	// }

	public static void main(String[] args) {
		Integer[] i = { 1, 2, 3, 4, 5, 6, 7 };
		Object[] remove = diyremove(i, 4);
		for (int j = 0; j < remove.length; j++) {
			System.out.print(remove[j]);
		}
	}

	private static Object[] remove(Object[] src, int index) {
		int size = src.length; //
		int numMoved = size - index - 1;// 计算预删除元素右边的元素个数
		Object[] desc = Arrays.copyOf(src, size - 1);// 复制成新数组，去掉尾部元素
		System.arraycopy(src, index + 1, desc, index, numMoved);// 复制的起始位置确定好，将源数组的右边的元素贴到新数组中。
		return desc;// 返回新数组
	}

	/**
	 * 不用系统方法实现删除
	 * 
	 * @param src
	 * @param index
	 * @return
	 */
	private static Object[] diyremove(Object[] src, int index) {
		// 左边数组
		Object[] left = new Object[index];
		// 右边数组
		int numMoved = src.length - index - 1;// right数组长度
		Object[] right = new Object[numMoved];
		// 总数组
		Object[] desc = new Object[numMoved + index];
		// 给左边数组赋值
		int left_index = 0;
		for (int i = 0; i < index; i++) {
			left[left_index] = src[i];
			left_index++;
		}
		// 给右边数组赋值
		int right_index = 0;
		for (int i = index + 1; i < src.length; i++) {
			right[right_index] = src[i];
			right_index++;
		}
		// 数组合并
		// 先合并左边在合并右边
		int count_index = 0;
		for (int i = 0; i < left.length; i++) {
			desc[count_index] = left[i];
			count_index++;
		}
		for (int i = 0; i < right.length; i++) {
			desc[count_index] = right[i];
			count_index++;
		}

		return desc;
	}
}
