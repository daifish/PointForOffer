package com.arp.work;
/**
 * 
 * @author daiyu
 * 数的多少次方power(base, e)操作
 */
public class Power {
	
	public static void main(String[] args) {
		Power object = new Power();
		System.out.println(object.power(5, 3));
	}
	
	public double power(double base, int num) {
		if (num == 0) return 1;
		if (num == 1) return base;
		
		double result = power(base, num >> 1);//n >> 1 => n / 2
		result *= result;
		if ((num & 0x1) == 1) // & 0x1 => 判断奇偶
			result *= base;
		
		return result;
	}
}
