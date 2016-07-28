package com.arp.work;
/**
 * 
 * @author daiyu
 * 交换偶数到奇数前面
 */
public class SwapInt {
	private int[] array = {1,2,3,4,5};
	
	public static void main(String[] args) {
		SwapInt object = new SwapInt();
		object.swap(object.array);
		for (int i = 0; i < object.array.length; i ++)
			System.out.println(object.array[i]);
	}
	
	public void swap(int[] array) {
		if (array.length == 0) return;
		
		int begin = 0;
		int end = array.length - 1;
		
		while(begin < end) {
			while(begin < end && (array[begin] & 0x1) != 0) 
				begin ++;
			while(begin < end && (array[end] & 0x1) == 0)
				end --;
			
			if (begin < end) {
				int temp = array[begin];
				array[begin] = array[end];
				array[end] = temp;
			}
		}
	}
	
}
