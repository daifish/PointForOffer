package com.arp.work;

public class GetLastKInList {
	ListNode head, second, third, fourth, tail;

	private void init() {
		head = new ListNode(1);
		second = new ListNode(2);
		third = new ListNode(3);
		fourth = new ListNode(4);
		tail = new ListNode(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = tail;
	}
	
	public static void main(String[] args) {
		GetLastKInList object = new GetLastKInList();
		object.init();
		
		if (object.findLastK(object.head, 4) != null)
			System.out.println(object.findLastK(object.head, 4).key);
		else 
			System.out.println("something wrong with your input");
	}
	
	public ListNode findLastK(ListNode head, int k) {
		if (k == 0) return null;
		if (head == null) return null;
		
		ListNode first = head;
		ListNode second = null;
		
		for (int i = 0; i < k - 1; i ++) {
			if (first.next != null)
				first = first.next;
			else
				return null;
		}
		
		second = head;
		while (first.next != null) {
			first = first.next;
			second = second.next;
		}
		
		return second;
	}
}