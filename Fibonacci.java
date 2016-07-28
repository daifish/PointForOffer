package com.arp.work;
/**
 * 
 * @author daiyu
 * fibonacci数列
 */
public class Fibonacci {
	private int[] result = {0,1};
	
	public static void main(String[] args) {
		Fibonacci object = new Fibonacci();
		long result = object.computeFibonacci(5);
		System.out.println(result);
	}
	
	public long computeFibonacci(int n) {
		if (n < 2) {
			return result[n];
		}
		
		long fib1 = 0;
		long fib2 = 1;
		long fibN = 0;
		
		for (int i = 2; i <= n; i ++) {
			fibN = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibN;
		}
		
		return fibN;
	}
	
}
