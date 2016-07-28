package com.arp.work;

public class CombineTwoList {
	ListNode a, b, c, d, e;
	ListNode h, i, j, k, l;

	private void init() {
		a = new ListNode(1);
		b = new ListNode(2);
		c = new ListNode(3);
		d = new ListNode(4);
		e = new ListNode(5);
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		h = new ListNode(1);
		i = new ListNode(3);
		j = new ListNode(4);
		k = new ListNode(6);
		l = new ListNode(8);
		h.next = i;
		i.next = j;
		j.next = k;
		k.next = l;
	}
	
	public ListNode combine(ListNode head1, ListNode head2) {
		if (head1 == null) return head2;
		if (head2 == null) return head1;
		
		ListNode head = null;
		
		if (head1.key <= head2.key) {
			head = head1;
			head.next = combine(head1.next, head2);
		} else {
			head = head2;
			head.next = combine(head1, head2.next);
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		CombineTwoList test = new CombineTwoList();
		test.init();
		ListNode head = test.combine(test.a, test.h);
		while(head != null) {
			System.out.println(head.key);
			head = head.next;
		}
	}
}
