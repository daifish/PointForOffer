package com.arp.work;

public class PrintMatrix {
	private int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

	public static void main(String[] args) {
		PrintMatrix object = new PrintMatrix();
		object.print(object.matrix, object.matrix.length, object.matrix[0].length);
	}

	public void print(int[][] matrix, int rows, int columns) {
		if (matrix == null || rows <= 0 || columns <= 0)
			return;

		int start = 0;

		while (columns > start * 2 && rows > start * 2) {
			printMatrix(matrix, rows, columns, start);
			++start;
		}
	}

	private void printMatrix(int[][] matrix, int rows, int columns, int start) {
		int endX = columns - 1 - start;
		int endY = rows - 1 - start;

		for (int i = start; i <= endX; i++)
			System.out.println(matrix[start][i]);

		if (endY > start) {
			for (int i = start + 1; i <= endY; i++)
				System.out.println(matrix[i][endY]);
		}

		if (endX > start) {
			for (int i = endX - 1; i >= start; i--)
				System.out.println(matrix[endY][i]);
		}

		if (endY > start + 1 && endX > start + 1)
			for (int i = endY - 1; i >= start + 1; i--)
				System.out.println(matrix[i][start]);
	}

}
