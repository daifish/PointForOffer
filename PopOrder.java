package com.arp.work;

import java.util.Stack;
/**
 * 
 * @author daiyu
 * 栈的压入 弹出序列
 */
public class PopOrder {
	private int[] push = { 1, 2, 3, 4, 5 };
	private int[] pop = { 4, 4, 3, 2, 1 };

	public static void main(String[] args) {
		PopOrder object = new PopOrder();
		System.out.println(object.isPopOrder(object.push, object.pop));
	}

	public boolean isPopOrder(int[] push, int[] pop) {
		boolean result = false;
		int length = push.length;

		if (push != null && pop != null) {
			int pPush = 0;
			int pPop = 0;

			Stack<Integer> stack = new Stack<Integer>();

			while (pPush - pPop < length) {
				while (stack.isEmpty() || stack.peek() != pop[pPop]) {
					if (pPush == length)
						break;
					stack.push(push[pPush]);
					pPush++;
				}

				if (stack.isEmpty() || stack.peek() != pop[pPop])
					break;

				stack.pop();
				pPop++;
			}

			if (stack.isEmpty())
				result = true;
		}

		return result;
	}
}
