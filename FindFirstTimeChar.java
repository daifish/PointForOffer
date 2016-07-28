package com.arp.work;

import java.util.LinkedHashMap;
import java.util.Map;


public class FindFirstTimeChar {
	private String string = "abccdeff";
	
	public void find(char[] array) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < array.length; i ++)
			if (map.get(array[i]) == null)
				map.put(array[i], 1);
			else 
				map.put(array[i], map.get(array[i]) + 1);
			
		for (Character ch : map.keySet()) {
			if (map.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		FindFirstTimeChar test = new FindFirstTimeChar();
		test.find(test.string.toCharArray());
	}
}
