package com.arp.work;
/**
 * 
 * @author daiyu
 * 2进制中1的个数
 */
public class NumberOfOne {
	public static void main(String[] args) {
		NumberOfOne object = new NumberOfOne();
		System.out.println(object.getNumberOfOne(11));
	}
	
	public int getNumberOfOne(int n) {
		int result = 0;
		while (n != 0) {
			n = (n - 1) & n;
			result ++;
		}
		
		return result;
	}
}
