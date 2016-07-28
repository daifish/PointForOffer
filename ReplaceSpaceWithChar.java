package com.arp.work;
/**
 * 
 * @author daiyu
 * 将空格替换成指定字符串
 */
public class ReplaceSpaceWithChar {
	
	private String string = "We are happy";
	
	public static void main(String[] args) {
		ReplaceSpaceWithChar object = new ReplaceSpaceWithChar();
		String result = object.replaceSpace(object.string);
		System.out.println(result);
	}
	
	public String replaceSpace(String string) {
		int spaceNum = getSpaceNum(string);
		int indexOfOriginal = string.length();
		int indexOfNew = string.length() + spaceNum * 2;
		char[] stringBuilder = new char[indexOfNew];
		indexOfNew--;
		
		for (int i = indexOfOriginal - 1; i >= 0; i --) {
			if (string.charAt(i) == ' ') {
				stringBuilder[indexOfNew --] = '0';
				stringBuilder[indexOfNew --] = '2';
				stringBuilder[indexOfNew --] = '%';
			} else {
				stringBuilder[indexOfNew --] = string.charAt(i);
			}
		}
		
		return new String(stringBuilder);
	}
	
	private int getSpaceNum(String string) {
		int spaceNum = 0;
		
		for (int i = 0; i < string.length(); i ++) {
			if (string.charAt(i) == ' ')
				spaceNum += 1;
		}
		
		return spaceNum;
	}
}
