package com.arp.work;

/**
 * 
 * @author daiyu 
 * 从横纵方向有序二维数组找出指定target值
 */
public class FindNumFromArray {
	private int[][] array = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
	private int target = 4;

	public static void main(String[] args) {
		FindNumFromArray object = new FindNumFromArray();
		boolean result = object.exist(object.array, object.array.length, object.array[0].length, object.target);
		System.out.println(result);
	}

	public boolean exist(int[][] array, int rows, int columns, int target) {
		if (array != null && rows > 0 && columns > 0) {

			int row = 0;
			int column = columns - 1;

			while (row < rows && column >= 0) {
				if (array[row][column] == target)
					return true;
				else if (array[row][column] > target)
					--column;
				else
					++row;
			}
		}

		return false;
	}
}
