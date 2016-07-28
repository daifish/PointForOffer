package com.arp.work;

import java.util.Stack;
/**
 * 
 * @author daiyu
 * 利用两个栈实现队列的功能
 */
public class StackConstructQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		StackConstructQueue object = new StackConstructQueue();
		object.append(1);
		object.append(2);
		object.append(3);
		System.out.println(object.delete());
		System.out.println(object.delete());
		System.out.println(object.delete());
	}
	
	public void append(Integer i) {
		stack1.push(i);
	}
	
	public Integer delete() {
		if (stack2.size() <= 0) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.peek());
				stack1.pop();
			}
		}
		
		Integer head = stack2.peek();
		stack2.pop();
		return head;
	}
	
}
