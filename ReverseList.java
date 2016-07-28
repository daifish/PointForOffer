package com.arp.work;

public class ReverseList {
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
		ReverseList object = new ReverseList();
		object.init();
		ListNode head = object.reverse(object.head);
		while(head != null) {
			System.out.println(head.key);
			head = head.next;
		}
	}
	
	public ListNode reverse(ListNode head) {
		ListNode reversedHead = null;
		ListNode pNode = head;
		ListNode pPrev = null;
		
		while (pNode != null) {
			ListNode next = pNode.next;
			
			if (next == null)
				reversedHead = pNode;
			
			pNode.next = pPrev;
			
			pPrev = pNode;
			pNode = next;
		}
		
		return reversedHead;
	}
	
}
