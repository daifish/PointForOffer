package com.arp.work;

import java.util.Stack;

/**
 * 
 * @author daiyu 从尾到头打印链表, 利用栈或者递归
 */
public class PrintListFromEndToStart {
	ListNode head, second, third, tail;

	private void init() {
		head = new ListNode(1);
		second = new ListNode(2);
		third = new ListNode(3);
		tail = new ListNode(4);
		head.next = second;
		second.next = third;
		third.next = tail;
	}

	public static void main(String[] args) {
		PrintListFromEndToStart object = new PrintListFromEndToStart();
		object.init();
		object.printFromEndToStart(object.head);
		object.printFromEndToStartRecuresive(object.head);
	}

	public void printFromEndToStart(ListNode head) {
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode node = head;

		while (node != null) {
			stack.push(node);
			node = node.next;
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.peek().key + " ");
			stack.pop();
		}
		
		System.out.println();
	}

	public void printFromEndToStartRecuresive(ListNode head) {
		if (head != null) {
			if (head.next != null)
				printFromEndToStartRecuresive(head.next);
		}

		System.out.print(head.key + " ");
	}
}
