package com.arp.work;

import java.util.Stack;
/**
 * 
 * @author daiyu
 * 带有min的stack
 */
public class StackWithMin {
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		StackWithMin object = new StackWithMin();
		object.push(3);
		object.push(4);
		object.push(5);
		System.out.println(object.min());
	}
	
	public void push(Integer integer) {
		stack1.push(integer);
		
		if (stack2.isEmpty() || stack2.peek() > integer)
			stack2.push(integer);
		else
			stack2.push(stack2.peek());
	}
	
	public void pop() {
		stack1.pop();
		stack2.pop();
	}
	
	public Integer min() {
		return stack2.peek();
	}
	
}
