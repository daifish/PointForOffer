package com.arp.work;

/**
 * 
 * @author daiyu
 * 旋转数组中的最小值
 */
public class MinNumInSwapArray {
//	private int[] array = {3,4,5,1,2};
	private int[] array = {1,0,1,1,1};
	
	public static void main(String[] args) throws Exception {
		MinNumInSwapArray object = new MinNumInSwapArray();
		int result = object.swapMin(object.array);
		System.out.println(result);
	}
	
	public int swapMin(int[] array) throws Exception {
		if (array == null) 
			throw new Exception("array is null");
		
		int begin = 0;
		int end = array.length - 1;
		int mid = begin;
		
		while (array[begin] >= array[end]) {
			if (end - begin == 1) {
				mid = end;
				break;
			} 
			
			mid = (begin + end) / 2;
			
			if (array[begin] == array[end] && array[begin] == array[mid])
				return minInOrder(array);
			if (array[mid] >= array[begin]) 
				begin = mid;
			else if (array[mid] <= array[end])
				end = mid;
		}
		
		return array[mid];
	}
	
	private int minInOrder(int[] array) {
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i ++) {
			if (array[i] < result)
				result = array[i];
		}
		return result;
	}
	
}
