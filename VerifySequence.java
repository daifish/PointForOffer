package com.arp.work;

/**
 * 
 * @author daiyu 二叉树的后续序列判断
 */
public class VerifySequence {
	private int[] array = { 5, 7, 6, 9, 11, 10, 8 };

	public static void main(String[] args) {
		VerifySequence object = new VerifySequence();
		System.out.println(object.verify(object.array, object.array.length));
	}

	public boolean verify(int[] array, int length) {
		if (array == null || array.length <= 0)
			return false;

		int rootValue = array[array.length - 1];

		int i = 0;

		for (; i < array.length - 1; i++) {
			if (array[i] > rootValue)
				break;
		}

		int j = i;

		for (; j < array.length - 1; j++) {
			if (array[j] < rootValue)
				return false;
		}

		boolean left = true;

		int[] leftArray = new int[i];
		System.arraycopy(array, 0, leftArray, 0, i);
		if (i > 0)
			left = verify(leftArray, i);

		boolean right = true;

		int[] rightArray = new int[length - i - 1];
		System.arraycopy(array, i, rightArray, 0, length - i - 1);
		if (i < length - 1)
			right = verify(rightArray, length - i - 1);

		return left && right;
	}
}
