package com.arp.work;

public class FindMaxSumOfSubArray {
	private int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
	
	public int find(int[] array) {
		if (array == null || array.length <= 0) return 0;
		
		int currentSum = 0;
		int greatSum = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i ++) {
			if (currentSum <= 0)
				currentSum = array[i];
			else
				currentSum += array[i];
			
			if (currentSum > greatSum)
				greatSum = currentSum;
		}
		
		return greatSum;
	}
	
	public static void main(String[] args) {
		FindMaxSumOfSubArray test = new FindMaxSumOfSubArray();
		System.out.println(test.find(test.array));
	}
}
