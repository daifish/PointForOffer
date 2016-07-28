package com.arp.work;

public class FindTimeForNum {
	private int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
	
	private int getFirstTarget(int[] array, int target, int begin, int end) {
		if (begin > end) return -1;
		
		int mid = (begin + end) / 2;
		int midValue = array[mid];
		
		if (midValue == target) {
			if ((mid > 0 && array[mid - 1] != target) || mid == 0)
				return mid;
			else
				end = mid - 1;
		} else if (midValue > target){
			end = mid - 1;
		} else {
			begin = mid + 1;
		}
		
		return getFirstTarget(array, target, begin, end);
	}
	
	private int getLastTarget(int[] array, int target, int begin, int end) {
		
		if (begin > end) return -1;
		
		int mid = (begin + end) / 2;
		int midValue = array[mid];
		
		if (midValue == target) {
			if ((mid > 0 && array[mid + 1] != target) || mid == array.length - 1)
				return mid;
			else
				begin = mid + 1;
		} else if (midValue > target) {
			end = mid - 1;
		} else {
			begin = mid + 1;
		}
		
		return getLastTarget(array, target, begin, end);
	}
	
	public static void main(String[] args) {
		FindTimeForNum test = new FindTimeForNum();
		System.out.println(test.getFirstTarget(test.array, 3, 0, test.array.length - 1));
		System.out.println(test.getLastTarget(test.array, 3, 0, test.array.length - 1));
	}
}
