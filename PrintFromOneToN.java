package com.arp.work;
/**
 * 
 * @author daiyu
 * 打印1 到 最大的n位数
 */
public class PrintFromOneToN {
	
	public static void main(String[] args) {
		PrintFromOneToN object = new PrintFromOneToN();
		object.print(2);
	}
	
	public void print(int n) {
		if (n <= 0)
			return;
		
		char[] number = new char[n];
		
		for (int i = 0; i < number.length; i ++)
			number[i] = '0';
		
		while (!increment(number)) {
			printNumber(number);
		}
	}
	
	private boolean increment(char[] number) {
		boolean isOverFlow = false;
		int takeOver = 0;
		
		for (int i = number.length - 1; i >= 0; --i) {
			int nSum = number[i] - '0' + takeOver;
			if (i == number.length - 1)
				nSum++;
			
			if (nSum >= 10) {
				if (i == 0)
					isOverFlow = true;
				else {
					nSum -= 10;
					takeOver = 1;
					number[i] = (char) ('0' + nSum);
				}
			} else {
				number[i] = (char) ('0' + nSum);
				break;
			}
		}
		
		return isOverFlow;
	}
	
	private void printNumber(char[] number) {
		boolean beginWithZero = true;
	
		for (int i = 0; i < number.length; i ++) {
			if (beginWithZero && number[i] != '0')
				beginWithZero = false;
			
			if (!beginWithZero) {
				System.out.print(number[i]);
			}
		}
		
		System.out.println();
	}
}
