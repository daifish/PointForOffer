package com.arp.work;

public class FindCommonNode {
	ListNode a, b, c, d, e;
	ListNode h, i, j, k;
	
	private void init() {
		a = new ListNode(1);
		b = new ListNode(2);
		c = new ListNode(3);
		d = new ListNode(6);
		e = new ListNode(7);
		
		h = new ListNode(4);
		i = new ListNode(5);
		j = new ListNode(6);
		k = new ListNode(7);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		h.next = i;
		i.next = j;
		j.next = k;
	}
	
	public ListNode find(ListNode head1, ListNode head2) {
		if (head1 == null || head2 == null) return null;
		
		int length1 = getLength(head1);
		int length2 = getLength(head2);
		
		int dif = length1 - length2;
		
		ListNode longHead = head1;
		ListNode shortHead = head2;
		
		if (dif < 0) {
			longHead = head2;
			shortHead = head1;
			dif = length2 - length1;
		}
		
		for (int i = 0; i < dif; i ++)
			longHead = longHead.next;
		
		while (longHead != null && shortHead != null && longHead.key != shortHead.key) {
			longHead = longHead.next;
			shortHead = shortHead.next;
		}
		
		return longHead;
			
	}
	
	private int getLength(ListNode head) {
		ListNode current = head;
		int result = 0;
		while (current != null) {
			++result;
			current = current.next;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		FindCommonNode test = new FindCommonNode();
		test.init();
		System.out.println(test.find(test.a, test.h).key);
	}
}
